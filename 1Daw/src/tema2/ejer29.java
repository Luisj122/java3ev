package tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejer29 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num=0, opcion=0, mayor=101, menor=1, cont=0;
		
		
		try {
	
		do {
			
			//Generamos un numero entre 1 y 100
		System.out.println("Numero entre 1 y 100");
		
		
		num=(int) (Math.random()*(mayor-menor)+menor);
		System.out.println(num);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		
		System.out.println("1. Es igual");
		System.out.println("2. Es menor");
		System.out.println("3. Es mayor");
		opcion=sc.nextInt();
		
		//Contamos las veces que a necesitado para acertar 
		cont++;
		
		switch (opcion) {
		
		//El primer caso es por si acierta
		case 1: {
			System.out.println("Acertado");
			break;
		}
		
		//El segundo caso es para cambiar el numero mayor por num
		case 2:{

			mayor=num;	
			
			break;
		}
		
		//El tercer caso es para cambiar el numero menor por num para reducir el numero aleatorio
		case 3:{
			
			menor=num;
			
			break;
					
			}
		}
		
		
		
		}while(opcion!=1);
		
		//Pintamos el numero de veces que necesito para acertar 
		System.out.println("Numero de intentos : " + cont);
		
		sc.close();
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("No es una opcion valida");
		}
	}
}
