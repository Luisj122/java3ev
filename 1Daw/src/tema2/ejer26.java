package tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejer26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num=0,n1=0,n2=0,n3=0,result=0;
		
		try {
		System.out.println("Numero entero entre 1 y 999");
		num = sc.nextInt();
		
		//Ponemos if para para poner un rango de num por si introduce un numero de un digito 
		if(num>=1 && num<=9) {
			System.out.println(num);
			
			//Ponemos if para para poner un rango de num por si introduce un numero de dos digito 
		}else if(num>=10 && num<=99) {
			n1=num/10;
	        n2=num-(n1*100)/10;
	        result=n1+(n2*10);
	        System.out.println(result);
	        
	        
	      //Ponemos if para para poner un rango de num por si introduce un numero de tres digito 
		}else if(num>=100 && num<=999) {
			n1=num/100;
	        n2=(num-(n1*100))/10;
	        n3=(num-(n1*100)-(n2*10));
	  
	    	
			result=n1+(n2*10)+(n3*100);
			
			System.out.println(result);
		}
		
		
		
		sc.close();
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("No es numero entero positivo");
		}
		
	}

}
