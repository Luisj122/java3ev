 /**
 * 
 */
package Tienda;

import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;



/**
 * @author alumno
 *
 */
public class pedido {
	protected static int incremento = 1;
	protected int codigo;
	protected LocalDate fecha;
	protected double total; //campo calculado, ni en setter
	protected Cliente cliente;
	protected ArrayList<lineaPedido> Lineas;
	
	public pedido(Cliente cl) {
		pedido.incremento++;
		codigo = pedido.incremento;
		fecha = LocalDate.now();
		cliente = cl;
		Lineas = new ArrayList<>();
		this.total = 0;
	}
	
	public pedido() {
		pedido.incremento++;
		codigo = pedido.incremento;
		fecha = LocalDate.now();
		Lineas = new ArrayList<>();
	}
	
	
	
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * 
	 * @return devuelve el precio total, sumando cada linea pedido y
	 * descontando el descuento
	 */
	public double total() {
		//el total se va actualizando cada vez que añado una nueva lineaPedido
		//con el metodo nuevaLinea
		return total - cliente.descuento();
	}
	
	protected ArrayList<lineaPedido> getLineas() {
		return Lineas;
	}
	public void nuevaLinea (lineaPedido lp) {
		//si hay una lina de pedido ya, con el mismo producto
		//lo que hago es actualizar la cantidad de esa linea del pedido
		boolean encontrado=false;
		for (lineaPedido lp2: Lineas) {
			if (lp.getProducto().equals(lp2.getProducto())) {
				lp2.setCantidad(lp2.getCantidad() + lp2.getCantidad());
				encontrado=true;
				this.total += lp.subtotal();
			}
		}
		
		if (!encontrado) {
			Lineas.add(lp);
			total = lp.subtotal();
		}
		
		
	}
	
	public void toPDF() throws Exception {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage(PDRectangle.A6);
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            // Text
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 32);
            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 52);
            contentStream.showText("Pedido: "+String.valueOf( this.getCodigo()));
            contentStream.endText();
            
            if (cliente != null) {
	            contentStream.beginText();
	            contentStream.setFont(PDType1Font.TIMES_BOLD, 9);
	 	        contentStream.newLineAtOffset( 15, page.getMediaBox().getHeight() - 80);
	 	        contentStream.showText("Cliente: " + cliente.getDni()+", "+cliente.getApellidos()+" "+ cliente.getNombre());
	 	
	 	        contentStream.newLineAtOffset( 0, -15);
	 	        contentStream.showText("Direccion: "+",  "+cliente.getLocalidad());
	 	        contentStream.endText();

            }
            
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 9);
 	        contentStream.newLineAtOffset( 15, page.getMediaBox().getHeight() - 110);
 	       
 	        for (lineaPedido ped : Lineas) {
 	        	contentStream.showText("Nombre del producto: "+ ped.getProducto().getNombre());
 	        	contentStream.showText(", precio: "+ ped.getProducto().getPrecio());
 	        	contentStream.showText(", cantidad: "+ ped.getCantidad());
 	        	 contentStream.newLineAtOffset( 0, -25);
				
			}
 	      
 	       contentStream.endText();
        
            contentStream.close();

            document.save("document.pdf");
        }
	}
	
	@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pedido: ");
        builder.append(codigo);
        builder.append("\n");
        for (lineaPedido lineas: Lineas) {
            builder.append(lineas.getProducto().getCodigo());
            builder.append(" precio: ");
            builder.append(lineas.getProducto().getPrecio());
            builder.append(" cantidad: ");
            builder.append(lineas.getCantidad());
            builder.append(" subtotal: ");
            builder.append(lineas.subtotal());
            builder.append("€ \n");
        }
        builder.append("Total (iva inc.)=");
        builder.append(total());
        return builder.toString();
    }
}
