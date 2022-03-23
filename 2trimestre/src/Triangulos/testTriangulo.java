package Triangulos;

public class testTriangulo {

	public static void main(String[] args) {
		
		//Equilatero
		try {
			Equilatero e1 = new Equilatero(2, 2, 2);
			System.out.println(e1.area());
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		//Escaleno
		try {
			Escaleno escaleno1 = new Escaleno(2, 3, 4);
			System.out.println(escaleno1.area());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		//Isosceles
		try {
			Isosceles isosceles1 = new Isosceles(2, 2, 4);
			System.out.println(isosceles1.area());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		//Triangulo Rectangulo
		try {
			trianguloRectangulo tr1 = new trianguloRectangulo(2, 3, 2);
			System.out.println(tr1.area());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
