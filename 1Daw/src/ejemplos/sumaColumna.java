package ejemplos;

import java.util.Scanner;

public class sumaColumna {

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
	 * Metodo para sumar las columnas
	 * @param matriz
	 * @return
	 */
	public static void sumarColumna(int [][]matriz) {
		
		for(int i=0; i<matriz[0].length ;i++) {
			
			int suma=0;
			for(int j=0 ;j<matriz.length ;j++) {
				
					suma+=matriz[j][i];
			}
			System.out.println("Suma columna " + i + " : " + suma + " ");
			
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
		
		sumarColumna(matriz);
				
		sc.close();
		
	}

}
