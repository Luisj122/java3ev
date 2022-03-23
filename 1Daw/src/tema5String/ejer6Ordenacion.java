package tema5String;

public class ejer6Ordenacion {

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
			vector[i]=(int)(Math.random()*100)+1;
		}
	}

	public static void pintarFaltantes (int vector[] ) {

        for (int i = 0; i < vector.length ;i++) {
            for (int j = 0; j < vector.length; j++) {
                if (i<vector[j]) {
                    System.out.print(i+" ");
                    break;
                }else if (i==vector[j]) {
                    break;
                } 

            }


            }
            System.out.println("");
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
		System.out.println("Numero no almacenados");
		
		//Bucle boleano para sacar los numeros que no estan almacenados
		
		boolean encontrado=false;
		for (int i = 0; i < vector.length; i++) {
			encontrado=false;
		    for(int j = 0; j < vector.length; j++) {	
		        if( i == vector[j] )
		           encontrado=true;
		        
		        if(i < vector[j]) {
		        	break;
		        }	
		      }
		    if (!encontrado) 
	            System.out.print(i + " ");
		}
		
	
		
		
		
	}

}
