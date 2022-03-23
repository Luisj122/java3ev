package HerenciaBanco;

public class CuentaCorriente extends CuentaBancaria{

	protected double modifComisiones=0.4;
	TarjetaCredito tarjetaC;
	TarjetaDebito tarjetaD;
	
	public CuentaCorriente(double saldo, double comisionesA) {
        super(saldo, comisionesA);
        this.comisionesA *= this.modifComisiones;
        this.saldo -= this.comisionesA;
        this.tieneTarjetaCredito=true;
        this.tieneTarjetaDebito=true;
        this.tarjetaC = new TarjetaCredito();
        this.tarjetaD = new TarjetaDebito();
        
    }

	/**
	 * @return the modifComisiones
	 */
	public double getModifComisiones() {
		return modifComisiones;
	}

	/**
	 * @return the tarjetaC
	 */
	public TarjetaCredito getTarjetaC() {
		return tarjetaC;
	}

	/**
	 * @return the tarjetaD
	 */
	public TarjetaDebito getTarjetaD() {
		return tarjetaD;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaCorriente [modifComisiones=");
		builder.append(modifComisiones);
		builder.append(", tarjetaC=");
		builder.append(tarjetaC);
		builder.append(", tarjetaD=");
		builder.append(tarjetaD);
		builder.append("saldo");
		builder.append(this.saldo);
		builder.append("]");
		return builder.toString();
	}
	
	

}
