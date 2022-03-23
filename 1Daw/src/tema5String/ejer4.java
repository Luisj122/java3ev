package tema5String;

import java.util.Scanner;

public class ejer4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Scanner sc = new Scanner(System.in);
		String cadena="";
		String encontrada;
		String remplazar="";
		String cadBusca="";

		
		System.out.println("Escribe una cadena");
		cadena = sc.nextLine();
		
		System.out.println("Palabra a buscar");
		cadBusca = sc.nextLine();
		
		
		remplazar=cadena.substring(cadena.indexOf(cadBusca),cadena.indexOf(cadBusca)+cadBusca.length()).toUpperCase();
		
		encontrada = cadena.replace(cadBusca, remplazar);
		
		System.out.println(encontrada);
			
		sc.close();
	}

}
