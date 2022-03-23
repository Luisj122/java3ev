package ejemplos;

import java.util.Scanner;

public class ejerJugador {
	
	static int vJugador2(int poderJugador1, int vidaJugador2) {
		vidaJugador2 -= poderJugador1;
		return vidaJugador2;
	}
	
	static int vJugador1(int poderJugador2, int vidaJugador1) {
		vidaJugador1 -= poderJugador2;
		return vidaJugador1;
	}

	static void vidaJugadores(int vidaJugador1, int vidaJugador2) {
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vidaJugador1=0 , vidaJugador2=0;
		int poderJugador1=0, poderJugador2=0;
		int opcion,ff;
		
		//Pedir por teclado la vida del jugador y su poder
		//Pedir por teclado la vida del enemigo y su poder
		
		//Hacer un menu que se reouta con tres opciones
		//1.Golpeo jugador
		//2.Golpeo enemigo
		//3.Salir
		//Se debe repetir hasta salir, o cuando enemigo o jugador tenga la vida a cero
		//se debe ir mostrando la vida del jugador y del enemigo
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vida del jugador 1");
		vidaJugador1 = sc.nextInt();
		
		System.out.println("Poder del jugador 1");
		poderJugador1 = sc.nextInt();
		
		
		System.out.println("Vida del jugador 2");
		vidaJugador2 = sc.nextInt();
		
		System.out.println("Poder del jugador 2");
		poderJugador2 = sc.nextInt();
		
		do {
			System.out.println("1. Golpeo Jugador 1");
			System.out.println("2. Golpeo Jugador 2");
			System.out.println("3. Salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1: 
				ff=vJugador1(vidaJugador1,poderJugador2);
				System.out.println(ff);
				break;
				
			case 2:
				System.out.println(vJugador2(vidaJugador2,poderJugador1));
				break;
							
			
			}
			
			
		}while(vidaJugador1>0 && vidaJugador2 > 0  );

		
		
				
	}
		
}
