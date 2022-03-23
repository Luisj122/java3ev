package ejemplos;

public class pruebaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		String mensaje="Hola mundo";
		
		//Longitud de una cadena
		
		System.out.println("Longitud de la cadena " + mensaje.length());
		
		//Caracter 
		
		System.out.println("Caracter en la posicion 2 " + mensaje.charAt(3));
		System.out.println("Posicion de la subcadena 'mu' " + mensaje.indexOf("mu"));
		
		//Saber si una subcadena esta dentro de una cadena 
		
		String cl = "En un lugar de la Mancha cuyo nombre no quiero ....";
		String sub= "Mancha";
		if(cl.indexOf(sub)>=0) {
			System.out.println("Si esta");
			
		}else {
			System.out.println("No esta");
		}
		
		String c1 = "En un lugar de la Mancha cuyo nombre no quiero ....";
		String sub1= "Mancha";
		
		//Convierte todo el string en minuscula 
		
		if(c1.toLowerCase().indexOf(sub1)>=0) {
			System.out.println("Si esta");
			
		}else {
			
			//IndexOF devuelve un numero en negativo
			
			System.out.println("No esta");
		}
		
		//Subcadena de una cadena
		
		String mensaje2 = "Me gusta mucho Java, cada vez más";
		
		//Sacat Java
		
		System.out.println(mensaje2.substring(15,19));
		
		int inicio=mensaje2.indexOf("Java");
		int fin = inicio + "Java".length();
		System.out.println(mensaje2.substring(inicio,fin));
		System.out.println(mensaje2.substring(mensaje2.indexOf("Java"),mensaje2.indexOf("Java")+ "Java".length()));
		
		//Quitar espacion
		
		String mensaje3="            Hola";
		System.out.println(mensaje3);
		System.out.println(mensaje3.trim());
		
		//Pasar de string a int 
		
		int numero = Integer.parseInt("25");
		System.out.println(numero + 5);
		
		//Pasar de string a double
		
		double decimal = Double.parseDouble("34.95");
		System.out.println(decimal + 0.5);
		
		//Comparar cadena con equals
		
		String cad1="Estoy ya frito";
		String cad2="Estoy ya frito";
		
		if(cad1.equals(cad2)) { //No usar ==
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		//Comparar alfabeticamente
		
		String ca1="Hernandez";
		String ca2="Garcia";
		if(ca1.compareTo(ca2)<0) {
			System.out.println(ca1 + " " + ca2);
		}else {
			System.out.println(ca2 + " " + ca1);
		}
	}

}
