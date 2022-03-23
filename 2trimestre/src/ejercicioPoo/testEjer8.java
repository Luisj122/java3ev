package ejercicioPoo;

import java.util.Scanner;

public class testEjer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double cantidad;
		String tipo;
		
		System.out.println("Cantidad");
		cantidad = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime el Tipo");
		System.out.println("1. Libras");
		System.out.println("2. Lingotes");
		System.out.println("3. Onzas");
		System.out.println("4. Peso");
		System.out.println("5. Kilogramos");
		System.out.println("6. Gramos");
		tipo =sc.nextLine();
		
		ejer8 peso = new ejer8(cantidad, tipo);
		
		System.out.println(peso);
				
		
		
		System.out.println("Dime el Tipo");
		System.out.println("1. Libras");
		System.out.println("2. Lingotes");
		System.out.println("3. Onzas");
		System.out.println("4. Peso");
		System.out.println("5. Kilogramos");
		System.out.println("6. Gramos");
		tipo =sc.nextLine();
		
	
		peso.getPeso(tipo);
		
		System.out.println(peso);
		
		sc.close();
	}

}
