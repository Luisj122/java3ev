package repasoNvd1;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String dia="";
		
		
		System.out.println("Dia de la semana ");
		dia=sc.nextLine();
		
		switch (dia) {
			case "Lunes" : {
				System.out.println("Base de Datos");
				break;
			}
		
			case "Martes":{
				System.out.println("Lenguaje de Marcas");
				break;
			}
			case "Miercoles":{
				System.out.println("Entornos");
				break;
			}
			case "Jueves":{
				System.out.println("Base de Datos");
				break;
			}
			case "Viernes":{
				System.out.println("Programación");
				break;
			}
		
		}
		
		sc.close();
	}

}
