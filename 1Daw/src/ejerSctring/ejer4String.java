package ejerSctring;

public class ejer4String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Elimina todos los espacios en blanco de una cadena 
		
		String cadena = " Hay muchos espacios en esta cadena";
		cadena = cadena.trim();//Quitar los espacion blancos de principio y el final
		System.out.println(cadena + ".");
		
		//Recorremos la cadena pasanadola a otra resultado
		//Si encuentra espacion en blanco no los pasa a la cadena resultado
		
		String resultado="";
		
		for(int i=0; i<cadena.length() ;i++) {
			if(cadena.charAt(i) != ' ') {
				resultado+=cadena.charAt(i);
			}
		}
		System.out.println(resultado);
		
	}

}
