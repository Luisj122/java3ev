package Forma;

public class testFoma {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(5);
		Rectangulo r1 = new Rectangulo(20,10);
		Triangulo t1 = new Triangulo(5,5);
		
		System.out.println(c1.area());
		System.out.println(r1.area());
		System.out.println(t1.area());
		
		

	}

}
