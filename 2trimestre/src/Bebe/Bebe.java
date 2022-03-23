package Bebe;

public class Bebe {
	static void pedir() {
		System.out.println(str1 + " , " + str2 + " , " + str3);
	}
	static {
		str2 = "mama tengo hambre";
		str3 = "mama quiero agua";
	}
	Bebe() { System.out.println("Nacimiento del bebe"); }
	
		static String str2, str3, str1="papa quiero jugar";
		
		public static void main(String[] args) {
			System.out.println("El bebe se ha despertado y va a pedir cosas");
			
			//Cuando el bebe dice, llama a la clase bebe y pinta str1
			System.out.println("El bebe dice: "+Bebe.str1);
			
			//El metodo pedir pinta todos los srt
			Bebe.pedir();
	}	
}

