package tema5String;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			String cadena="";
			String cadIn="";
			
			System.out.println("1. String");
			System.out.println("Introduce una cadena");
			cadena = sc.nextLine();
			
			System.out.println(cadena);
			
			for(int i=cadena.length()-1 ;i>=0 ;i--) {
				cadIn+=cadena.charAt(i);
						
			}
			System.out.println(cadIn);
			
			System.out.println();
			
			
			System.out.println("2. StringBuffer");
			
			System.out.println(cadena);
			StringBuffer cadBuffer=new StringBuffer(cadena);	
			System.out.println(cadBuffer.reverse());
			
			sc.close();
			
	}

}
