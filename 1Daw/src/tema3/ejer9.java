package tema3;

import java.util.Scanner;

public class ejer9 {

	/**
	 * Metodo para pintar el array
	 * @param num
	 */
	public static void pintarVector(int[] num) {
		for(int i=0; i<num.length ;i++) {
			System.out.print(num[i] + "  " );
		}
	}
	
	/**
	 * Metodo para mover las posiciones
	 * @param num
	 * @return
	 */
	
	public static int[] moverPosicion(int [] num) {
	int pos=num[4];
		
		//Recorremos la poscicion
		for(int i=3 ;i>=0 ;i--) {
			
			num[i+1]=num[i];
		}
		
		
		num[0]=pos;
		return num;
		
	
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero=0, posicion=0;
		int num[] = new int[5];
		
		//Llenamos los array con numero pedidos por teclado
		
		for(int i=0 ;i<num.length ;i++) {
			System.out.println("Numero " + i);
			numero =  Integer.parseInt(sc.nextLine());
			num[i]=numero;
			
		}
		
		System.out.println("Posicion");
		posicion=sc.nextInt();		
		
		//Un bucle para mover el numero de posiciones
		for(int i=0 ;i<posicion; i++) {
		moverPosicion(num);	
		}
	
		pintarVector(num);
		sc.close();
	}

}
