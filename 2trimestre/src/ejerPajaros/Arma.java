package ejerPajaros;

public class Arma {
	
	//Propiedades
	
	private String nombre;
	private int damage;
	private String tipo;
	
	

	//Constructores
	Arma(){
		this.nombre="espada";
		this.damage=5;
		this.tipo="fisico";
	}



	public Arma(String nombre, int damage, String tipo) {
		super();
		this.nombre = nombre;
		this.damage = damage;
		this.tipo = tipo;
	}

	//Getters y Setters

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", damage=" + damage + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
	
}
