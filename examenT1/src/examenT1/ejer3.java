package examenT1;

import java.util.Scanner;

public class ejer3 {
	
	/**
	 * Metodo para sumar filas
	 * @param matriz
	 * @param nFila
	 */
	public static void sumaFila(int[][]matriz , int nFila) {
	
		for (int i=0; i<matriz.length; i++) {
			int sumFila=0;
			for (int j=0;  j<matriz[i].length; j++) {
				sumFila+=matriz[i][j];
			}
			System.out.print(sumFila + " ");
		}
		
	}
	
	/**
	 * Metodo para sumar columnas
	 * @param matriz
	 * @param nFila
	 */
	public static void sumaColumnas(int[][]matriz , int nColumna) {
	
		
		for (int i=0; i<matriz.length; i++) {
			int sumColumna=0;
			for (int j=0;  j<matriz[i].length; j++) {
				sumColumna+=matriz[j][i];
			}
			System.out.print(sumColumna + " ");
		}

		
	}
	
	/**
	 * Metodo para sumar Diagonal
	 * @param matriz
	 * @param nFila
	 */
	public static void sumaDiagonal(int[][]matriz) {
		int sumDia=0;
	
		
		for (int i=0; i<matriz.length; i++) {
			
			for (int j=0;  j<matriz[i].length; j++) {
				if(matriz[i]==matriz[j]) {
				sumDia+=matriz[i][j];
				}
				
			}
			
		}
		System.out.print(sumDia + " ");
	

		
	}
	
	/**
	 * Metodo para sacar la media de la matriz
	 * @param matriz
	 * @return
	 */
	public static double mediaMatriz(int[][]matriz) {
		double media=0;
		for (int i=0; i<matriz.length; i++) {
			
			for (int j=0;  j<matriz[i].length; j++) {
				media+=matriz[i][j];
				
			}
			
		}
		return media/matriz.length;
	}
	
	/**
	 * Metodo de la burbuja
	 * @param matriz
	 */
	public static void ordenarBurbuja(int matriz[]) {
        int aux;
        for (int i=matriz.length; i>0; i--) {
            for (int j=0; j<i-1; j++) {
                if (matriz[j]>matriz[j+1]) {
                    aux = matriz[j+1];
                    matriz[j+1]=matriz[j];
                    matriz[j]=aux;

                }
            }
        }
    }
	
	/**
	 * Metodo para odenar filas
	 * @param matriz
	 */
	public static void ordenarFila(int matriz[][]) {
		for(int i=0; i<matriz.length; i++) {
			ordenarBurbuja(matriz[i]);
		}		
	}
	
	
	/**
	 * Metodo para rellenar la matriz
	 * @param matriz
	 * @return
	 */
	public static int [][]rellenarMatriz(int[][] matriz) {
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100) +1;
			}
		}
		return matriz;
		
	}
	
	/**
	 * Metodo para pintar la matriz
	 * @param matriz
	 */
	public static void pintarMatriz(int[][] matriz) {
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0;  j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);

		int[][]matriz=new int[20][20];
		int opcion=0;
		int nFila=0;
		int nColumna=0;
		try {
				
			rellenarMatriz(matriz);
			
			do {
				System.out.println("Menu");
				System.out.println("1. Suma de una fila");
				System.out.println("2. Suma de una columna");
				System.out.println("3. Sumar la diagonal principal y la diagonal inversa");
				System.out.println("4. La media de la matriz");
				System.out.println("5. Pintar la matriz traspuesta");
				System.out.println("6. Ordenar las filas de mayor a menor");
				System.out.println("7. Salir");
		
					opcion=sc.nextInt();
					switch (opcion) {
						case 1:{
							pintarMatriz(matriz);
							
							System.out.println("Numero de la fila que quieres sumar");
							
							nFila=sc.nextInt();
							
							sumaFila(matriz, nFila);
							
							System.out.println();
							break;
														
						}
						
						case 2:{
							pintarMatriz(matriz);
							
							System.out.println("Numero de la columna que quieres sumar");
							
							nColumna=sc.nextInt();
							
							sumaColumnas(matriz, nColumna);
							
							System.out.println();
							break;
						}
						
						case 3:{
							pintarMatriz(matriz);
							System.out.println();
							
							System.out.println("Suma de la diagonal principal");
							sumaDiagonal(matriz);
							
							System.out.println();
							break;
						}
						
						case 4:{
							pintarMatriz(matriz);
							System.out.println();
							
							System.out.println("Media de la matriz");
							
							System.out.println(mediaMatriz(matriz)); 
							
							System.out.println();
							break;
						}
						
						case 5:{
							pintarMatriz(matriz);
							System.out.println();
							break;
						}
						
						case 6:{
							ordenarFila(matriz);
							pintarMatriz(matriz);
							
							break;
							
						}
				
					}
				
			}while(opcion!=7);
			
			sc.close();
		
			
		} catch (Exception e) {
			System.out.println("Opcion incorrecta");
		
		}
			
			
		

	}

}
