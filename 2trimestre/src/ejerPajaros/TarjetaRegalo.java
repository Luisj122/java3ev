package ejerPajaros;

public class TarjetaRegalo {
	
	//Propiedades
	
	private static int num=0;
	
	private int numero;
	private double saldo;
	
	
	//Constructor
	
	TarjetaRegalo() {
		this.saldo=0;
		TarjetaRegalo.num++;//Suma 1 al numero de objetos creados
		this.numero = TarjetaRegalo.num;
		
	}
	
	TarjetaRegalo(double cantidad) {
		this.saldo=cantidad;
		TarjetaRegalo.num++;//Suma 1 al numero de objetos creados
		this.numero = TarjetaRegalo.num;
		
	}


	public TarjetaRegalo(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}	
	
	//Generar Numero de la tarjeta
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
	 * 
	 * @param cantidad
	 */
	public void gasta(double cantidad) { //resta al sello la cantidad
		this.saldo -=cantidad;
		
	}
	public void fuscionarTarjeta(TarjetaRegalo t) {
		this.saldo +=t.getSaldo();
		t.setSaldo(0);
		
	}
	//pasa el sello de t a this sumandolo
	//Pon t a null, lo borra
	//t=null borrar objeto
	
	//ToString
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tarjeta Nº= ");
		builder.append(numero);
		builder.append(", saldo=");
		builder.append(saldo);
		return builder.toString();
	}


	public static int getNum() {
		return num;
	}


	public static void setNum(int num) {
		TarjetaRegalo.num = num;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//getters y setters
	
	
	
	
}
