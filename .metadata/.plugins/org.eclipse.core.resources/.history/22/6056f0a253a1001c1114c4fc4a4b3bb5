package Wordle;

import java.time.LocalDate;
import java.util.Arrays;


public class Wordle {
	protected static String[] diccionario = {"tecla", "raton", "horas", "lapiz", "apaga", "nueve", "siete", "cinco", "frios", "entra" } ;
	protected static char[] alfabeto;
	
	protected String palabraAcertar;
	protected String palabraActual;
	protected char[] letrasNoEstan;
	
	Wordle(){

		int posicion = (int)LocalDate.now().getDayOfMonth();
		this.palabraAcertar = Wordle.diccionario[posicion];
		this.letrasNoEstan = new char[' '];
		
		
	}
	
	public void comprobar(String intento) {
		
		boolean aciertos=false;
		StringBuilder pA = new StringBuilder();
		if(intento.length() == 5) {
		
			for(int i = 0; i < this.palabraAcertar.length(); i++) {
				if(this.palabraAcertar.charAt(i)==intento.charAt(i)) {
					pA.setCharAt(i, intento.charAt(i));
				}
			}
		}

	}
	
	
	
	
	/**
	 * @return the palabraAcertar
	 */
	public String getPalabraAcertar() {
		return palabraAcertar;
	}

	/**
	 * @param palabraAcertar the palabraAcertar to set
	 */
	public void setPalabraAcertar(String palabraAcertar) {
		this.palabraAcertar = palabraAcertar;
	}

	/**
	 * @return the palabraActual
	 */
	public String getPalabraActual() {
		return palabraActual;
	}

	/**
	 * @param palabraActual the palabraActual to set
	 */
	public void setPalabraActual(String palabraActual) {
		this.palabraActual = palabraActual;
	}

	/**
	 * @return the letrasNoEstan
	 */
	public char[] getLetrasNoEstan() {
		return letrasNoEstan;
	}

	/**
	 * @param letrasNoEstan the letrasNoEstan to set
	 */
	public void setLetrasNoEstan(char[] letrasNoEstan) {
		this.letrasNoEstan = letrasNoEstan;
	}

	/**
	 * @return the diccionario
	 */
	public static String[] getDiccionario() {
		return diccionario;
	}

	/**
	 * @return the alfabeto
	 */
	public static char[] getAlfabeto() {
		return alfabeto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wordle [palabraAcertar=");
		builder.append(palabraAcertar);
		builder.append(", palabraActual=");
		builder.append(palabraActual);
		builder.append(", letrasNoEstan=");
		builder.append(Arrays.toString(letrasNoEstan));
		builder.append("]");
		return builder.toString();
	}




	

	

}
