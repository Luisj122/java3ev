package ejercicioPoo;

public class testEjer7 {
	
	public static void main(String[] args) {
		
		ejer7 satelite = new ejer7();
		
		satelite.setPosicion(5, 50, 10);
		satelite.printPosicion();
		System.out.println();
		System.out.println(satelite.enOrbita());
		satelite.variaPosicion(6, 20);
		satelite.printPosicion();
	}

}
