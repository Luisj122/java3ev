package ejemplos;

public class BonoLoto {
	
	/**
	 * Generamos numeros aleatorios
	 * @return
	 */
	public static int numeroAleatorio() {
		int num=0;
		num=(int)(Math.random()*49+1);
		
		return num;
	}
	
	/**
	 * Comprobamos si los numeros estan repetidos
	 * @param numero
	 * @param vector
	 * @return
	 */
	public static boolean esRepetido(int numero, int  vector[]) {
		
		for(int i=0; i<vector.length ;i++) {
			if( vector[i]==numero) {
				return true;
			}
		}
		return false;
		
	}
	
	/**
	 * Pintamos el vector
	 * @param combinacion
	 */
	
	public static void pintarVector(int combinacion[]) {
		for(int i=0; i<combinacion.length ;i++) {
			System.out.print(combinacion[i] + " , " );
		}
	}
	
	public static void main(String[] args) {
		
		//Programa que genere una combinacion de 6 numero de loteria
		//Esos numeros van de 1 a 49
		//No puede haber ningun repetido
		
		int combinacion[] = new int [6];
		int numero=0;
		
		for(int i=0; i<combinacion.length ;i++) {
			
		
		do {
			numero=numeroAleatorio();
			
		}while(esRepetido(numero,combinacion));
		
		combinacion[i]=numero;
		}
		pintarVector(combinacion);
	}
	

}
