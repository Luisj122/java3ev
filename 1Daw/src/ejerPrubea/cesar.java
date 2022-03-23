package ejerPrubea;

public class cesar {

	public static void name() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String des="";
        String mensaje = "";


        String prueba = "algo algo";

        for (char i = 0; i < prueba.length(); i++) {
            char cifrado=(char) (prueba.charAt(i)+7);
            mensaje+=cifrado;
           

        }

        System.out.print(mensaje);
        System.out.println();

        for (char i = 0; i < prueba.length(); i++) {
           char cifrado=(char) (prueba.charAt(i)-7);
            des+=cifrado;
           

        }
        System.out.println(des);
        }



    
	

}
