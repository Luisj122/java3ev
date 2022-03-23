package Herencia;

public class Comercial extends Empleados {

	//Atributos
	
	protected double comision;

	public Comercial(String Nombre, int Edad, double comision, double salario ) {
		super();
		super.Nombre = Nombre;
		super.Edad = Edad;
		super.Salario = salario;
		this.comision = comision;
	}

	/**
	 * @return the comision
	 */
	public double getcomision() {
		return comision;
	}

	/**
	 * @param comision the comision to set
	 */
	public void setcomision(double comision) {
		this.comision = comision;
	}

	
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comercial [Nombre=");
		builder.append(Nombre);
		builder.append(", Edad=");
		builder.append(Edad);
		builder.append(", Salario=");
		builder.append(Salario);
		builder.append("comision="); 
		builder.append(comision);
		builder.append("]");
		return builder.toString();
	}

	//Metodos
	public boolean plus() {
		if(this.Edad>30 && this.getcomision()>200) {
			return true;
		}
		
		return false;
	}
	
}
