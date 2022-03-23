package ejerPajaros;

public class testCuentaCorriente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cuentaCorriente cc1= new cuentaCorriente();
		cc1.ingreso(100);
		cc1.cargo(50);
		
		System.out.println(cc1);

		cuentaCorriente cc2 = new cuentaCorriente();
		cc2.ingreso(2000);
		System.out.println(cc2);
		cc2.transferencia(cc1, 1000);
		
		cc1.transferencia(cc2, 100);
		
		System.out.println(cc1);
		System.out.println(cc2);
	}

}
