package tema8Poo;

public class testPez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pez p1 = new Pez("Pez1");
	
		try {
			Pez p2 = (Pez) p1.clone();
			Pez p3 = new Pez("Pez3");
			
			System.out.println(p1);
			System.out.println(p2);
			
			p2.setNombre("Pez cambio");
			System.out.println(p1);
			System.out.println(p2);
			System.out.println("Comparativa de p2 y p1 = " + p2.equals(p1));
			System.out.println(p3);

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println("No se puede clonar");
		}
		
		
		
		System.out.println(Pez.getNumPeces());
	}

}
