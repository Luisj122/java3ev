package ejerPajaros;

public class cuentaCorriente {
	
	//Propiedades
	private String numero;
	private double saldo;
	
	
	//Constructor
	
	cuentaCorriente() {
		this.saldo= 0;
		this.numero=cuentaCorriente.generarNumero();
		}
	
	public cuentaCorriente(String numero, Double saldo) {
	
		this.numero = numero;
		this.saldo = saldo;
	}

	//Generar numero
	
	public static String generarNumero() {
					
			//Generar un numero aleatorio de cuenta aleatoria
			StringBuilder sb=new StringBuilder ("ES2040050");
				for (int i = 0; i < 12; i++) {//Faltan 12 numeros
					int num=(int)(Math.random()*10);//0 a 9
					sb.append(num);
				}
				return sb.toString();
			
		
	}
	
	/**
	 * Incrementa el saldo en la cantidad que se pasa con parametro
	 * @param cantidad
	 */
	public void ingreso(double cantidad) {
		
		this.saldo +=cantidad;		
	}
	
	/**
	 * Si hay saldo suficiente saldo en la cuenta se resta la cantidad del cargo
	 * @param cantidad
	 */
	public void cargo(double cantidad) {
		
		if((this.saldo - cantidad >=0)) {
			this.saldo -=cantidad;
		}
	}
	
	/**
	 * Traspaso cantidad de esta cuenta a la cuenta pasada como parametro
	 * @param otra
	 * @param cantidad
	 */
	public void transferencia(cuentaCorriente otra, double cantidad) {
		if((this.saldo - cantidad >=0)) {
			this.saldo -=cantidad;//Me quito yo la cantidad
			otra.setSaldo(cantidad + otra.getSaldo());
		}
		
	}
	
	//To string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CC = ");
		builder.append(numero);
		builder.append(", saldo=");
		builder.append(saldo);
		
		return builder.toString();
	}
	
	//Generar getter y setter

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}
		
	

}
