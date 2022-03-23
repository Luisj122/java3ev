package ahorcado;


import java.util.Arrays;
import java.util.Scanner;

public class testAhorcadoObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ahorcadoObj juego = new ahorcadoObj();
		
		Scanner sc = new Scanner(System.in);
		
		int opcion=1;
		boolean resuelto=false;
		do {
			System.out.println("1. Intentar letra");
			System.out.println("2. resolver");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1: {
				//Leer una letra
				System.out.println("Escribe una letra");
				String letra = sc.nextLine();
				juego.intentar(letra.charAt(0));
				System.out.println("Tu palabra" + Arrays.toString(juego.getPalabrasIntentada()));  
				System.out.println("Fallos: " + juego.getFallos());
				
				switch (juego.getFallos()){
				case 1: {
					System.out.println("  ----------");
					System.out.println("  |        |");
					System.out.println("  O        |");
					System.out.println("           |");
					System.out.println("           |");
					System.out.println("           |");
					System.out.println("         ----");
					break;
					}
				case 2: {
					System.out.println("  ----------");
					System.out.println("  |        |");
					System.out.println("  O        |");
					System.out.println(" /         |");
					System.out.println("           |");
					System.out.println("           |");
					System.out.println("         ----");
					break;
					}
				case 3: {
					System.out.println("  ----------");
					System.out.println("  |        |");
					System.out.println("  O        |");
					System.out.println(" /|        |");
					System.out.println("           |");
					System.out.println("           |");
					System.out.println("         ----");
					break;
					}
				case 4: {
					System.out.println("  ----------");
					System.out.println("  |        |");
					System.out.println("  O        |");
					System.out.println(" /|\\       |");
					System.out.println("           |");
					System.out.println("           |");
					System.out.println("         ----");
					break;
					}
				case 5: {
					System.out.println("  ----------");
					System.out.println("  |        |");
					System.out.println("  O        |");
					System.out.println(" /|\\       |");
					System.out.println(" /         |");
					System.out.println("           |");
					System.out.println("         ----");
					break;
					}
				case 6: {
					System.out.println("  ----------");
					System.out.println("  |        |");
					System.out.println("  O        |");
					System.out.println(" /|\\       |");
					System.out.println(" / \\       |");
					System.out.println("           |");
					System.out.println("         ----");
					break;
					}
				
				
				
				}
				
				//Comprobar si esta solucionado
				if(juego.solucion()) {
					System.out.println("Has ganando");
					resuelto=true;
				}
				break;
			}
			case 2:{
				//Letra a adivinar
				System.out.println("Palabra que piense que es correcta");
				String letraD = sc.nextLine();
				if(juego.resolver(letraD)) {
					System.out.println("As adivinado");
				
				}else {
					System.out.println("Palabra incorrecta");
				}
			}
			default:
				System.out.println("Opcion incorrecta");
			}
			
		} while ( !resuelto && juego.getFallos()<6 );
		
		sc.close();

	}

}
