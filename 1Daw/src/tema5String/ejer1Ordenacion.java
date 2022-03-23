package tema5String;

public class ejer1Ordenacion {
	
	/**
	 * Pintar vector
	 * @param vector
	 */
	public static void pintarVector(int[] vector) {
		for(int i=0; i<vector.length ;i++) {
			System.out.print(vector[i] + "  " );
		}
	}
	
	/**
	 * Rellenar vector
	 * @param vector
	 */
	public static void rellenarVector(int[] vector) {
		for(int i=0 ;i<vector.length ;i++) {
			vector[i]=(int)(Math.random()*10)+1;
		}
	}
	
	/**
	 * Metodo de burbuja
	 * @param matriz
	 */
	 public static void ordenar(int matriz[]) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] vector;
		vector = new int[50];
		
		rellenarVector(vector);
		
		pintarVector(vector);
		
		ordenar(vector);
		System.out.println();
		pintarVector(vector);
		
	}

}
