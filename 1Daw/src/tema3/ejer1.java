package tema3;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numE[];
		numE=new int[10];
		
		//Para pedir numeros enteros para rellenar el array
		
		for(int i=0; i<numE.length ;i++) {
			System.out.println("Numero entero");
			numE[i]=sc.nextInt();
		}
		
		//Un for para pintar el array
		
		for(int i=0; i<numE.length ;i++) {
			System.out.print(numE[i] + " ");
		}

		System.out.println();
		
		//Otro for para pintar el array invertido
		for(int i=numE.length-1; i>=0 ;i--) {
			System.out.print(numE[i] + " ");
		}
		
		sc.close();
	}

}
