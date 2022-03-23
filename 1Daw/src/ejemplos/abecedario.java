package ejemplos;

public class abecedario {
	
	public static void pintarVector(char abecedario[]) {
		for(int i=0; i<abecedario.length ;i++) {
			System.out.print(abecedario[i] + "  " );
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Haz un metodo que genere un vector con todas las letras mayusculas del abecedario
		//Pista  char cor="A" , suma
		
		char abecedario[] = new char[26];
		char car = 'A';
		
		for(int i=0; i<abecedario.length ;i++) {
			abecedario[i]=car;
			car++;
			
		}
		
		pintarVector(abecedario);
	}

}
