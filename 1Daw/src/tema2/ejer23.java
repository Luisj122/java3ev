package tema2;

import java.util.Scanner;

public class ejer23 {

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
		int n1;
		
		System.out.println("Numero entero");
		n1 = sc.nextInt();
		
		System.out.println(mayorDivisor(n1));
		
		sc.close();
	}

}
