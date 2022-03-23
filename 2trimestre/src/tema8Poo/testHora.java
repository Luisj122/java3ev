package tema8Poo;

public class testHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hora hora1 = new Hora(55, 59, 5);
	
		
		System.out.println(hora1.horaValida());
		hora1.segundoSiguiente();
		System.out.println(hora1);
		System.out.println(hora1.horaCompleta());
		
		

	}

}
