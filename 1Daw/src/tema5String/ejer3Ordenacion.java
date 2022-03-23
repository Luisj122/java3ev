package tema5String;

public class ejer3Ordenacion {
		
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
		 * Rellenar vectores
		 * @param vector
		 */
		public static void rellenarVector(int[] vector) {
			for(int i=0 ;i<vector.length ;i++) {
				vector[i]=(int)(Math.random()*10)+1;
			}
		}
		
		public static void rellenarVectores(int[] vectorC, int[] vectorA, int[] vectorB) {
			for(int i=0 ; i<vectorA.length ;i++) {
				vectorC[i]=vectorA[i];
				vectorC[i+5]=+vectorB[i];
			}
		}
		
		/**
		 * Metodo de la burbuja
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
			int [] vectorA;
			int [] vectorB;
			int [] vectorC;
			vectorA = new int[5];
			vectorB = new int[5]; 
			vectorC = new int[10]; 
			
			rellenarVector(vectorA);
			rellenarVector(vectorB);
			
			
			rellenarVectores(vectorC, vectorA, vectorB);
			pintarVector(vectorC);
			ordenar(vectorC);
			
			System.out.println();
		
			pintarVector(vectorC);
			

		}



}
