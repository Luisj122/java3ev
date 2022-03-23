package tema3;

import java.util.Scanner;

public class ejer3 {
	
	/**
	 * Un if para sacar el numero mayor
	 * @param numE
	 * @return
	 */
	public static int numMayor(int [] numE) {
		
		int mayor=0;
		
		
		for(int i=0; i<numE.length ;i++) {
					
			if(numE[i]>mayor) {
				mayor=numE[i];
				
			}
			
		}
		return mayor;
		
	}
	
	/**
	 * Un if para sacar el menor 
	 * @param numE
	 * @return
	 */
	
	public static int numMenor(int [] numE) {
		
		int menor=1000000000;
		
		for(int i=0; i<numE.length ;i++) {
	
			if(numE[i]<menor) {
				menor=numE[i];
				
			}
			
		}
		return menor;
		
	}
		
	
	/**
	 * Sumamos los array y lo devolvemos como un double
	 * @param numE
	 * @return
	 */
	public static double nMedia(int [] numE) {
		
		double media=0;
		
		for(int i=0; i<numE.length ;i++) {
	
			media+=numE[i];
			
		}
		return  media/numE.length;
		
	}

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
		
		System.out.println("El mayor : " + numMayor(numE));
		System.out.println("El menor : " + numMenor(numE));
		System.out.println("La media : " + nMedia(numE));
		

		
		
		sc.close();

	}

}
