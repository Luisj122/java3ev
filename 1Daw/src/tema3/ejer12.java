package tema3;

public class ejer12 {

	public static void pintarMatriz(int[][] matriz) {
		for(int i=0 ;i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[i].length ;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][];
		matriz=new int[8][6];
		for(int i=0; i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[i].length ;j++) {
				if(i==0) {
					matriz[i][j]=1;
				}else if(i==matriz.length-1) {
					matriz[i][j]=1;
				}else if(j==0) {
					matriz[i][j]=1;
				}
				else if(j==matriz[j].length-1) {
					matriz[i][j]=1;
				}else {
					matriz[i][j]=0;
				}
					
			}
		}
		
		pintarMatriz(matriz);
		
	}

}
