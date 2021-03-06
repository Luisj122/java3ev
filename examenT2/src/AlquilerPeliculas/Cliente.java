package AlquilerPeliculas;

import java.util.Objects;

/**
 * 
 * @author usuario
 *
 */
public class Cliente {
	
	//Atributos
	protected String dni;
	protected String nombre;
	protected String email;
	protected double precioMensual;
	
	
	/**
	 * Constructor
	 * @param dni del cliente
	 * @param nombre del cliente 
	 * @param email del cliente
	 */
	public Cliente(String dni, String nombre, String email) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the precioMensual
	 */
	public double getPrecioMensual() {
		return precioMensual;
	}


	/**
	 * @param precioMensual the precioMensual to set
	 */
	public void setPrecioMensual(double precioMensual) {
		this.precioMensual = precioMensual;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [dni=");
		builder.append(dni);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", email=");
		builder.append(email);
		builder.append(", precioMensual=");
		builder.append(precioMensual);
		builder.append("]");
		return builder.toString();
	}


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
	
	/**
	 * 
	 * @return Es pro 
	 */
	public boolean esPro() {
		return false;
	}
	
	/**
	 * 
	 * @return Precio mensual
	 */
	public  double getPrecioMensuales() {
		return 0;
	}
	
	
	
	

}
