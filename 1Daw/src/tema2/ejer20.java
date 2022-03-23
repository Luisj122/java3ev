package tema2;

import java.util.Scanner;

public class ejer20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1=0;
		
		System.out.println("Numero enteros"); 
		n1=sc.nextInt();
		
		//Hacemos un for hasta n1
		for(int i=1;i<=n1;i++) {
			
			//Hacemos un if para saber si es divisible 
			if(n1%i==0) {
			System.out.println(i);
			}
		}
		sc.close();
	}

}
