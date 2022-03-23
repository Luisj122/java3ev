package examenT1;


import java.util.Scanner;

public class ejer2 {
	
	public static void convertirESaEN(String[]es, String[]en, String palabra) {
		for (int i = 0; i < es.length; i++) {
			if(palabra.equals(es[0])) {
				System.out.println(en[0].toUpperCase());
				break;
			}
			if(palabra.equals(es[1])) {
				System.out.println(en[1].toUpperCase());
				break;
			}
			if(palabra.equals(es[2])) {
				System.out.println(en[2].toUpperCase());
				break;
			}if(palabra.equals(es[3])) {
				System.out.println(en[3].toUpperCase());
				break;
			}if(palabra.equals(es[4])) {
				System.out.println(en[4].toUpperCase());
				break;
			}if(palabra.equals(es[5])) {
				System.out.println(en[5].toUpperCase());
				break;
			}else {
				System.out.println("Palabra no encontrada");
				break;
			}
		}
	}
	
	public static void convertirENaES(String[]es, String[]en, String palabra) {
		for (int i = 0; i < es.length; i++) {
			if(palabra.equals(en[0])) {
				System.out.println(es[0]);
				break;
			}
			if(palabra.equals(en[1])) {
				System.out.println(es[1]);
				break;
			}
			if(palabra.equals(en[2])) {
				System.out.println(es[2]);
				break;
			}if(palabra.equals(en[3])) {
				System.out.println(es[3].toUpperCase());
				break;
			}if(palabra.equals(en[4])) {
				System.out.println(es[4].toUpperCase());
				break;
			}
			if(palabra.equals(en[5])) {
				System.out.println(es[5].toUpperCase());
				break;
			}else {
				System.out.println("Palabra no encontrada");
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[]es= {"El", "cielo", "azul", "tu", "para" };
		String[]en= {"The", "sky", "blue", "you", "for"};
		
		int opcion=0;
		String palabraEs="";
		String palabraEn="";
		
		
		
		do {
			System.out.println("Menu");
			System.out.println("1. ES a EN");
			System.out.println("2. EN a ES");
			System.out.println("3. Salir");
			opcion=Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1:{
				System.out.println("Palabra a convertir de Es a En");
				palabraEs=sc.nextLine();
				
				convertirESaEN(es, en, palabraEs);
				
				break;
			}
			
			case 2:{
				System.out.println("Palabra a convertir de En a Es");
				palabraEn=sc.nextLine();
				
				convertirENaES(es, en, palabraEn);
			}
		}
		} while (opcion!=3);
		
		sc.close();
		
	}
}