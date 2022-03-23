package GestionBiblioteca;

public class Revista extends Publicacion {
	
	//Atributo
	protected int numero;

	//Constructor
	public Revista(String titulo, int anio, int paginas, int numero) {
		super(titulo, anio, paginas);
		// TODO Auto-generated constructor stub
		this.numero = numero;
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
	
	

}
