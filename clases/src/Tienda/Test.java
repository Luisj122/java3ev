package Tienda;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int opcion=0;
		String dni="";
		String contrasenia="";
		int producto=0;
		int cantidad=0;
		
		Categoria moviles = new Categoria("moviles");
		Categoria perif = new Categoria("perifericos");
		Producto p1  = new Producto("IP13", "Tel apple", moviles, 50, 20);
		Producto p2 = new Producto ("Logitech", "Raton gaming", perif, 50, 1.21);
		Producto p3 = new Producto ("razer", "teclado", perif, 50, 1.21);
		
		ClienteRegistrado cr1 = new ClienteRegistrado("Javier", "Guillen", "485174A", "Mojacar", "Mi casa", "us@gmail.com",
				"12345678", LocalDate.of(1987, 10, 10));
		
		
		System.out.println("Tienda");
		System.out.println("Escribe tu dni");
		dni = sc.nextLine();
		System.out.println("Contraseņa");
		contrasenia=sc.nextLine();	
		
	
		if(cr1.checkPassword(contrasenia) && dni.equals(cr1.getDni())) {
			
			pedido ped1 = new pedido(cr1);
			
			do {
				System.out.println("1. Comprar producto");
				System.out.println("2. Pedidos");
				System.out.println("3. Crear pdf del pedido");
				System.out.println("4. Salir");
				opcion = Integer.parseInt(sc.nextLine());
				
				switch (opcion) {
					case 1: {
						System.out.println("Producto");
						System.out.println("1. IP13");
						System.out.println("2. Logitech");
						System.out.println("3. Razer");
						producto = Integer.parseInt(sc.nextLine());
						
					
							switch (producto) {
								case 1: {
									System.out.println("Cantidad");
									cantidad = Integer.parseInt(sc.nextLine());
									ped1.nuevaLinea(new lineaPedido(p1, cantidad));
									break;
								}
								case 2: {
									System.out.println("Cantidad");
									cantidad = Integer.parseInt(sc.nextLine());
									ped1.nuevaLinea(new lineaPedido(p2, cantidad));
									break;
								}
								case 3: {
									System.out.println("Cantidad");
									cantidad = Integer.parseInt(sc.nextLine());
									ped1.nuevaLinea(new lineaPedido(p3, cantidad));
									break;
								}
							}
							break;
					}
					case 2: {
						System.out.println(ped1);
						break;
					}
					case 3: {
						try {
							ped1.toPDF();
						} catch (Exception e) {
							
						}
						break;
					}
				}
			} while (opcion!=4);
		
		}else {
			System.out.println("Contraseņa o Dni incorrectos");
		}
		sc.close();
		
		
	
	}

}
