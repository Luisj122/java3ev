package ejerPrubea;

public class ejerRombo {
	public static void main(String[] args) {
		int nL;
		nL = 4;
		
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
		
		for(int i=nL-1; i>=0; i--) {
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
		
	}

}
