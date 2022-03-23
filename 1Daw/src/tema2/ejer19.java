package tema2;

import java.util.Scanner;

public class ejer19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=0, sumaT=0,cont=0;
		
		do {
			System.out.println("Numero entero");
			n1 = sc.nextInt();
			if(n1!=-1) {
			sumaT+=n1;
			cont++;
			}
		}while(n1!=-1);
		
		System.out.println("La media es " + sumaT/cont);
		
		sc.close();
	}

}
