package tema3;

public class ejer20 {
	
	/**
	 * Creamos la pila(vector) del tamaño indicado
	 * @param capacidad
	 * @return
	 */
	
	public static int[] crearPila(int capacidad) {
		int pila[]=new int [capacidad];
		for(int i=0 ;i<pila.length ;i++) {
			pila[i]=-1;
		}
		return pila;
	}
	
	/**
	 * Insertar un numero en la pila en la posicion ultima
	 * @param pila
	 * @param elemento
	 */
	
	public static void insertar(int[] pili, int elemento) {
		for(int i=0 ;i<pili.length ;i++) {
			if(pili[i]==-1) {
				pili[i]=elemento;
				break;
			}
		}
	}
	
	public static boolean estaLlena(int pili[]) {
		boolean llena=false;
		
		for(int i=0 ;i<pili.length ;i++) {
			if(pili[i]==-1) {
				llena=false;
			}
		}
		return llena;
		
	}

	public static int sacat(int[]pili) {
		int elemento = 0;
		
		//Esta llena
		
		if(estaLlena(pili)==true) {
			elemento = pili[pili.length-1];
			pili[pili.length-1]=-1;//Borrar elemento
			return elemento;
		}
		
		
		//Otro caso, incompleta
			
		if(pili[0]!=-1) {
			for(int i=0 ;i<pili.length ;i++) {
				if(pili[i]==-1) {
					elemento = pili[pili.length-1];
					pili[pili.length-1]=-1;//Borrar elemento
				}
			}
		}
			
			
		
		
		
		return elemento;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pila[]=crearPila(10);
	
		
		insertar(pila,5);
		insertar(pila, 3);
		System.out.println(pila);
		
		//Insertar en la pila un elemento
		
		

	}

}
