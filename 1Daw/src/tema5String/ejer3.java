package tema5String;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Scanner sc = new Scanner(System.in);
		String cadena="";
		String cadBusca="";
		int contador=0;
		
		System.out.println("Escribe una cadena");
		cadena = sc.nextLine();
		
		System.out.println("Palabra a buscar");
		cadBusca = sc.nextLine();
		
		int posicion=0;
		
		while(posicion >=0) {//Hasta que indexOf devuelva -1 o no sea encontrado
			posicion = cadena.indexOf(cadBusca,posicion);
			
			if(posicion >=0) {
				contador++;
				posicion++;
			}
		}
		
		System.out.println(contador);
		

			
		sc.close();
	}

}
