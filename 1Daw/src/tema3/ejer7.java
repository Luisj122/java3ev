package tema3;

import java.util.Scanner;

public class ejer7 {
	
	public static void pintarVector(int[] num) {
		for(int i=0; i<num.length ;i++) {
			System.out.print(num[i] + "  " );
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[10];
		
		for(int i=0 ;i<8 ;i++){
			num[i]= (int)(Math.random()*100+1);
		}
		
		pintarVector(num);
		
		Scanner sc = new Scanner(System.in);
		
		
		//Introduce la posicion donde vamos a meter un nuevo valor
		int posicion = 0;
		
		System.out.println();
		
		do {
			System.out.println("Numero de posicion entre 0 y 7");
			
			posicion=Integer.parseInt(sc.nextLine());;
		} while (posicion<0 || posicion>7);
		
		
		//Pide por teclado el valor a introducir en esa posicion
		int numero=0;
		
		numero = Integer.parseInt(sc.nextLine());
		
		//mover todos los elementos desde posisicion hasta Length - 1 a la derecha
		//Me voy al final e intercambio lo que hay en la posicion i lo que pongo en i+1
		
		for(int i=8; i>=posicion ;i--) {
			num[i+1]=num[i];
		}
		
		//Insertar el numero en la posicion seleccionada
		
		num[posicion]=numero;
		
		pintarVector(num);
				
		
		
		sc.close();
		
	}

}
