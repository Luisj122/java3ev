/**
 * 
 */
package Tienda;

/**
 * @author alumno
 *
 */
public class lineaPedido {
	
	protected Producto producto;
	protected int cantidad;
	
	//constructor
	public lineaPedido(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	//metodos
	public double subtotal() {
		return producto.getPrecio() * cantidad * producto.getIva();
	}
	
}
