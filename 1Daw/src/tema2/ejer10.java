package tema2;

import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1, result = 0,contador=1;
		System.out.println("Numero entero"); 
		
		n1 = sc.nextInt();
		
	
		
		while ((contador<=10)&& (n1!=0 && n1<=10)) {
			result=n1*contador;
			System.out.println(n1 + "x" + contador + " = "+ result);
			contador++;
			
		}
		sc.close();
		
		


	}

}
