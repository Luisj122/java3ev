package tema8Poo;

public class testDireccion {

	public static void main(String[] args) {
		
		Direccion dir1 = new Direccion("Pulpi", 56, "Pulpi", "Almeria", 04640, "España", 37.3644950, -1.6672326);
		Direccion dir2 = new Direccion("Cuevas", 51, "Cuevas", "Almeria", 04610, "España", 37.2971, -1.88148);

		
		System.out.println(dir1.distanciaKM(dir2));
		
		
	}

}
