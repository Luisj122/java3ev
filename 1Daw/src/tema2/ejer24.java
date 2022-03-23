package tema2;

import java.util.Scanner;

public class ejer24 {
	
	public static int mayorDivisor(int n1) {
		int nMayor=0;
		
		for(int i=1; i<n1-1;i++) {
			if(n1%i==0) {
				if(i>nMayor) {
					nMayor=i;
				}
				
			}
			
		}
		return nMayor;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1=0,contI=0, contC=0;
		
		do {
			System.out.println("Numero entero entre 1 y 100");
			n1=sc.nextInt();
			if(n1>100) {
				System.out.println("ERROR. Debe introducir un numero entre 1 y 100");
				contI++;
			}
			if(n1<100) {
			System.out.println(mayorDivisor(n1)); 
			contC++;
			}
		}while(n1!=0 || n1>100);
		
		System.out.println("Numero correctos (dentro de rango) : " + contC);
		System.out.println("Numero incorrectos (fuera de rango) : " + contI);
		sc.close();

	}

}
