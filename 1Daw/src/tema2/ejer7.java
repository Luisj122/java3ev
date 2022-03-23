package tema2;

public class ejer7 {
	public static void main(String[] args) {
		
		int acumulador = 0;
		
		for(int i=0; i<=200; i++) {
			if(i%2!=0) {
				acumulador+=i;
			}	
		}
		System.out.println(acumulador);	
		
		
	}

}
