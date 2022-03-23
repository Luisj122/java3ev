package Serie;

public class Serie implements Entregable {
	
	//Atributos
	protected String titulo;
	protected int numTemporada;
	protected String genero;
	protected boolean prestado;
	
	
	//Constructores
	public Serie(String titulo, String genero, int numTemporada) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.numTemporada = numTemporada;
		this.prestado = false;
	}
	
	public Serie() {
		super();
		this.titulo = "";
		this.genero = "";
		this.numTemporada = 3;
		this.prestado = false;
	}
	
	public Serie(Serie copia) {
		super();
		this.titulo = copia.titulo;
		this.genero = copia.genero;
		this.numTemporada = copia.numTemporada;
		this.prestado = false;
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
	 * @return the numTemporada
	 */
	public int getNumTemporada() {
		return numTemporada;
	}

	/**
	 * @param numTemporada the numTemporada to set
	 */
	public void setNumTemporada(int numTemporada) {
		this.numTemporada = numTemporada;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [titulo=");
		builder.append(titulo);
		builder.append(", numTemporada=");
		builder.append(numTemporada);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", prestado=");
		builder.append(prestado);
		builder.append("]");
		return builder.toString();
	}

	
	//Interfaz
	@Override
	public void entregar() {
		this.prestado=true;
		
	}

	@Override
	public void devolver() {
		this.prestado=false;
		
	}

	@Override
	public boolean isPrestado() {
		return prestado;
	}
	
	
	
}
