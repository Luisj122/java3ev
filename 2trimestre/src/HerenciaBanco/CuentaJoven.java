package HerenciaBanco;

public class CuentaJoven extends CuentaBancaria {

	protected double comisiones;
	public CuentaJoven(double saldo, double comisiones) {
		super(saldo,comisiones);
		  this.comisiones *=this.comisiones;
	      this.saldo -= comisiones;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaJoven [comisiones=");
		builder.append(comisiones);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
