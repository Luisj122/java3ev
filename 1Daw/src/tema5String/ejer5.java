package tema5String;

import java.util.Scanner;

public class ejer5 {


	
	
public static void contarCadena(String cadena) {
		
		int contadorVocales=0;
		int contadorConsonantes=0;
		int contadorEspacios=0;
		for(int i=0; i<cadena.length(); i++) {
			char cararacter = cadena.toLowerCase().charAt(i);
			
			switch (cararacter) {
			case 'a','e','i','o','u': {
				contadorVocales++;
				break;
					}
			case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', '�', 'p', 'q', 'r', 
				 's', 't', 'v', 'w', 'x', 'y', 'z': {
				contadorConsonantes++;
				break;
					}
			case ' ':{
				contadorEspacios++;
				break;
			}
				}
			}
		System.out.println("Numero de vocales " + contadorVocales);
		System.out.println("Numero de consonantes " + contadorConsonantes);
		System.out.println("Numero de espacios " + contadorEspacios);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String cadena="";
		
		System.out.println("Escribe una cadena");
		cadena = sc.nextLine();
		
		contarCadena(cadena);
				
		
		sc.close();

	}
}
