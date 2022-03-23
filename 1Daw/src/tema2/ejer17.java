package tema2;

import java.util.Scanner;

public class ejer17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2,cont=0;
		
		System.out.println("Primer Numero");
		n1 = sc.nextInt();
		
		
		System.out.println("Segundo Numero");
		n2 = sc.nextInt();
		
		for(int i=n1; i<=n2;i++) {
			if(i%2==0) {
				System.out.println(i);
				cont++;
			}
			
		}
		System.out.println("Hay " + cont + " numero pares ");
		
		sc.close();

	}

}
