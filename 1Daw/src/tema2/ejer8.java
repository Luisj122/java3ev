package tema2;

import java.util.Scanner;

public class ejer8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Numero");
		
		num = sc.nextInt();
		
		
		System.out.println("Dobles");
        for (int i = 1; i <=num; i++) {
			System.out.println(i+" x 2 = " + (i*2));
        }
      
        System.out.println("Triples");
        for (int i = 1; i <=num; i++) {
			System.out.println(i+" x 3 = " + (i*3));
        }
        
        sc.close();
	}

}
