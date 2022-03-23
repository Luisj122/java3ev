package tema2;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n1;
		
		System.out.println("Numero positivo");
		n1 = sc.nextInt();
		
		for(int i=2; i<=n1; i++) {
			if (i%2!=0) {
				
				System.out.println(i);
			}
			
		}
		
		sc.close();

	}

}
