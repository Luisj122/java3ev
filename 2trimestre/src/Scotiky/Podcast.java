package Scotiky;


public class Podcast extends Multimedia implements Reproducible {

	//Atributos
	protected String fecha;
	protected int capitulo;
	
	public Podcast(String nombre, double duracion, String fecha, int capitulo) {
		super(nombre, duracion);
		// TODO Auto-generated constructor stub
		this.fecha = fecha;
		this.capitulo = capitulo;
	}
	
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo " + this.nombre + " " + this.fecha + " " + this.capitulo);		
		
	}
	

}
