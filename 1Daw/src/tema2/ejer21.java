package tema2;

import java.util.Scanner;


public class ejer21 {
	
	public static boolean esPrimo(int n1) {
		int cont=0;

		for(int i=1;i<=n1;i++) {
			
			//Hacemos un if para contar las veces que se an dividido
			if(n1%i==0) {
				cont++;		
			}
		}
		
		//Ponemos un if si contador es mayor que 2 devolvemos false 
			if(cont>2) {
				return false;
			}else {
				return true;
			}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1=0;
		
		System.out.println("Numero");
		n1 = sc.nextInt();
		
		
		System.out.println(esPrimo(n1));
		
		sc.close();

	}

}
