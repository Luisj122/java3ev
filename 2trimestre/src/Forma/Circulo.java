package Forma;

import java.util.Objects;

public class Circulo extends Forma {
	
	//Propiedades
	private double radio;
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public Circulo(Circulo copia) {
		super();
		this.radio = copia.radio;
	}
	
	public double area() {
		return 3.14*this.radio;	
	}
	
	public void dibujar() {
		System.out.println("circulo");
	}


	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circulo [radio=");
		builder.append(radio);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(radio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}


	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	
}
