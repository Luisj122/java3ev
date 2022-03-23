package tema2;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		
		do {
			System.out.println("Numero");
			n1 = sc.nextInt();
			
		}while(n1<1 || n1>10);
		
		sc.close();
	}

}
