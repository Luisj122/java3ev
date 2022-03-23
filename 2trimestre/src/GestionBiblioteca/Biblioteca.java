package GestionBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
	protected ArrayList<Publicacion>publi;
	protected String direccion;
	
	
	public Biblioteca(String direccion) {
		super();
		this.publi = new ArrayList<>();
		this.direccion = direccion;
		
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

	/*
	 * Metodo adquirir añadimos al array publicacion
	 */
	public void adquirirMaterial(Publicacion unaPub) {
		
		publi.add(unaPub);
	}
		
	/**
	 * Metodo buscar por titulo
	 * @param titulo
	 * @return
	 */
	public Publicacion buscar(String titulo) {
		for (Publicacion publica : publi) {
			if(publica.titulo.equals(titulo)) {
				return publica;
			}
		}
		return null;	
	}
	
	/*
	 * Metodo que nos devuelve un array con las publicaciones del autor
	 */
	public ArrayList<Publicacion> buscar(Autor autor) {
		
		ArrayList<Publicacion>pub = new ArrayList<>(); 
		
		for (Publicacion publicacion : publi) {
			for (Autor au : publicacion.getAutores()) {
				if(au.equals(autor)) {
					pub.add(publicacion);
				}
			}
		}
		return pub;
	}

}
