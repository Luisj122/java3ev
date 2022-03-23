package tema2;

import java.util.Scanner;

public class ejer9 {
	
	public static int potencia(int a) {
		
		int acumulador=1;
		
		for (int i=1; i<=a; i++){
			
			acumulador=i*acumulador;
			
		}
		
		return acumulador;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("Numero entero");
		a = sc.nextInt();
			
		System.out.println(potencia(a));
		
		sc.close();

	}

}
