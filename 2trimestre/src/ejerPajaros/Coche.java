package ejerPajaros;

public class Coche {

	//Propiedades
	private String marca;
	private String modelo;
	private String color;
	private double largo;
	private double ancho;
	private double alto;
	
	//Constructor
	
	Coche(){
		this.marca="Rt";
		this.modelo="F1";
		this.color="Verde";
		this.largo=12;
		this.ancho=11;
		this.alto=5;
	}

	public Coche(String marca, String modelo, String color, double largo, double ancho, double alto) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}
	
	
}
