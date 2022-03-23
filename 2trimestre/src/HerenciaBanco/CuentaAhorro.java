package HerenciaBanco;

public class CuentaAhorro extends CuentaBancaria {
	
	
	private final double modifComisiones=0.5;
	private double tipoInteres;

	
	public CuentaAhorro(double saldo, double comisionesA, double tipoInteres) {
        super(saldo, comisionesA);
        this.comisionesA=modifComisiones;
        this.saldo=(tipoInteres * this.saldo)+this.saldo;
        this.saldo -= comisionesA;
    }


	/**
	 * @return the tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}


	/**
	 * @param tipoInteres the tipoInteres to set
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaAhorro [modifComisiones=");
		builder.append(modifComisiones);
		builder.append(", tipoInteres=");
		builder.append(tipoInteres);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("saldo");
		builder.append(this.saldo);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
