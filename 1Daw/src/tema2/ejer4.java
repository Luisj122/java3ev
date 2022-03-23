package tema2;

public class ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int euros = 735;
		
		int b200=0, b100=0, b50=0, b10=0,monedas=0;
		int resto;
		
		b200=(int)euros/200;
		
		if(euros%200!=0) {
			resto=(euros%200);
			b100=(int)(resto)/100;
			
			resto=(resto%100);
			if(resto!=0) {
				b50=(int)(resto)/50;
			}
			resto=(resto%50);
			b10=(int)(resto)/10;
			
			resto=(resto%10);
			monedas=resto;
			
			System.out.println("Billete 200: " + b200);
			System.out.println("Billete 100: "+ b100);
			System.out.println("Billete 50: " + b50);
			System.out.println("Billete 10: " + b10);
			System.out.println("Monedas: " + monedas);		
			
		}

	}

}
