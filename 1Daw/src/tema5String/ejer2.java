package tema5String;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String cadena="";
		String cadIn="";
		String concat="";
		
		System.out.println("1. String");
		
		System.out.println("Introduce una cadena");
		cadena = sc.nextLine();
		
		
		//Invertidmos la cadena
		
		
		
		for(int i=cadena.length()-2 ;i>=0 ;i--) {
			cadIn+=cadena.charAt(i);
					
		}
		
		//Concatenamos la cadena invertida con la cadena original
		concat = cadena.concat(cadIn);
		
		//Pintamos la cadena concatenada
		
		System.out.println(concat);
		System.out.println();
		
		
		System.out.println("2. StringBuffer");
		
		//Creamos la variable String buffer
		
		StringBuffer cadBuffer = new StringBuffer(cadena.substring(0,cadena.length()-1));
		
		StringBuilder imString = new StringBuilder();
		
		imString.append(cadena);
		imString.append(cadBuffer.reverse());
		System.out.print(imString);
		
		
		
		
		
		sc.close();

	}

}
