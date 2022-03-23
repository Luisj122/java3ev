package ejercicioPoo;

public class ejer2 {
	//Atributo
	
	private int velocidad;
	
	//Constructor
	ejer2(){
		velocidad=0;
	}
	
	//getter
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void acelerar(int mas) {
		velocidad+=mas;
	}
	
	public void frena(int menos) {
		velocidad-=menos;
	}

	
	//To String
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("velocidad=");
		builder.append(velocidad);
		return builder.toString();
	}
	
	

}
