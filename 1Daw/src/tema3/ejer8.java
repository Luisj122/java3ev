package tema3;

import java.util.Scanner;

public class ejer8 {
	
	public static void pintarVector(int[] num) {
		for(int i=0; i<num.length ;i++) {
			System.out.print(num[i] + "  " );
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero=0;
		int num[] = new int[5];
		
		//Llenamos los array con numero pedidos por teclado
		
		for(int i=0 ;i<num.length ;i++) {
			System.out.println("Numero " + i);
			numero =  Integer.parseInt(sc.nextLine());
			num[i]=numero;
			
		}
		
		//Guardamos la posisicion del ultimo numero
		int pos=num[4];
		
		//Recorremos la poscicion
		for(int i=3; i>=0 ;i--) {
			num[i+1]=num[i];
		}
		
		//Ponemos la ultima posicion a 0
		num[0]=pos;
			
		System.out.println();
		pintarVector(num);
		sc.close();
	}

}
