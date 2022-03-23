package tema3;

import java.util.Scanner;

public class ejer6 {
	
	public static boolean nOrdenC(int []vector) {
		boolean creciente=false;
	
		
		for(int i=0; i<vector.length-1 ;i++) {
			if(vector[i]<vector[i+1]) {
				return creciente=true;
			}
		}
		return creciente;
				
	}
	
	public static boolean nOrdenD(int []vector) {
		
		boolean decreciente=false;
		
		for(int i=0; i<vector.length-1 ;i++) {
			
			if(vector[i]>vector[i+1]) {
				return decreciente=true;
			}
		}
		return decreciente;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Leer por teclado una serie de 5 números enteros. 
		//El programa debe indicarnos si los números están ordenados de
		//forma creciente, decreciente o si están desordenados. Crea una función para mejorar el código.
		
		Scanner sc = new Scanner(System.in);
		
		int vector[];
		vector=new int [5];

		for(int i=0; i<vector.length ;i++) {
			System.out.println("Numero entero");
			vector[i]=Integer.parseInt(sc.nextLine());
		}
		

		if(nOrdenC(vector)==true && nOrdenD(vector)==false) {
			System.out.println("Es creciente");
		}else if(nOrdenC(vector)==false && nOrdenD(vector)==true){
			System.out.println("Es decreciente");
		}else {
			System.out.println("Esta desordenado");
		}
		
		
		
		sc.close();
	}

}
