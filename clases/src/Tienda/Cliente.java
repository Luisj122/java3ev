package Tienda;

import java.util.Objects;

public abstract class Cliente implements Descontable {
	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected String localidad;
	protected String direccion;
	
	//constructor normal
	/**
	 * constructor normal
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param localidad
	 * @param email
	 */
	public Cliente(String nombre, String apellidos, String dni, String localidad, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.localidad = localidad;
		this.direccion = email;
	}
	
	/**
	 * constructor copia
	 * @param otro
	 */
	//constructor copia
	public Cliente(Cliente otro) {
		super();
		this.nombre = otro.nombre;
		this.apellidos = otro.apellidos;
		this.dni = otro.dni;
		this.localidad = otro.localidad;
		this.direccion = otro.direccion;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return direccion;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.direccion = email;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", email=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}
	
	public abstract double descuento();
	
	/**
	 * equals por dni
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
}
