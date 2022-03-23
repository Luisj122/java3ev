package ejerPrubea;

import java.util.Arrays;

public class ejer5 {

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
	
	
		public static int busqueda(int[]vector, int n) {
			int i=0;
			int j=vector.length-1;
			int mid=0;
				while(i<j){
				 mid=(i+j)/2;
					
					if (vector[mid]==n) {
						return mid;
					}
					if (vector[mid]<n) {
						i=mid+1;
					}else if(vector[mid]>n) {
						j=mid-1;
					}
					
			}
			return -1;
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector[]=new int[10];
		rellenarVector(vector);
		System.out.println();
		pintarVector(vector);
		System.out.println();
		Arrays.sort(vector);
		pintarVector(vector);
		System.out.println();
		System.out.println(busqueda(vector, 5)); 
		System.out.println(Arrays.binarySearch(vector, 5));
		
		

	}

}
