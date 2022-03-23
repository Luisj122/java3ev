package AlquilerPeliculas;

import java.util.ArrayList;

/**
 * 
 * @author usuario
 *Temporada
 */
public class Temporada {
	

	protected int numero;
	protected ArrayList<Episodio>episodios;
	protected Serie serie;
	
	/**
	 * 
	 * @param numero constructor de temporada
	 * 
	 * 	 */
	public Temporada(int numero) {
		super();
		this.numero = numero;
		this.episodios = new ArrayList<>();
	}

	

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}



	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}



	/**
	 * @return the episodios
	 */
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}



	/**
	 * @param episodios the episodios to set
	 */
	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}



	/**
	 * @return the serie
	 */
	public Serie getSerie() {
		return serie;
	}



	/**
	 * @param serie the serie to set
	 */
	public void setSerie(Serie serie) {
		this.serie = serie;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Temporada [numero=");
		builder.append(numero);
		builder.append(", episodios=");
		builder.append(episodios);
		builder.append(", serie=");
		builder.append(serie);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * 
	 * @param episodio añadir
	 */
	public void addEpisodio(Episodio episodio) {
		episodio.setTemporada(this);
		this.episodios.add(episodio);

	}
	
	/**
	 * 
	 * @param episodio borrar
	 */
	public void delEpisodio(Episodio episodio) {
		episodio.setTemporada(this);
		this.episodios.remove(episodio);
	}
	
	
	
	

}
