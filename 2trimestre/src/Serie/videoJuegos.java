package Serie;

public class videoJuegos implements Entregable {
	
	//Atributos
	protected String titulo;
	protected int horasEstimadas;
	protected String genero;
	protected String desarrollador;
	protected boolean prestado;
	
	//Constructores
	public videoJuegos(String titulo, String genero, String desarrollador) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = 100;
		this.genero = genero;
		this.desarrollador = desarrollador;
		this.prestado = false;
	}
	
	public videoJuegos() {
		super();
		this.titulo = "";
		this.horasEstimadas = 100;
		this.genero = "";
		this.desarrollador = "";
		this.prestado = false;
	}

	public videoJuegos(videoJuegos copia) {
		super();
		this.titulo = copia.titulo;
		this.horasEstimadas = copia.horasEstimadas;
		this.genero = copia.genero;
		this.desarrollador = copia.desarrollador;
		this.prestado = copia.prestado;
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
	 * @return the horasEstimadas
	 */
	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	/**
	 * @param horasEstimadas the horasEstimadas to set
	 */
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
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

	/**
	 * @return the desarrollador
	 */
	public String getDesarrollador() {
		return desarrollador;
	}

	/**
	 * @param desarrollador the desarrollador to set
	 */
	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("videoJuegos [titulo=");
		builder.append(titulo);
		builder.append(", horasEstimadas=");
		builder.append(horasEstimadas);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", desarrollador=");
		builder.append(desarrollador);
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
