package ejercicioPoo;

public class ejer10 {

	//Atributos
	private double kms;
	private double litros;
	private double vmed;
	private double pgas;
	
	
	
	//Constructores
	
	
	public ejer10() {
		super();
		this.kms = 0;
		this.litros = 0;
		this.vmed = 0;
		this.pgas = 0;
	}
	
	public ejer10(double kms, double litros, double vmed, double pgas) {
		super();
		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.pgas = pgas;
	}

	//Metodos
	
	public double getTiempo() {
		double TiEmpleado=this.kms/this.vmed;
		return TiEmpleado;
	}
	
	public double consumoMedio() {
		double consMedio=(this.litros*100)/this.kms;
		return consMedio;
		
	}
	
	public double consumoEuros() {
		double consEuros=((this.litros*100)/this.kms)*this.pgas;
		return consEuros;
	}
	
	//Setters

	public void setKms(double kms) {
		this.kms = kms;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public void setVmed(double vmed) {
		this.vmed = vmed;
	}

	public void setPgas(double pgas) {
		this.pgas = pgas;
	}
	


	
	
	
	
	
	
}
