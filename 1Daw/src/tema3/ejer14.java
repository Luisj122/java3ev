package tema3;

import java.util.Scanner;

public class ejer14 {
	
	/**
	 * Metodo para pintar el array
	 * @param num
	 */
	public static void pintarMatriz(int[][] matriz) {
		for(int i=0 ;i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[i].length ;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	/**
	 * Metodo para sacar el mayor, el menor y la media de la matriz
	 * @param num
	 */
	public static void mMatriz(int[][] matriz) {
		int mayor=0;
		int menor=100000000;
		double suma=0;
		for(int i=0 ;i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[i].length ;j++) {
				
				suma+=matriz[i][j]; 
				
				if(matriz[i][j]>mayor) {
					mayor=matriz[i][j];
				}
				if(matriz[i][j]<menor) {
					menor=matriz[i][j];
				}
				
			}
		}
		System.out.println("El mayor : " + mayor);
		System.out.println("El menor : " + menor);
		System.out.println("La media : " + suma/matriz.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int matriz[][];
		
		
		//Rellenamos la matriz
		matriz=new int[5][3];
		for(int i=0; i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[i].length ;j++) {
				System.out.println("Valor " + j);
				matriz[i][j] =  Integer.parseInt(sc.nextLine());					
			}
		}
		
		pintarMatriz(matriz);
		
		System.out.println();
		
		mMatriz(matriz);
		
		sc.close();
	}

}
