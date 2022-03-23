package tema1;

public class ejer16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double diametro=15.5, radio, altura=42.4,PI=3.14,area, volumen;
		
		radio = diametro/2;
		
		area= 2*PI*radio+(altura+radio);
		
		volumen= PI * Math.pow(radio, 2)*altura;
		
		System.out.println("Area: " + area + " " + "Volumen: " + volumen);
		
		
	}

}
