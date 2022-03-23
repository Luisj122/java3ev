package ejemplos;

public class ejemplosArrays {
	
	
/**
 * Pinta los elementos de un vector
 * @param num
 * @return
 */
	public static int sumarImpares(int num[]) {
		int suma=0;
		
		
		for(int i=1; i<num.length; i+=2) {
			suma +=  num[i];
		}
		return suma;
	}
	
	
	/**
	 * Dice si un numero es primo
	 * @param num
	 * @return
	 */
	public static boolean esPrimo(int num) {
		boolean esPrimo=false;
		
		for(int i=2; i<=num-1 ;i++) {
			if(num%i==0) {
				esPrimo=true;
			}
				
		}
		return esPrimo;
	}
	
	public static void pintarSuma(int num[]) {
		System.out.print("[");
		for(int i=0; i<num.length ;i++) 
			System.out.print(num[i] + " , ");
			
			System.out.print("]");
			
			
		
	}
	
	public static int sumaPrimo(int num[]) {
		int sumP=0;
		for(int i=0; i<num.length ;i++) { 
			
			if(esPrimo(i)==true) {
				sumP+=num[i];
			}
		}
		return sumP;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sumar los valores en posiciones impares de un array
		
		int num[]=new int[20];
		for(int i=0; i<num.length ;i++) {
			num[i]= (int) (Math.random()*100+1);
			
		}
		
		pintarSuma(num);
		System.out.println(sumarImpares(num));
		
	
		System.out.println(sumaPrimo(num));
		
	}

}
