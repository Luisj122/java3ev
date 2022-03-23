package ejerPrubea;

import java.util.Arrays;


public class ejer6Fill {
	
	public static void rellenarValor(int[] array, int valor) {
		
		for(int i=0 ;i<array.length; i++) {
			array[i]=valor;
			}
	}
	
	public static void pintarArray(int[] array) {
		for(int i=0 ;i<array.length; i++) {
			System.out.print(array[i] + " ");
			}
	}
	
	public static void burbujaMejorada(int vector[]) {
        int aux=0;
        for(int i=vector.length; i>0; i--) {
            for(int j=0; j<i-1; j++) {
                if (vector[j] > vector[j+1]) {
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor=100;
		int array[] = new int [10];
		int array2[] = new int[10];
		
		Arrays.fill(array, 100);
		
		for(int i=0 ;i<array.length ;i++) {
			array[i]=array[i]-1;
		}
		
		
		System.out.println(Arrays.toString(array)); 
		Arrays.sort(array);
		System.out.println(Arrays.toString(array)); 
		array2 = Arrays.copyOf(array, 10);
		System.out.println(Arrays.toString(array2));
		
		System.out.println("Metodos");
		rellenarValor(array, valor);
		pintarArray(array);
		burbujaMejorada(array);
		System.out.println(	);
		pintarArray(array);

	}

}
