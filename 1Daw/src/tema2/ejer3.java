package tema2;

import java.util.Locale;
import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int opcion;
		
		System.out.println("Introduce un numero de un solo digito");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1: 
			System.out.println("Uno");
			break;
		
		case 2:
			System.out.println("Dos");
			break;
			
		case 3:
			System.out.println("Tres");
			break;
		
		case 4:
			System.out.println("Cuatro");
			break;
		
		case 5:
			System.out.println("Cinco");
			break;
			
		case 6:
			System.out.println("Seis");
			break;
			
		case 7:
			System.out.println("Siete");
			break;
			
		case 8:
			System.out.println("Ocho");
			break;
			
		case 9:
			System.out.println("Nueve");
			break;
			
		default:
			System.out.println("No es un numero de un solo digito");
		}
		
		sc.close();
	}

}
