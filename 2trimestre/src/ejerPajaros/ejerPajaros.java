package ejerPajaros;

public class ejerPajaros {
	
	private int edad;
	private char color;
	
	
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void printEdad() {
		System.out.println(this.edad);
	}

	public void setColor(char color) {
		this.color = color;
	}



	public void printColor() {
		
		switch (color) {
		case 'v': System.out.println("Verde");break; 
		case 'a': System.out.println("Amarillo");break; 
		case 'g': System.out.println("Gris");break; 
		case 'n': System.out.println("Negro");break; 
		case 'b': System.out.println("Blanco");break; 
		
		default: System.out.println("Color no establecido");
		}
		
	}

}
