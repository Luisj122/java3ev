package tema8Poo;

public class testProducto {

	public static void main(String[] args) {
		
		Producto producto1 = new Producto(1, "Lavadora", 16.99, 5 , 10, 10);
		System.out.println(producto1);
		
		System.out.println(producto1.vender(5));
		System.out.println(producto1);
		
		producto1.reponer();
		
		System.out.println(producto1);
		

	}

}
