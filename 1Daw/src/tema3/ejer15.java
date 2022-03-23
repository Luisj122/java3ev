package tema3;

import java.util.Scanner;

public class ejer15 {

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
	 * Metodo para sumar las dos matriz y guardar la suma en la tercer matriz 
	 * @param matrizA
	 * @param matrizB
	 * @param matrizS
	 * @return
	 */
	
	public static int[][] sumarMatriz(int[][] matrizA, int[][] matrizB, int[][] matrizS) {
		for(int i=0 ;i<matrizS.length ;i++) {
			for(int j=0 ;j<matrizS[i].length ;j++) {

					matrizS[i][j]=matrizA[i][j]+matrizB[i][j]; 
			}
			
		}
		return matrizS;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int matrizA[][];
		int matrizB[][];
		int matrizS[][];
		matrizA = new int [3][3];
		matrizB = new int [3][3];
		matrizS = new int [3][3];
		
		for(int i=0; i<matrizA.length ;i++) {
			for(int j=0 ;j<matrizA[i].length ;j++) {
				System.out.println("Matriz " + "A");
				matrizA[i][j] =  Integer.parseInt(sc.nextLine());					
			}
		}
		
		for(int i=0; i<matrizA.length ;i++) {
			for(int j=0 ;j<matrizA[i].length ;j++) {
				System.out.println("Matriz " + "B");
				matrizB[i][j] =  Integer.parseInt(sc.nextLine());					
			}
		}
		pintarMatriz(matrizA);
		System.out.println();
		pintarMatriz(matrizB);
		System.out.println();
		sumarMatriz(matrizA, matrizB, matrizS);
		pintarMatriz(matrizS);
		
		sc.close();
	}

}
