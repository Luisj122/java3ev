package DadosPoker;

import java.util.Scanner;

public class testPoker {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String jugador1="";
		String jugador2="";
		int opcion=0;
		
	
		do {
			System.out.println("Menu");
			System.out.println("1. Jugar");
			System.out.println("2. Salir");
			
			opcion=Integer.parseInt(sc.nextLine());
			
				switch (opcion) {
				case 1: {
					System.out.println("Nombre del Jugador 1");
					jugador1 = sc.nextLine();
					
					System.out.println("Nombre del Jugador 2");
					jugador2 = sc.nextLine();
					
	
					Juego juego1 = new Juego(jugador1, jugador2);
					juego1.jugar();
					System.out.println(juego1.mostrarResultado());
					break;
				}
			
			}
		
		}while(opcion!=2);
		
		sc.close();
	}

}
