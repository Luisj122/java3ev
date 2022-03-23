package tema3;

import java.util.Scanner;

public class ejer10 {

	/**
	 * Metodo para pintar el array
	 * @param num
	 */
	public static void pintarVector(int[] num) {
		for(int i=0; i<num.length ;i++) {
			System.out.print(num[i] + "  " );
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero=0, posicion=0;
		int num[] = new int[10];
		
		//Llenamos los array con numero pedidos por teclado
		
		for(int i=0 ;i<num.length ;i++) {
			System.out.println("Numero " + i);
			numero =  Integer.parseInt(sc.nextLine());
			num[i]=numero;
			
		}
		
		System.out.println("Eliminar elemento");
		posicion=sc.nextInt();	
		
		//Bucle para cambiar la posicion 
		
		for(int i=posicion ;i<num.length-1; i++) {
			num[i]=num[i+1];

		}
		
		//Añadimos un 0 al final
		num[num.length-1]=0;
			
		
	
		pintarVector(num);
		sc.close();
	}

}
