package AlquilerPeliculas;

/**
 * 
 * @author usuario
 *
 */
public class Pelicula extends Multimedia {

	protected int duracion;
	
	
	/**
	 * 
	 * @param titulo de la pelicula
	 * @param plus tipo de la pelicula
	 * @param precio de la pelicula
	 * @param genero de la pelicula
	 * @param duracion de la pelicula
	 */
	public Pelicula(String titulo, boolean plus, double precio,Genero genero, int duracion) {
		super(titulo, plus, precio,genero);
		this.duracion = duracion;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", plus=");
		builder.append(plus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", duracion");
		builder.append(duracion);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	

}
