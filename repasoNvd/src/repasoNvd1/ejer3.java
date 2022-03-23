package repasoNvd1;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int opcion=0;
		
		System.out.println("Dia de la semana");
		opcion = sc.nextInt();
		
		if(opcion==1) {
			System.out.println("Lunes");
		}else if(opcion==2) {
			System.out.println("Martes");
		}else if(opcion==3) {
			System.out.println("Miercoles");
		}else if(opcion==4) {
			System.out.println("Jueves");
		}else if(opcion==5) {
			System.out.println("Viernes");
		}else if(opcion==6) {
			System.out.println("Sabado");
		}else if(opcion==7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Dia equivocado");
		}
		
		sc.close();
		
	}

}
