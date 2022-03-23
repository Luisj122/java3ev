import java.util.Scanner;

public class Wrapper {	

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce numeros");
		int num =sc.nextInt();
		
		String ultimoD = Integer.toString(num);
		
		ultimoD.charAt(ultimoD.length()-1);
		System.out.println(ultimoD);
		
		sc.close();
		
				
	}

}
