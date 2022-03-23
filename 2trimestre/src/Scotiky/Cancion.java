package Scotiky;

public class Cancion extends Multimedia {
	
	//Atributos
	protected enum genero{
		ROCK, POP, DISCO, HIPHOP, TRAP, SOUL, JAZZ, ELECTRONICA, METAL, CLASICA, LATINO,
	}
	protected int posicion;
	protected Disco disco;
	protected genero gen;

	public Cancion(String nombre, double duracion, genero gen, Disco disco) {
		super(nombre, duracion);
		// TODO Auto-generated constructor stub
		this.disco = disco;
		this.gen = gen;
	}

	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	/**
	 * @return the disco
	 */
	public Disco getDisco() {
		return disco;
	}

	/**
	 * @param disco the disco to set
	 */
	public void setDisco(Disco disco) {
		this.disco = disco;
	}

	/**
	 * @return the gen
	 */
	public genero getGen() {
		return gen;
	}

	/**
	 * @param gen the gen to set
	 */
	public void setGen(genero gen) {
		this.gen = gen;
	}
	
	
	

}
