package ejerPrubea;

import java.util.Arrays;
import java.util.Scanner;

public class masterMind {
	
	public static void pintar(int[] longitud) {
		for(int i=0 ;i< longitud.length ;i++) {
			System.out.print(longitud[i] );
		}
		System.out.println();
	}
	
	public static int contarAciertos(String adivina, int longitud[]) {
		int aciertos = 0;
		int vectorS[] = new int[longitud.length];
		
		for(int i=0; i<longitud.length; i++) {
			if (Character.getNumericValue(adivina.charAt(i)) == longitud[i]) {
				aciertos++;
				vectorS[i] = longitud[i];
			} else {
				vectorS[i] = -1;
			}
		}
		
		System.out.println(Arrays.toString(vectorS));
		//System.out.println(Arrays.toString(palabra));
		return aciertos;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int opcion=0;
		int longitud[];
		int rLongitud=0;
		String adivina;
		int cont=0;
		int aciertos=0;
		
		do {
			System.out.println("Menu");
			System.out.println("1. Partida");
			System.out.println("2. Salir");
			opcion = sc.nextInt();
			
			switch (opcion) {
				case 1:{
					
					System.out.println("Longitud de 2 a 9 cifras");
					rLongitud=sc.nextInt();
					longitud=new int[rLongitud];
					
					for(int i=0 ;i<rLongitud ;i++) {
						longitud[i]=(int)(Math.random()*9+1);
						
					}
					pintar(longitud);
					
					
					
					System.out.println("As acertado " + cont);
					do {
						
						System.out.println("Adivina el numero de " + rLongitud + " digitos");
						adivina=sc.nextLine();
						
						aciertos = contarAciertos(adivina, longitud);
						System.out.println("Has acertado "+aciertos);
						if (aciertos == longitud.length) {
							System.out.println("Enhorabuena, acertaste");
							System.out.println();
							return;
						}
						
					} while ( (adivina.compareTo("0") != 0) && (aciertos != longitud.length) );
					
					
				}
			}
			
		}while(opcion!=2);
		
		sc.close();

	}

}
