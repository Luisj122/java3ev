package ConversorFechas;


public class testFecha {

	public static void main(String[] args) {
		
		ConversorFechas f = new ConversorFechas();
		
		System.out.println(f.americanoToNormal("2000-12-11"));
		System.out.println(f.normalToAmaricano("12/11/2000"));
	

	}

}	
