package HerenciaBanco;

public class Tarjeta {
	protected String usuario;
	protected StringBuilder numeroTarjeta;
	protected StringBuilder cvv;
	
	
	public Tarjeta(String usuario, int cvv) {
		super();
		this.usuario = usuario;
		this.cvv = generarCvv();
		this.numeroTarjeta = generarCuenta();
	}
	
	public Tarjeta() {
		super();
		this.usuario = "";
		this.cvv = generarCvv();
		this.numeroTarjeta = generarCuenta();
	}
	
	//Generar cuenta
	public StringBuilder generarCuenta() {
		
		StringBuilder cuenta = new StringBuilder();
		
		for (int i = 0; i < 10; i++) {
			cuenta.append((int)(Math.random()*9+1));
		}
		
		return cuenta;
		
	}
	
	//Generar cvv
	public StringBuilder generarCvv() {
	
		StringBuilder cvv = new StringBuilder();
		
		for (int i = 0; i < 5; i++) {
			cvv.append((int)(Math.random()*9+1));
		}
		
		return cvv;
		
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @return the numeroTarjeta
	 */
	public StringBuilder getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @return the cvv
	 */
	public StringBuilder getCvv() {
		return cvv;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tarjeta [usuario=");
		builder.append(usuario);
		builder.append(", numeroTarjeta=");
		builder.append(numeroTarjeta);
		builder.append(", cvv=");
		builder.append(cvv);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}
