package Herencia;

public class Repartidor extends Empleados {

	//Atributos
	private String zona;

	public Repartidor(String Nombre, int Edad,int salario, String zona) {
		super();
		super.Nombre = Nombre;
		super.Edad = Edad;
		super.Salario = salario;
		this.zona = zona;
	}

	/**
	 * @return the zona
	 */
	public String getzona() {
		return zona;
	}

	/**
	 * @param zona the zona to set
	 */
	public void setzona(String zona) {
		this.zona = zona;
	}

	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Repartidor [Nombre=");
		builder.append(Nombre);
		builder.append(", Edad=");
		builder.append(Edad);
		builder.append(", Salario=");
		builder.append(Salario);
		builder.append(", Zona= ");
		builder.append(zona);
		builder.append("]");
		return builder.toString();
	}

	public boolean plus() {
		
		if(this.Edad>25 && this.zona=="zona 3") {
			return true;
		}
		
		return false;
	}
	
	
	
	
}
