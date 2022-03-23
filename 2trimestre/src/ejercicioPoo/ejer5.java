package ejercicioPoo;

public class ejer5 {
	
	//Propiedades
	
	private double dolar_euro;

		
	//Contructores
	
	ejer5() {
		super();
		this.dolar_euro = 1.36;
	}
	
	public ejer5(double dolar_euro) {
		super();
		this.dolar_euro = dolar_euro;
	}
	
	//Metodos
	
	public double dolaresToEuros(double dolar){
		return dolar * this.dolar_euro;
	}
	
	public double eurosToDorales(double euro) {
		return euro / this.dolar_euro;
	}

	//Getters y setters
	
	public double getDolar_euro() {
		return dolar_euro;
	}

	public void setDolar_euro(double dolar_euro) {
		this.dolar_euro = dolar_euro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("dolar_euro=");
		builder.append(dolar_euro);
		return builder.toString();
	}
	
	
	
	
	
}
