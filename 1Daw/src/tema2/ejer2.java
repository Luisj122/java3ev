package tema2;
import java.util.Locale;
import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int n1 ;
		
		System.out.println("Numero");
		n1=sc.nextInt();
		
		
		if(n1%2==0){
			System.out.println("Es multiplo de 2");
		}
		if(n1%3==0){
			System.out.println("Es multiplo de 3");
		}	
		if(n1%5==0) {
			System.out.println("Es multiplo de 5");
		}
		if(n1%7==0) {
			System.out.println("Es multiplo de 7");
		}
		if(n1%2!=0 && n1%3!=0 && n1%5!=0 && n1%7!=0) {
			System.out.println("No es multiplo de 2, 3 ,5 ,7");
		}
		
		
		System.out.println(n1);
		
		
		sc.close();
		
	}

}
