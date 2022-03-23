package repasoNvd1;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int hora=0;
		
		System.out.println("Dime la Hora");
		hora=Integer.parseInt(sc.nextLine());
		
		if(hora >= 6 && hora <=12) {
			System.out.println("Buenos dias");
		}
		
		else if(hora >= 13 && hora <=20) {
			System.out.println("Buenas tardes");
		}
		
		else if(hora >= 1 && hora <=5 || hora >= 21 && hora <=24){
			System.out.println("Buenas noches");
		}
		
		sc.close();
	
	}

}
