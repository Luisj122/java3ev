package tema5String;

public class ejer4Ordenacion {


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
			vector[i]=(int)(Math.random()*50)+1;
		}
	}
	
	
	/**
	 * Numero mayor
	 * @param vector
	 */
	public static void arrayMayor(int[] vector) {
		int mayor=0;
		for (int i= 0; i < vector.length; i++) {
			if (vector[i] > mayor) {
				mayor = vector[i];
			}
		}
		System.out.println("El mayor : " + mayor);
		
	}
	
	/**
	 * Numero menor
	 * @param vector
	 */
	public static void arrayMenor(int[] vector) {
		int menor=10000000;
		
		for (int i= 0; i < vector.length; i++) {
			if (vector[i] <  menor) {
				menor = vector[i];
			}
		}
		
		System.out.println("El menor : " + menor);
		
	}
	
	/**
	 * Numero media
	 * @param vector
	 */
	public static void arrayMedia(int[] vector) {
		double suma = 0;
		
		for (int i= 0; i < vector.length; i++) {
			suma+=vector[i];
		}
		
		System.out.println("La media : " + suma/vector.length);
		
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
		
		System.out.println();
		
		arrayMayor(vector);		
		arrayMenor(vector);
		arrayMedia(vector);
		
		
	}

}
