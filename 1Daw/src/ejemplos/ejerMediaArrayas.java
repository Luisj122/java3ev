package ejemplos;

import java.util.Scanner;

public class ejerMediaArrayas {

	public static void pintarNotas(int notas[]) {
		for(int i=0; i<notas.length ;i++) {
			System.out.print(notas[i]+ " , ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int notas[];
		int numNotas=10;
		
		try {
			notas = new int[numNotas];
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i<10 ;i++) {
				System.out.println("Dime un nota");
				int valor=sc.nextInt();
				
				notas[i]=valor;
			}
			
			pintarNotas(notas);
			int total=0;
			
			for(int i=0; i<notas.length ;i++) {
				total+=notas[i];
			}
			System.out.println(total/notas.length);

			sc.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("No es una nota valida");
		}
		
		
	}

}
