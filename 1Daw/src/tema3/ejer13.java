package tema3;

import java.util.Scanner;

public class ejer13 {
	
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
	 * Metodo para sumar las filas
	 * @param matriz
	 * @return
	 */
	public static void sumarFila(int [][]matriz) {
		
		for(int i=0; i<matriz.length ;i++) {
			
			int suma=0;
			for(int j=0 ;j<matriz[i].length ;j++) {
				
					suma+=matriz[i][j];
			}
			System.out.println("Suma fila " + i + " : " + suma );
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int matriz[][];
		
		
		//Rellenamos la matriz
		matriz=new int[3][4];
		for(int i=0; i<matriz.length ;i++) {
			
			System.out.println("Fila " + i);
			for(int j=0 ;j<matriz[i].length ;j++) {
				System.out.println("Valor " + j);
				matriz[i][j] =  Integer.parseInt(sc.nextLine());					
			}
		}
	
		pintarMatriz(matriz);
		
		System.out.println();
		
		sumarFila(matriz);
		
		
		
		sc.close();
		
	}

}
