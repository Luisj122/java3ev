package AlquilerPeliculas;

import java.util.ArrayList;

/**
 * 
 * @author usuario
 *
 */
public class Serie extends Multimedia{

	//Atributos
	protected ArrayList<Temporada>temporadas;
	
	/**
	 * 
	 * @param titulo de la pelicula
	 * @param plus si es plus o no 
	 * @param precio numero precio
	 * @param genero enum
	 */
	public Serie(String titulo, boolean plus, double precio, Genero genero) {
		super(titulo, plus, precio, genero);
		this.temporadas = new ArrayList<>();
	}


	/**
	 * @return the temporadas
	 */
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}

	/**
	 * @param temporadas the temporadas to set
	 */
	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [temporadas=");
		builder.append(temporadas);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", plus=");
		builder.append(plus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * 
	 * @return numero de temporadas
	 */
	public ArrayList<Temporada> getNumeroTemporadas() {
		
		return this.getTemporadas();
	}
	
	/**
	 * 
	 * @param temporada constructor
	 */ 
	public void addTemporadas(Temporada temporada) {
		
		temporada.setSerie(this);
		this.temporadas.add(temporada);
	}
	

}
