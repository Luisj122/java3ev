package ejercicioPoo;

public class ejer6 {
	
	//Propiedades
	
	private Integer numero_I;
	
	//Constructores
	
	ejer6(){
		numero_I=0;
	}

	public ejer6(int numero_I) {
		super();
		this.numero_I = numero_I;
	}
	
	//Metodo
	
	public void suma(int sum) {
		this.numero_I+=sum;
	}
	
	public void resta(int rest) {
		this.numero_I-=rest;
	}

	//Getters y Setters
	public int getValor() {
		return numero_I;
	}
	
	public double getDoble() {
		return this.numero_I*2;
	}
	
	
	public void setNumero(int numero_I) {
		this.numero_I=numero_I;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("numero = ");
		builder.append(numero_I);
		return builder.toString();
	}
	
	
}
	