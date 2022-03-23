package AlquilerPeliculas;

import java.util.Objects;

/**
 * 
 * @author usuario
 *
 */
public class Multimedia {
	
	protected int codigo;
	protected static int sumCodigo=1;
	protected String titulo;
	protected boolean plus;
	protected double precio;
	protected Genero genero;
	
	/**
	 * 
	 * @param titulo de la multimedia
	 * @param plus de la multimedia
	 * @param precio de la multimedia
	 * @param genero de la multimedia
	 */
	public Multimedia(String titulo, boolean plus, double precio, Genero genero) {
		super();
		this.codigo = Multimedia.sumCodigo;
		this.titulo = titulo;
		this.plus = plus;
		this.precio = precio;
		this.genero = genero;
		Multimedia.sumCodigo++;
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
	 * @return the plus
	 */
	public boolean isPlus() {
		return plus;
	}

	/**
	 * @param plus the plus to set
	 */
	public void setPlus(boolean plus) {
		this.plus = plus;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return codigo == other.codigo;
	}

	
	
	
	
}
