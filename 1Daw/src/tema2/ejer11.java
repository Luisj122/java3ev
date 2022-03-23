package tema2;

import java.util.Scanner;

public class ejer11 {

	
	public static int nDigitos(int n1) {
		
			int cont=0;
			
			while(n1 !=0) {
				n1=n1/10;
				cont++;
			}
			
			return cont;
		
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		
		int n1;
		System.out.println("Numero entero");
		n1 = sc.nextInt();
		
		System.out.println(nDigitos(n1));

		
		sc.close();
	}
}
