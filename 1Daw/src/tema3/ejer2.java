package tema3;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numE[];
		int mayor=0, menor=1000000;
		double media=0;
		numE=new int[10];
		
		//Para pedir numeros enteros para rellenar el array
		
		for(int i=0; i<numE.length ;i++) {
			System.out.println("Numero entero");
			numE[i]=sc.nextInt();
			
			//Sumamos el array 
			
			media+=numE[i];
			
			//Dos if para sacar el mayor y el menor 
			if(numE[i]>mayor) {
				mayor=numE[i];
				
			}
			
			if(numE[i]<menor) {
				menor=numE[i];
				
			}
		}
		
		System.out.println("El mayor : " + mayor);
		System.out.println("El menor : " + menor);
		System.out.println("La media : " + media/numE.length);
		
		

		
		
		sc.close();
	}

}
