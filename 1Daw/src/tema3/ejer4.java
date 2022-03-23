package tema3;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numE[];
		numE=new int[10];
		

		
		for(int i=0; i<numE.length ;i++) {
			System.out.println("Numero entero");
			numE[i]=sc.nextInt();
			
		}
		
		
		//En el for añadimos el simbolo / para que pinte solo la mitad 
		for(int i=0; i<numE.length/2 ;i++) {
			System.out.print(numE[i] + " ");
			System.out.print(numE[9-i]+ " ");
		}
		
		sc.close();
	}

}
