package Forma;

public class Cuadrado extends Rectangulo {

	public Cuadrado(double lado) {
		super(lado, lado);
	}
	
	public Cuadrado(Cuadrado copia) {
		super(copia);
	}

}
