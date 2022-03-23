 package tema5String;

import java.util.Scanner;

public class ejer6 {
	
	public static Boolean comprobarPalindromo(String cadena) {
		String acuPalindromo = "";
		Boolean palindromo = false;
		
		for(int i=cadena.length()-1 ;i>=0 ;i-- ) {
			acuPalindromo = acuPalindromo + (cadena.charAt(i));
		}

		
		if(cadena.equals(acuPalindromo)) {
			palindromo=true;
		}else {
			palindromo=false;
		}
		return palindromo;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		String cadena = "";
		
		System.out.println("Cadena");
		cadena = sc.nextLine();
		
		if(comprobarPalindromo(cadena)==true) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
		
		sc.close();
		
	}

}
