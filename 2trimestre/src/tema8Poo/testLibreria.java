package tema8Poo;

public class testLibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libreria biblioteca = new Libreria();
		
		Libro l1 = new Libro("libro 1" , "libro1", 20);
		Libro l2 = new Libro("libro 2" , "libro2", 30);
		Libro l3 = new Libro("libro 3" , "libro3", 40);
		
		biblioteca.adquirir(l1 , 50);
		biblioteca.adquirir(l2 , 50);
		biblioteca.adquirir(l3 , 50);
		
		
		biblioteca.vender(l1, 20);
		biblioteca.vender(l2, 20);
		biblioteca.vender(l3, 20);
		
		System.out.println(biblioteca.ganancias());
		
		
	}

}
