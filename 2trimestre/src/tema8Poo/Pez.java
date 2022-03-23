package tema8Poo;

import java.util.Objects;

public class Pez {
	
	//Atributos 
	
	private String nombre;
	private static int numPeces=0;
	
	//Constructores
	

	public Pez(String nombre) {
		super();
		this.nombre = nombre;
		Pez.numPeces++;
	}
	
	
	/**
	 * Constructor copia
	 * @param copia
	 */
	public Pez(Pez copia) {
		super();
		this.nombre = copia.nombre;
		Pez.numPeces++;
	}
	
	
	
	//Getters y Setters

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	

	/**
	 * @return the numPeces
	 */
	public static int getNumPeces() {
		return numPeces;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	//Clonacion

	@Override
	protected Pez clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		
		//Clonacion profunda
		Pez p = new Pez(this);
		
		return p;
	}


	//Equals
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pez other = (Pez) obj;
		return Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pez [nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	

}
