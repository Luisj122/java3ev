package HerenciaBanco;

import java.util.ArrayList;

public class Banco {
	
	protected ArrayList<CuentaBancaria>cuenta;

	public Banco() {
		super();
		this.cuenta = new ArrayList<>();
	}
	
	public void addCuenta(CuentaBancaria cc) {
		cuenta.add(cc);
		
	}

	public CuentaBancaria getCuenta(StringBuilder numeroDeCuenta) {
		for(CuentaBancaria cuentaB : cuenta) {
			if(cuentaB.getNumeroCuenta().equals(numeroDeCuenta)) {
				return cuentaB;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [cuenta=");
		builder.append(cuenta);
		builder.append("]");
		return builder.toString();
	}


	

}
