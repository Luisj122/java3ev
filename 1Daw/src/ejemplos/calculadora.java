package ejemplos;



import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=0;
		double n1=0, n2=0, res=0;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Calculadora");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			
			try {
				opcion=Integer.parseInt(sc.nextLine()); 
			
			 
			 
			 switch (opcion) {
			case 1: {
				
				System.out.println("Introduce Numero 1");
				n1 =Double.parseDouble(sc.nextLine());
				System.out.println("Introduce Numero 2");
				n2 =Double.parseDouble(sc.nextLine());
				res = n1 + n2;
				System.out.println("Resultado: " + res );
				break;
				
			}
			case 2: {
				
				System.out.println("Introduce Numero 1");
				n1 =Double.parseDouble(sc.nextLine());
				System.out.println("Introduce Numero 2");
				n2 =Double.parseDouble(sc.nextLine());
				res = n1 - n2;
				System.out.println("Resultado: " + res );
				break;
			}
			case 3: {
				
				System.out.println("Introduce Numero 1");
				n1 =Double.parseDouble(sc.nextLine());
				System.out.println("Introduce Numero 2");
				n2 =Double.parseDouble(sc.nextLine());
				res = n1 * n2;
				System.out.println("Resultado: " + res );
				break;
			}
			
			case 4: {
				System.out.println("Introduce Numero 1");
				n1 =Double.parseDouble(sc.nextLine());
				System.out.println("Introduce Numero 2");
				n2 =Double.parseDouble(sc.nextLine());
				res = n1 / n2;
				System.out.println("Resultado: " + res );
				break;
			}
			 }
			 
			} catch (Exception e) {
				System.out.println("No es una opcion valida");
			}
			
		}while(opcion != 5);
		
		sc.close();

	}

}
