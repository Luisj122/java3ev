package tema2;

import java.util.Scanner;

public class ejer25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1, n2,cont=0,mayor=0, menor = 1000000;
		double acu=0;
		
		//Pedimos el numero de veces que se va a repetir
		System.out.println("Numero de veces que se va a repetir");
		n1 = sc.nextInt();
		
		do{
			System.out.println("Numeros enteros");
			n2 = sc.nextInt();
			
			//Hacemos un if para sacar el mayor
			if(mayor<n2) {
				mayor=n2;
			}
			
			//Hacemos un if para sacar el menor
			if(menor>n2 ){
				menor=n2;
			}
			acu+=n2;
			cont++;
			
		}while(cont<n1);
		
		//Pintamos el mayor y el menor y sacamos la media
		
		System.out.println("Media : " + acu/cont);
		System.out.println("El mayor : " + mayor);
		System.out.println("El menor : " + menor);
		
		sc.close();
	}

}
