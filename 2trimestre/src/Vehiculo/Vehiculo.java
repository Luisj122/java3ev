package Vehiculo;

public abstract class Vehiculo {
	
	private int peso;
	public final void setPeso(int p) { peso = p; }
	public abstract int getVelocidadActual();

}

//¿Podrá tener descendencia esta clase?
//Si , por la clase abstracta/

// ¿Se pueden sobreescribir todos sus métodos?