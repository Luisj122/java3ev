package tema2;

import java.util.Scanner;

public class ejer30 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int opcion=0;
		
		do {
			
			System.out.println("Menu");
			System.out.println("1. ");
			System.out.println("2. ");
			System.out.println("3. Salir");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1: {
	
			}
			case 2:{
				
			}
			case 3:{
				System.out.println("salir");
			}
		}
			
		}while(opcion!=3);
		
		sc.close();
	}

}
