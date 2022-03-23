package examenT1;

public class ejer1 {

	public static double numEuler(int num) {
		int e=0;
		int al=0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			e+=1/factorial(i);
			System.out.println(e);
		
			al+=e;
		}
		return al;
		
	}
	
	public static int factorial(int num) {
		int facto=1;
		for(int i=1; i<=num; i++) {
			facto*=i;
		}
		return facto;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		double totalAnterior = 0;
		int e = 0;
		double diferencia = 10;
		
		int i=1;
		do {
			e += 1/factorial(i);
			diferencia = (e- totalAnterior);
			
			totalAnterior = e;			
			i++;
			
		} while (Math.abs(diferencia) > 0.0001);
		
		System.out.println(e);
		
	}

}
