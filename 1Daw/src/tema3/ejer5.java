package tema3;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int vectorA[];
		int vectorB[];
		int vectorC[];
		int acumulador=0;
		
		vectorA=new int[5];
		vectorB=new int[5];
		vectorC=new int[vectorA.length+vectorB.length];
		
		for(int i=0; i<vectorA.length ;i++) {
			System.out.println("Tabla A");
			vectorA[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<vectorB.length ;i++) {
			System.out.println("Tabla B");
			vectorB[i]=sc.nextInt();
		}
		
		
		
		for(int i=0; i<5 ;i++) {
			vectorC[acumulador]=vectorA[i];
			acumulador++;
			vectorC[acumulador]=vectorB[i];
			acumulador++;
		}
		
		for(int i=0; i<vectorC.length ;i++) {
			System.out.print(vectorC[i] + " " );
		}

		sc.close();
	}

}
