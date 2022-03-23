package Sorteo;

public abstract class Sorteo {
	
	protected int posibilidades;
	public abstract int lanzar();
	public Sorteo() {
		super();
		this.posibilidades = 6;
	}
	
	
	
}
