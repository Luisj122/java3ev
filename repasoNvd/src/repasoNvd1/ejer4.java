package repasoNvd1;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int hTrabajado=0;
		int sueldo=0;
		
		System.out.println("Horas trabajados");
		hTrabajado = sc.nextInt();
		
		if(hTrabajado<=40) {
			sueldo=12*hTrabajado;
			
		}else if(hTrabajado>=41) {
			sueldo=16*hTrabajado;
			
		}
		System.out.println(sueldo);
		
		sc.close();
		
	}

}
