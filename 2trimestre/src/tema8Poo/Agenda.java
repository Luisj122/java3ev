package tema8Poo;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Contacto> arrayContactos;

	public Agenda() {
		super();
		this.arrayContactos = new ArrayList<>();
	}
	
	
	
	//Metodos
	
	/**
	 * Metodo para comprobar si el contacto existe 
	 * @param c
	 * @return
	 */
	public boolean existeContacto(Contacto c) {
		for (Contacto cnt : arrayContactos) {
			if(cnt.equals(c)) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Metodo para añadir un nuevo contacto
	 * @param c
	 */
	public void addContacto(Contacto c) {
	
			if(existeContacto(c)!=true) {
				arrayContactos.add(c);
			}		
	}
	
	/**
	 * Metodo para listar los contactos
	 */
	public void listarContactos() {
		for (Contacto cnt : arrayContactos) {
			System.out.println(cnt);
		}
	}
	
	/**
	 * Metodo para buscar contactos
	 * @param nombre
	 * @return
	 */
	public String buscarContactos(String nombre) {
		String telefono="";
		for (Contacto cnt : arrayContactos) {
			if(nombre.equals(cnt.getNombre())) {
				telefono = cnt.getTelefono();
			}
		}
		return telefono;
	}
	
	/**
	 * Metodo para eliminar contactos 
	 * @param c
	 */
	public void eliminarContactos(Contacto c) {
		
			if(existeContacto(c)) {
				arrayContactos.remove(c);
				System.out.println("Contacto eliminado");
			}		
	}
	
	

}
