package HerenciaBanco;

import java.util.Objects;

public class CuentaBancaria {
	
	protected StringBuilder numeroCuenta;
	protected double saldo;
	protected boolean tieneTarjetaCredito;
	protected boolean tieneTarjetaDebito;
	protected double comisionesA;
	
	
	
	public CuentaBancaria(CuentaBancaria copia) {
		super();
		this.numeroCuenta = copia.numeroCuenta;
		this.saldo = copia.saldo;
		this.tieneTarjetaCredito = false;
		this.tieneTarjetaDebito = false;
		this.comisionesA = copia.comisionesA;
	}



	public CuentaBancaria( double saldo, double comisionesA) {
		super();
		this.numeroCuenta = generarCuenta();
		this.saldo = saldo;
		this.tieneTarjetaCredito = false;
		this.tieneTarjetaDebito = false;
		this.comisionesA = comisionesA;
	}


	public StringBuilder generarCuenta() {
		int longitud=20;
		StringBuilder contra = new StringBuilder(longitud);
		
		for (int i = 0; i < longitud; i++) {
			contra.append((int)(Math.random()*9+1));
		}
		
		return contra;
		
	}

	/**
	 * @return the numeroCuenta
	 */
	public StringBuilder getNumeroCuenta() {
		return numeroCuenta;
	}



	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(StringBuilder numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}



	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}



	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	/**
	 * @return the tieneTarjetaCredito
	 */
	public boolean isTieneTarjetaCredito() {
		return tieneTarjetaCredito;
	}



	/**
	 * @param tieneTarjetaCredito the tieneTarjetaCredito to set
	 */
	public void setTieneTarjetaCredito(boolean tieneTarjetaCredito) {
		this.tieneTarjetaCredito = tieneTarjetaCredito;
	}



	/**
	 * @return the tieneTarjetaDebito
	 */
	public boolean isTieneTarjetaDebito() {
		return tieneTarjetaDebito;
	}



	/**
	 * @param tieneTarjetaDebito the tieneTarjetaDebito to set
	 */
	public void setTieneTarjetaDebito(boolean tieneTarjetaDebito) {
		this.tieneTarjetaDebito = tieneTarjetaDebito;
	}



	/**
	 * @return the comisiones
	 */
	public double getComisionesA() {
		return comisionesA;
	}



	/**
	 * @param comisiones the comisiones to set
	 */
	public void setComisiones(double comisiones) {
		this.comisionesA = comisiones;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaBancaria [numeroCuenta=");
		builder.append(numeroCuenta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", tieneTarjetaCredito=");
		builder.append(tieneTarjetaCredito);
		builder.append(", tieneTarjetaDebito=");
		builder.append(tieneTarjetaDebito);
		builder.append(", comisiones=");
		builder.append(comisionesA);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public int hashCode() {
		return Objects.hash(numeroCuenta);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(numeroCuenta, other.numeroCuenta);
	}
	
	
	public double ingresar(double cant) {
		double sum=0;
		
		if(cant > 0) {
			sum=this.saldo+cant;
		}
		return sum;
	}
	
	public double retirar(double cant) {
		double rest=0;
		
		if(this.saldo > 0 && cant>0 && cant<=this.saldo) {
			rest=this.saldo-cant;
		}
		return rest;
	}
	

}
