package HerenciaBanco;

public class TarjetaCredito extends Tarjeta {
	
	private int saldo;

	public TarjetaCredito(String usuario, int saldoS) {
		super(usuario, saldoS);
		
	}
	
	public TarjetaCredito() {
		super();
		
	}
	
	public void comprar(double cant) {
		
		this.saldo-=cant;		
	}

}
