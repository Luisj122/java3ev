package tema5String;
public class ejer5Ordenacion {
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
			vector[i]=(int)(Math.random()*1000)+1;
		}
	}
	
	/**
	 * Metodo para sacar los 10 numeros mayores
	 * @param vector
	 */
	public static void diezMayores(int[] vector) {
		for(int i=vector.length-1 ; i>vector.length-11 ; i--) {
			System.out.print(vector[i] + "  ");
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
		vector = new int[100];
		
		rellenarVector(vector);
		
		pintarVector(vector);
		
		ordenar(vector);
		System.out.println();
		pintarVector(vector);
		
		System.out.println();
		
		System.out.println("10 Mayores numeros");
		diezMayores(vector);
		
		 
		
		
	}

}
