package tema2;

public class ejer1 {
	
	/**
	 * Metodo para sacar el mayor de tres numeros
	 * @param a
	 * @param b
	 * @param c
	 * @return el mayor de tres numeros 
	 */

	static int mayor(int a, int b, int c) {
		if((a>=b) && (a>=c))
		return a;
		
		else if((b>=a) && (b>=c))
			return b;
		
		else if((c>=b) && (c>=a))
			return c;
		else
			return -1;
		
	}
	
	static int mayorCuatro(int a, int b, int c, int d) {
		return(mayor(mayor(a,b,c),d,-1));
	}
	
	public static void main(String[] args) {
		int resultado;
		resultado = mayorCuatro(1,8,3,6);
		System.out.println("El mayor es " + resultado);

		
	}

}
