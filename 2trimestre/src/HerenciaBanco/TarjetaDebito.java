package HerenciaBanco;

public class TarjetaDebito extends Tarjeta {

	private int saldo;
	
	public TarjetaDebito(String usuario, int saldo) {
		super(usuario,saldo);
		// TODO Auto-generated constructor stub
	}
	
	public TarjetaDebito() {
		super();
		
	}
	
	
	public double ingresar(double cant) {
		double sum=0;
		
		if(cant > 0) {
			sum=this.saldo+cant;
		}
		return sum;
	}
	
	public void compra(double cant) {	
		
		if(this.saldo > 0 && cant>0 && cant<=this.saldo) {
			this.saldo-=cant;
		}
		
	}

}
