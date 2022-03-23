package GestionBiblioteca;

import java.util.Scanner;

public class testBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int opcion=0;
		String titulo="";
		
		
		Biblioteca b1 = new Biblioteca("d1");
				
		//Creacion de objetos Libro
		Libro l1 = new Libro("libro1", 2000, 12);
		Libro l2 = new Libro("libro2", 2000, 21);
		Libro l3 = new Libro("libro3", 2000, 24);
		
		//Creacion de objetos revista
		Revista r1 = new Revista("Revista1", 2000, 12, 3);
		Revista r2 = new Revista("Revista2", 2000, 12, 4);
		Revista r3 = new Revista("Revista3", 2000, 12, 5);
		
		//Añadimos autores a los libros
		l1.addAutor("nombre1", "apellido1");
		l2.addAutor("nombre2", "apellido2");
		l3.addAutor("nombre3", "apellido3");
		
		//Añadimos autores a las revistas
		r1.addAutor("nombre4", "apellido4");
		r2.addAutor("nombre5", "apellido5");
		r3.addAutor("nombre6", "apellido6");
		
		//Añadimos los objetos libro a la biblioteca
		b1.adquirirMaterial(l1);
		b1.adquirirMaterial(l2);
		b1.adquirirMaterial(l3);
		
		//Añadimos los objeto revista a la biblioteca
		b1.adquirirMaterial(r1);
		b1.adquirirMaterial(r2);
		b1.adquirirMaterial(r3);
		
		//Llamamos al metodo buscar
		System.out.println("Metodo buscar");
		System.out.println(b1.buscar(new Autor("nombre1", "apellido1")));
		
		
		//Creamos el menu
		do {
			
			System.out.println("1. Presta");
			System.out.println("2. Devolver");
			System.out.println("3. Buscar");
			System.out.println("4. Salir");
			
			opcion = Integer.parseInt(sc.nextLine());
			
				switch (opcion) {
				case 1: {
										
					Publicacion p = b1.buscar(titulo);
	                if (p instanceof Libro) {
	                      ((Libro) p).presta();
	                    }
				}
				
				case 2:{
					
					Publicacion p = b1.buscar(titulo);
	                if (p instanceof Libro) {
	                      ((Libro) p).devuelve();
	                    }
				}
				
				case 3:{
				
					System.out.println("Un titulo");
					titulo = sc.nextLine();
					System.out.println(b1.buscar(titulo));
					break;
		
				}
	
			default:
				System.out.println("Opcion incorrecta");
				
			}
			
		}while(opcion!=4);
		
		
		sc.close();
	}

}
