package tema8Poo;

import java.util.ArrayList;

public class Libreria {
	
	//Atributos
	private ArrayList<Libro>biblioteca;

	//Constructores
	
	public Libreria() {
		super();
		biblioteca = new ArrayList<>(1000);
	}

	//Metodos
	
	/**
	 * Metodo para adquirir añadimos el libro y el precio venta
	 * @param nLibro
	 * @param precioCompra
	 */
	public void adquirir(Libro nLibro, double precioCompra) {
		nLibro.setPrecioCompra(precioCompra);
		biblioteca.add(nLibro);
	}
	
	
	/**
	 * Metodo vender añadimos el precio venta y cambias el estado a true
	 * @param nLibro
	 * @param precioVenta
	 */
	public void vender(Libro nLibro, double precioVenta	) {
		for (Libro lib : biblioteca) {
			if(lib.equals(nLibro)) {
				nLibro.setPrecioVenta(precioVenta);
				nLibro.setVendido(true);
			}
		}
		
	}
		
	/**
	 * Metodo para calcular las ganacias restando el precio compra - el precio venta
	 * @return
	 */
	public double ganancias() {
		double ganancia=0;
		
		for (Libro lib : biblioteca) {
			ganancia += lib.getPrecioCompra() - lib.getPrecioVenta();
		}
		return ganancia;
	}
	
	
	
}
