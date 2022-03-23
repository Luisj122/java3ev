package GestionBiblioteca;

public class Libro extends Publicacion implements Prestable {
	

	//Atributos
	protected boolean prestado;
	
	public Libro(String titulo, int anio, int paginas) {
		super(titulo, anio, paginas);
		// TODO Auto-generated constructor stub
		this.prestado = false;
	}

	@Override
	public void presta() {
		// TODO Auto-generated method stub
		this.prestado=true;
		
	}

	@Override
	public void devuelve() {
		// TODO Auto-generated method stub
		this.prestado=false;
		
	}

	@Override
	public boolean isPrestado() {
		// TODO Auto-generated method stub
		return prestado;
	}

}
