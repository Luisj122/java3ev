package tema2;
import java.util.Scanner;

public class ejer15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int nL;
		nL = sc.nextInt();
		
		for(int i=0; i<=nL; i++) {
			for(int j=nL; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");	
			}
			for(int k=1; k<i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	
		}
	}

