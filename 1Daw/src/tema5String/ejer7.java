package tema5String;

public class ejer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("String builder");
		
			StringBuilder builder=new StringBuilder("Hola");  
	        builder.append("java");  
	        System.out.println(builder);  
	        
	        //StringBuilder es mas rapido que StringBuffer por lo que es recomendado usarlo siempre
	        
	        System.out.println();
	        
	        System.out.println("String buffer");
	        
	        StringBuffer buffer=new StringBuffer("Hola");  
	        buffer.append("java");  
	        System.out.println(buffer);
	    
	}

}
