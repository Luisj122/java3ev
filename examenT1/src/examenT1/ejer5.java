package examenT1;

import java.util.Arrays;

public class ejer5 {
	
	/**
	 * Metodo para comprobar el tiro de los dados
	 * @param vector
	 */
	public static void comprobarPoker(int[]vector) {
		
		
		for (int i=0; i<vector.length; i++) {
			if (vector[i]==vector[0] && vector[i]==vector[2] && vector[i]==vector[3] && vector[i]==vector[4]) {
				
				System.out.println();
				System.out.println("Poker real");
				System.out.println(vector[i]);
				break;
				
			}else if ((vector[i]==vector[0] && vector[i]==vector[1] && vector[i]==vector[2] 
					|| vector[i]==vector[1] && vector[i]==vector[2] && vector[i]==vector[3] 
					|| vector[i]==vector[2] && vector[i]==vector[3] && vector[i]==vector[4])) {
			
				
				System.out.println();
				System.out.println("Piernas");
				System.out.println(vector[i]);
				break;
				
			}else if (vector[i]==vector[0] && vector[i]==vector[1] && vector[i]==vector[2] && vector[i]==vector[3] 
					|| vector[i]==vector[1] && vector[i]==vector[2] && vector[i]==vector[3] && vector[i]==vector[4]) {
			
				
				System.out.println();
				System.out.println("Poker");
				System.out.println(vector[i]);
				break;
				
			}else if ((vector[i]==vector[0] && vector[i]==vector[1] && vector[i]==vector[2] && (!(vector[i]==vector[3] && vector[i]==vector[4]))
					||  vector[i]==vector[4] && vector[i]==vector[3] && vector[i]==vector[2] && (!(vector[i]==vector[1] && vector[i]==vector[0])) )) {
			
				
				System.out.println();
				System.out.println("Full");
	
				break;
				
			}else if (!(vector[i]==vector[0] && vector[i]==vector[1]) && 
					!(vector[i]==vector[2] && vector[i]==vector[3] ) && 
					vector[i]==vector[3] && vector[i]==vector[4] ) {
			
				
				System.out.println();
				System.out.println("Pares dobles");
	
				break;
				
			}else if (vector[0]==1 && vector[1]==2 && vector[2]==3 && vector[3]==4 && vector[4]==5 ) {
			
				
				System.out.println();
				System.out.println("Escalera menor");
	
				break;
				
			}else if (vector[0]==2 && vector[1]==3 && vector[2]==4 && vector[3]==5 && vector[4]==6 ) {
			
				
				System.out.println();
				System.out.println("Escalera mayor");
	
				break;
				
			}
			
			
		}
	
		
		
		
	}
	
	/**
	 * Metodo para rellenar el vector
	 * @param vector
	 * @return
	 */
	public static int []rellenarVector(int[] vector) {
		
		for (int i=0; i<vector.length; i++) {
			vector[i] = (int)(Math.random()*6)+1;
		}
		return vector;
		
	}
	
	/**
	 * Metodo para pintar el vector
	 * @param vector
	 */
	
	public static void pintarVector(int[] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+ " ");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []vector=new int[5];
		
		//Array para ordenar el vector
		Arrays.sort(rellenarVector(vector));

		pintarVector(vector);
		
		comprobarPoker(vector);
		
	}

}
