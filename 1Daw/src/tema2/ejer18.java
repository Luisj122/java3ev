package tema2;

import java.util.Scanner;

public class ejer18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0, mayor=0, menor=1000000;
		do {
			System.out.println("Numero");
			n1 = sc.nextInt();
			if(mayor<n1 && n1!=0) {
				mayor=n1;
			}
			if(menor>n1 && n1!=0){
				menor=n1;
			}
		}while(n1!=0);
		System.out.println("El numero mayor es " + mayor);
		System.out.println("El numero menor es " + menor);
		
		sc.close();
		

	}

}
