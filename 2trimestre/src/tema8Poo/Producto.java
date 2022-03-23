package tema8Poo;

import java.util.Objects;

public class Producto {

	//Atributos
	
	private int id;
	private String descripcion;
	private double precioUnitario;
	private int unidadesDisponibles;
	private int stockMaximo;
	private double descuento;
	
	
	public Producto() {
		super();
		this.id = 0;
		this.descripcion = "";
		this.precioUnitario = 0;
		this.unidadesDisponibles = 0;
		this.stockMaximo = 0;
		this.descuento = 0;
	}
	
	public Producto(int id, String descripcion, double precioUnitario, 
			int unidadesDisponibles, int stockMaximo, double descuento) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.unidadesDisponibles = unidadesDisponibles;
		this.stockMaximo = stockMaximo;
		this.descuento = descuento/100;
	}
	
	
	//Getters y Setters

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the descuento
	 */
	public double getDescuento() {
		return descuento;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param precioUnitario the precioUnitario to set
	 */
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	/**
	 * @param unidadesDisponibles the unidadesDisponibles to set
	 */
	public void setUnidadesDisponibles(int unidadesDisponibles) {
		this.unidadesDisponibles = unidadesDisponibles;
	}

	/**
	 * @param stockMaximo the stockMaximo to set
	 */
	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}



	/**
	 * @return the precioUnitario
	 */
	public double getPrecioUnitario() {
		return precioUnitario;
	}

	/**
	 * @return the unidadesDisponibles
	 */
	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}

	/**
	 * @return the stockMaximo
	 */
	public int getStockMaximo() {
		return stockMaximo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [descripcion=");
		builder.append(descripcion);
		builder.append(", precioUnitario=");
		builder.append(precioUnitario);
		builder.append(", unidadesDisponibles=");
		builder.append(unidadesDisponibles);
		builder.append(", stockMaximo=");
		builder.append(stockMaximo);
		builder.append(", descuento=");
		builder.append(descuento);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
	//Metodo 
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return id == other.id;
	}
	
	
/**
 * 
 * @param cantidad
 * @return
 */
	public boolean vender(int cantidad) {
		
		if(cantidad <0) {
			if(this.unidadesDisponibles >= cantidad) {
				this.unidadesDisponibles-=cantidad;
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
			
	}
	
	
	/**
	 * Scamos la diferencia entre stockMaximo y unidadesDisponi
	 * @return
	 */
	public int reponer() {
		int cantidad=0;
		cantidad = this.stockMaximo - this.unidadesDisponibles;
		this.unidadesDisponibles = this.stockMaximo;
		
		return cantidad;
		
		
	}
	

}
