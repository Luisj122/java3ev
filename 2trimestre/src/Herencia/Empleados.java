package Herencia;

public class Empleados {
	
	//Atributos 
	protected String Nombre;
	protected int Edad;
	protected double Salario;
	protected final int Plus=300;
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return Edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		Edad = edad;
	}
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return Salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		Salario = salario;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleados [Nombre=");
		builder.append(Nombre);
		builder.append(", Edad=");
		builder.append(Edad);
		builder.append(", Salario=");
		builder.append(Salario);
		builder.append(", Plus=");
		builder.append(Plus);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
