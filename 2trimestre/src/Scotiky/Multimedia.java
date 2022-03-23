package Scotiky;

import java.util.ArrayList;
import java.util.Objects;

public class Multimedia implements Reproducible {
	
	//Atributos
	protected String nombre;
	protected double duracion;
	protected ArrayList<Autor>autores;
	protected int reproducciones = 0;
	
	public Multimedia(String nombre, double duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.autores = new ArrayList<>();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the segundos
	 */
	public double getDuracion() {
		return duracion;
	}

	/**
	 * @param segundos the segundos to set
	 */
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	/**
	 * @return the reproducciones
	 */
	public int getReproducciones() {
		return reproducciones;
	}


	/**
	 * @return the autores
	 */
	public ArrayList<Autor> getAutores() {
		return autores;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [nombre=");
		builder.append(nombre);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(duracion, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return Double.doubleToLongBits(duracion) == Double.doubleToLongBits(other.duracion)
				&& Objects.equals(nombre, other.nombre);
	}
	
	public void addAutor(Autor nombre) {
		autores.add(nombre);
	}
	
	public void delAutor(Autor nombre) {
		for (Autor autor : autores) {
			if (autor.equals(nombre)) {
				autores.remove(autor);
			}
		}
	
	}

	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		System.out.println("Reproduciendo " + this.nombre);
		this.reproducciones++;
		
	}
	
	
	

}
