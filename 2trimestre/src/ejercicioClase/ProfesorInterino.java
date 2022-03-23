package ejercicioClase;

import java.time.LocalDate;
import java.time.Period;

public class ProfesorInterino extends Profesor {

	//Atributos
	private LocalDate FechaComienzo;

		

	public ProfesorInterino(int numeroRegistroPersonal, String nombre, String apellidos, LocalDate fechaNacimiento,
			double nominaBase, LocalDate fechaComienzo) {
		super(numeroRegistroPersonal, nombre, apellidos, fechaNacimiento, nominaBase);
		FechaComienzo = fechaComienzo;
	}

	public ProfesorInterino(ProfesorInterino p) {
		super(p);
		FechaComienzo = p.FechaComienzo;
	}
	
	public ProfesorInterino() {
		super();
		FechaComienzo = LocalDate.now();
	}
	


	/**
	 * @return the fechaComienzo
	 */
	public LocalDate getFechaComienzo() {
		return FechaComienzo;
	}



	/**
	 * @param fechaComienzo the fechaComienzo to set
	 */
	public void setFechaComienzo(LocalDate fechaComienzo) {
		FechaComienzo = fechaComienzo;
	}

	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProfesorInterino [FechaComienzo=");
		builder.append(FechaComienzo);
		builder.append(this.toString());
		builder.append("]");
		return builder.toString();
	}



	@Override
	public double importeNomina() {
		// TODO Auto-generated method stub
		return this.nominaBase * 1.1;
	}
	
	public void NumeroMD() {
		
		LocalDate fechaC = this.FechaComienzo;
		LocalDate fechaF = LocalDate.now();
		
		Period periodo = Period.between(fechaC, fechaF);
		
		System.out.printf("Mes %s"+ "Dia %s" ,periodo.getMonths(),periodo.getDays());
		
		
		
	}

}
