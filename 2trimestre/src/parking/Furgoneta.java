package parking;

import java.time.DayOfWeek;

public class Furgoneta extends Vehiculo implements Descontable {
	
	protected float longitud;
	Parking parking;
	

	public Furgoneta(String matricula, String marca, float longitud) {
		super(matricula, marca);
		// TODO Auto-generated constructor stub
		this.longitud = longitud;
	}
	
	public Furgoneta(Furgoneta copia) {
		super(copia);
		// TODO Auto-generated constructor stub
		this.longitud = copia.longitud;
	}
	

	public Furgoneta() {
		super();
		this.longitud = 0;
	}

	/**
	 * @return the longitud
	 */
	public float getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	@Override
	public double calcularImporte() {
				
		return Parking.PRECIO_BASE_POR_MINUTO * this.calcularMinutos() + 
				Parking.PRECIO_BASE_POR_METRO * this.longitud - this.descuento();
	}

	@Override
	public double descuento() {
		double descuento = 0;
		this.fechaEntrada.getDayOfWeek();
		if(calcularMinutos() > 120) {
			descuento += 0.03;
			
		}
		if(calcularMinutos() > 3600) {
			descuento += 0.2;
		}
		if(!(this.fechaEntrada.getDayOfWeek().equals(DayOfWeek.SATURDAY)
			|| this.fechaEntrada.getDayOfWeek().equals(DayOfWeek.SUNDAY))) {
			descuento += 0.1;
		}
		return descuento;
	}
	
	

}
