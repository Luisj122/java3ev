package HerenciaBanco;

public class testCuentaBanco {

	public static void main(String[] args) {

		
		Banco b1 = new Banco();
		
		CuentaCorriente c1 = new CuentaCorriente(50, 1);
		CuentaAhorro c2 = new CuentaAhorro(100, 2,1);
		CuentaJoven c3 = new CuentaJoven(250, 5);
		
		b1.addCuenta(c1);
		b1.addCuenta(c2);
		b1.addCuenta(c3);
		
		System.out.println(b1.getCuenta(c1.getNumeroCuenta()).ingresar(1000000));
		b1.getCuenta(c1.getNumeroCuenta()).ingresar(1000000);
		System.out.println(b1);
	

	}

}
