package ejerSctring;

public class ejer1String {
	
	public static int contarString(String cadena) {
		int contador=0;
		
		for(int i=0 ;i<cadena.length() ;i++) {
			char car = cadena.charAt(i);
			if(car == 'a' || car == 'e' || car == 'i' || car == 'o' 
					|| car == 'u' || car == 'á' || car == 'é' || car == 'í' 
					|| car == 'ó' || car == 'ú') {
				contador++;
			}
		}
		
		return contador;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="Me gusta programar en Java los sábados por la mañana";
		System.out.println(contarString(cadena));
		
		String cadena1="https://www.iesjaroso.es/noticias";
		
		System.out.println(cadena1.substring(0,5));
		System.out.println(cadena1.substring(8,24));
		System.out.println(cadena1.substring(25,33));
		
		System.out.println(cadena1.substring(cadena1.indexOf("https"),5));
        System.out.println(cadena1.substring(cadena1.indexOf("www.iesjaroso.es"),24));
        System.out.println(cadena1.substring(cadena1.indexOf("noticias"),33));
		
		System.out.println(cadena1.substring(cadena1.indexOf("https"), cadena1.indexOf("https")+ "https".length()));
		System.out.println(cadena1.substring(cadena1.indexOf("www.iesjaroso.es"), cadena1.indexOf("www.iesjaroso.es")+"www.iesjaroso.es".length() ));
		System.out.println(cadena1.substring(cadena1.indexOf("noticias"),cadena1.indexOf("noticias")+"noticias".length()));
		
		
		
	}

}
