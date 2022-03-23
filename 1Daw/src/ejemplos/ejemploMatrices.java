package ejemplos;

public class ejemploMatrices {
	
	public static void pintarMatriz(int[][] matriz) {
		for(int i=0 ;i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[i].length ;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] llenarMatriz(int[][] matriz) {
		for(int i=0 ;i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[i].length ;j++) {
				matriz[i][j]=(int)(Math.random()*100+1);
			}
		}
		return matriz;
		
	}
	
	public static void main(String[] args) {
		int matriz[][];
		matriz= new int[4][6];
		
		
		
		llenarMatriz(matriz);
		
		pintarMatriz(matriz);
	}

}
