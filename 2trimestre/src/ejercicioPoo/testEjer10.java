package ejercicioPoo;

public class testEjer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ejer10 coche1 = new ejer10();
		
		coche1.setKms(250);
		coche1.setLitros(100);
		coche1.setVmed(150);
		coche1.setPgas(20);
		
		System.out.println(coche1.getTiempo());
		System.out.println(coche1.consumoEuros());
		System.out.println(coche1.consumoMedio());
		
		
	}

}
