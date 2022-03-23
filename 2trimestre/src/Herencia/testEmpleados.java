package Herencia;

public class testEmpleados {

	public static void main(String[] args) {
		
		int sum=0;
		int sum2=0;
		
		Repartidor r1 = new Repartidor("Persona 1", 26,26, "zona 3");
		
		if(r1.plus()) {
			 sum += r1.getSalario()+ r1.Plus;
			 r1.setSalario(sum);
		}

		System.out.println(r1);
		
		Comercial c1 = new Comercial("Persona 2" , 35, 35 , 220);

		if(c1.plus()) {
			 sum2 += c1.getSalario()+ r1.Plus;
			 c1.setSalario(sum2);
		}
		
		System.out.println(c1);
		

	}

}
