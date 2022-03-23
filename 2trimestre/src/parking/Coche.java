package parking;

import java.time.DayOfWeek;

public class Coche extends Vehiculo implements Descontable {
	
	public enum combustible{
		ELECTRICO, HIDROGENO, HIBRIDO_ENCHUFABLE, HIBRIDO, GASOLINA, DIESEL
	}

	protected combustible tipo;
	
	public Coche(String matricula, String marca, combustible tipo) {
		super(matricula, marca);
		// TODO Auto-generated constructor stub
		this.tipo = tipo;
	}
	
	public Coche(String matricula, String marca) {
		super(matricula, marca);
		// TODO Auto-generated constructor stub
		
	}
	
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Coche(Coche copia) {
		super(copia);
		// TODO Auto-generated constructor stub
		this.tipo = copia.tipo;
	}

	@Override
	public double calcularImporte() {
						
		return Parking.PRECIO_BASE_POR_MINUTO * this.calcularMinutos() - this.descuento();
	}

	@Override
	public double descuento() {
	
		double descuento=0;
				
		if(calcularMinutos()>120) {
			descuento+= 0.05;
		}
		if(calcularMinutos()>3600) {
			descuento+=0.3;
			
		}
		this.fechaEntrada.getDayOfWeek();
		if(this.fechaEntrada.getDayOfWeek().equals(DayOfWeek.SATURDAY)
		   || this.fechaEntrada.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			descuento+=0.1;
		}
		if(this.tipo==combustible.GASOLINA || this.tipo==combustible.DIESEL) {
			descuento+= 0.1;
		}
		return descuento;
	}
	
	
	
	

}
