package tema8Poo;

import java.util.Objects;

public class Libro {

	//Atributos
	private String ISBN;
	private String titulo;
	private String 	autor;
	private int numeroPaginas;
	private double precioCompra;
	private double precioVenta;
	private boolean vendido;
	
	
	public Libro(String titulo, String autor, int numeroPaginas) {
		super();
		ISBN = generarNumero();
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.precioCompra = 0;
		this.precioVenta = 0;
		this.vendido = false;
	}


	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}


	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}


	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}


	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}


	/**
	 * @return the precioVenta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}


	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	/**
	 * @return the vendido
	 */
	public boolean isVendido() {
		return vendido;
	}


	/**
	 * @param vendido the vendido to set
	 */
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}


	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}


	/**
	 * @return the numeroPaginas
	 */
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	
	/**
	 * Metodo para genera un ISBN aleatorio
	 * @return
	 */
	public String generarNumero() {
        StringBuilder telefono = new StringBuilder("6");

        for(int i=0; i<4;i++) {
            telefono.append((char) (Math.random()*(48-57)+57));
        }
        return telefono.toString();
    }


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("El Libro ");
		builder.append(titulo);
		builder.append(" con ISBN ");
		builder.append(ISBN);
		builder.append(" creado por el Autor ");
		builder.append(autor);
		builder.append(" y tiene ");
		builder.append(numeroPaginas);
		builder.append(" páginas");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(ISBN, other.ISBN);
	}
	
	
}
