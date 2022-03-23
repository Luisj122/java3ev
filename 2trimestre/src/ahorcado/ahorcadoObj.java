package ahorcado;

import java.util.Arrays;

public class ahorcadoObj {
	//Propiedades
	private static String diccionario[]= {"pelota","caramelo","payaso","centinela"};
	private String palabraAdivinar;
	private char[] palabrasIntentada;//Se puede hacer con StrinBuilder
	private char[] letrasProbar;
	private int fallos;

	public ahorcadoObj() {
		//Elegir una palabra aleatoria del diccionario
		int posicion = (int)(Math.random()*ahorcadoObj.diccionario.length);
		this.palabraAdivinar=ahorcadoObj.diccionario[posicion];
		
		//Reservo tantos caracteres para la palabraIntentada como longitud de palabraAdivinar
		this.palabrasIntentada = new char[this.palabraAdivinar.length()];
		
		//Rellenar de guiones la palabraIntentada, tantos como longitud de la palabraAdivinar
		
		for(int i=0; i<this.palabraAdivinar.length(); i++) {
			this.palabrasIntentada[i]='-';
		}
		
		//Iniciar el tamaño del array de letras palabras
		this.letrasProbar = new char[27];
		
		this.fallos=0;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ahorcadoObj [palabraAdivinar=");
		builder.append(palabraAdivinar);
		builder.append(", palabrasIntentada=");
		builder.append(Arrays.toString(palabrasIntentada));
		builder.append(", letrasProbar=");
		builder.append(Arrays.toString(letrasProbar));
		builder.append(", fallos=");
		builder.append(fallos);
		builder.append("]");
		return builder.toString();
	}


	/**
	 * @return the diccionario
	 */
	public static String[] getDiccionario() {
		return diccionario;
	}


	/**
	 * @return the palabraAdivinar
	 */
	public String getPalabraAdivinar() {
		return palabraAdivinar;
	}


	/**
	 * @return the palabrasIntentada
	 */
	public char[] getPalabrasIntentada() {
		return palabrasIntentada;
	}

	/**
	 * @return the letrasProbar
	 */
	public char[] getLetrasProbar() {
		return letrasProbar;
	}

	/**
	 * @return the fallos
	 */
	public int getFallos() {
		return fallos;
	}
	
	
	/**
	 * La letra introducida la buscaa en la palabra a adivinar
	 * Si la encuentra nos muestra sus apariciones en la solucion
	 * Si no la encuentra suma un fallo
	 * @param letra
	 * @return
	 */
	
	public boolean intentar(char letra) {
		boolean encontrado = false;
		
		//Busca la letra tantas veces como salga
		for (int i = 0; i < this.palabraAdivinar.length(); i++) {
			//Si conincide la letra en alguna posicion la pongo en palabraIntentada
			if(this.palabraAdivinar.charAt(i)== letra) {
				this.palabrasIntentada[i]=letra;
				encontrado = true;
			}
			
		}
		if(encontrado==false)
			this.fallos++;
		
		return encontrado;
	}
	
	/**
	 * Comprueba que la palabraAdivinar y la palabraIntentada son iguales
	 * @return
	 */
	public boolean solucion() {
		boolean solucion=true;
		for (int i = 0; i < this.palabraAdivinar.length(); i++) {
			if(this.palabraAdivinar.charAt(i)!= this.palabrasIntentada[i]) {
				solucion = false;
			}
			
		}
		return solucion;
	}
	
	/**
	 * 
	 * @param palabra
	 * @return
	 */
	
	public boolean resolver(String palabra) {
		boolean pSolucion=false;
		
			if(palabra.equals(this.palabraAdivinar)) {
				pSolucion=true;
			}
						
		return pSolucion;
	}
}
