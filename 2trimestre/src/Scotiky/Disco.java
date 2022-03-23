package Scotiky;

import java.util.ArrayList;

public class Disco {
	
	//Atributo
	protected String titulo;
	protected String fecha;
	protected String autorGrupo;	
	protected String discografia;
	protected ArrayList<Cancion>canciones;
	
	public Disco(String titulo, String fecha, String autorGrupo, String discografia) {
		super();
		this.titulo = titulo;
		this.fecha = fecha;
		this.autorGrupo = autorGrupo;
		this.discografia = discografia;
		this.canciones = new ArrayList<>();
	}
	
	public void addCancion(Cancion nombre) {
		nombre.setDisco(this);
		canciones.add(nombre);
	}
	
	public void delCancion(Cancion nombre) {
		canciones.remove(nombre);
	}
	
	public void todasCancion() {
		for (Cancion cancion : canciones) {
			System.out.println(cancion);
		}
	}
	
	public int getDuracion() {
		int sum=0;
			for (Cancion cancion : canciones) {
				 sum += cancion.getDuracion();
			}
		return sum;
	}

}
