package tema8Poo;

import java.util.Scanner;

public class testAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agenda cont1 = new Agenda();

		
		Scanner sc = new Scanner(System.in);
		int opcion;
		String nom1;
		
		
		
		do {
		System.out.println("AGENDA TELEFONICA");
		System.out.println("-----------------");
		System.out.println("1. Añadir nuevo contacto");
		System.out.println("2. Listar contactos");
		System.out.println("3. Buscar contacto");
		System.out.println("4. Eliminar contacto");
		System.out.println("5. Estado de la agenda");
		System.out.println("6. Salir");
		System.out.println();
		System.out.println("Elige una opcion: ");
		
		opcion=Integer.parseInt(sc.nextLine());
		
			switch (opcion) {
			case 1: {
				System.out.println("Nombre del nuevo de contacto");
				nom1=sc.nextLine();
				
				cont1.addContacto(new Contacto(nom1));
				break;
			}
			
			case 2: {
				cont1.listarContactos();
				break;
			}
			
			case 3: {
				System.out.println("Nombre del contacto que quiere buscar");
				nom1=sc.nextLine();
				System.out.println(cont1.buscarContactos(nom1));
				break;
			}
			
			case 4: {
				System.out.println("Nombre del contacto que quiere buscar");
				nom1=sc.nextLine();
				
				cont1.eliminarContactos(new Contacto(nom1));
				break;
				
			}
			default:
				System.out.println("Opcion incorrecta");
				
			}

		}while(opcion!=6);
		
		sc.close();
	}
}


