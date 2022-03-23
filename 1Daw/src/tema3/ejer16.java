package tema3;

public class ejer16 {
	
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
	 * Metodo para comprobar si esta repetido
	 * @param matriz
	 * @param numA
	 * @return
	 */
	public static boolean mRepetido(int[][]matriz, int numA) {
		for(int i=0 ;i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[0].length ;j++) {
				if(matriz[i][j]==numA) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][];
		matriz = new int [3][6];
		int numA=0;
		
		
		//Bucle para rellenar numeros aleatorios
		for(int i=0; i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[0].length ;j++) {
				do {
					numA=(int)(Math.random()*100+1);
				}while(mRepetido(matriz, numA));
				matriz[i][j]=numA;
			}
						
		}
		pintarMatriz(matriz);

	}

}
