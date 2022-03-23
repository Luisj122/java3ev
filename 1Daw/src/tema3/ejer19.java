package tema3;

public class ejer19 {
	
	/**
	 * Metodo para pintar el array
	 * @param num
	 */
	public static void pintarMatriz(int[][] matriz) {
		for(int i=0 ;i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[i].length ;j++) {
				System.out.print(matriz[i][j] + "   ");
			
			}
			System.out.println();
		}
	}
	
	/**
	 * Metodo para sumar las columnas
	 * @param matriz
	 * @return 
	 * @return
	 */
	public static void sumarColumna(int [][]matriz) {
	
		for(int i=0; i<matriz[0].length ;i++) {
			
			int suma=0;
			for(int j=0 ;j<matriz.length ;j++) {
				
					suma+=matriz[j][i];
				
			}
			
			System.out.print(suma + "  ");
		}
		
	}
	
	/**
	 * Metodo para sumar las filas y las columnas
	 * @param matriz
	 */
	
	public static void sumaT(int [][]matriz) {
		
		int sumaT=0;
		for(int i=0; i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[0].length ;j++) {
				
					sumaT+=matriz[i][j]; 
			}
		}

		System.out.print(sumaT + "  ");
		
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
				System.out.print(matriz[i][j] + "   ");
				
				suma+=matriz[i][j];
			}	
			System.out.println(suma);
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][];
		matriz = new int [4][5];
		int numA=0;
		
		for(int i=0; i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[0].length ;j++) {
				
				numA=(int)(Math.random()*9+1);
			
				matriz[i][j]=numA;
			}
						
		}
		
		sumarFila(matriz);
		sumarColumna(matriz);
		sumaT(matriz);
		

	}

}
