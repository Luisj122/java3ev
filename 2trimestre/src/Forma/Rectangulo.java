package Forma;

import java.util.Objects;

public class Rectangulo extends Forma {
	
	public double area() {
		return this.base*this.altura/2;
	}
	
	//Propiedades
	protected double base;
	protected double altura;

	public void dibujar() {
		System.out.println("rectangulo");
	}

	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangulo [base=");
		builder.append(base);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}




	@Override
	public int hashCode() {
		return Objects.hash(altura, base);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		return altura == other.altura && base == other.base;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	
	public Rectangulo(Rectangulo copia) {
		super();
		this.base = copia.base;
		this.altura = copia.altura;
	}
}
