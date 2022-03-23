package tema8Poo;

import java.util.Objects;

public class Contacto {
	
	//Atributos
	
	private String nombre;
	private String telefono;
	
	public Contacto() {
		super();
		this.nombre = "";
		this.telefono = generarNumero();
	}
	
	public Contacto(String nombre) {
		super();
		this.nombre = nombre;
		this.telefono = generarNumero();
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
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	/**
	 * Metodo para generar numeros aleatorios
	 * @return
	 */
	public String generarNumero() {
        StringBuilder telefono = new StringBuilder("6");

        for(int i=0; i<8;i++) {
            telefono.append((char) (Math.random()*(48-57)+57));
        }
        return telefono.toString();
    }
	
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
		Contacto other = (Contacto) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contacto [nombre=");
		builder.append(nombre);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
