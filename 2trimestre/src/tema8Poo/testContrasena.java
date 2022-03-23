package tema8Poo;

public class testContrasena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contrasena contra = new Contrasena();
		
		Contrasena contra1 = new Contrasena(16);
		
		contra1.generarPassword();
		
		System.out.println(contra1);
		
		if(contra1.esFuerte()) {
			System.out.println("Es fuerte");
		}else {
			System.out.println("Es debil");
		}
		
		
		
		System.out.println();
		
		contra.generarPassword();
		System.out.println(contra);
		
		if(contra.esFuerte()) {
			System.out.println("Es fuerte");
		}else {
			System.out.println("Es debil");
		}
		
			
		
		
		

	}

}
