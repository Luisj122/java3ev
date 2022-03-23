package ejercicioClase;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {

	//Atributos
	
	private boolean catedratico;
	
	
	
	public ProfesorTitular(int numeroRegistroPersonal, String nombre, String apellidos, LocalDate fechaNacimiento,
			double nominaBase, boolean catedratico) {
		super(numeroRegistroPersonal, nombre, apellidos, fechaNacimiento, nominaBase);
		this.catedratico = catedratico;
	}



	


	public ProfesorTitular(ProfesorTitular p) {
		super(p);
		// TODO Auto-generated constructor stub
		this.catedratico = p.catedratico;
	}






	public ProfesorTitular(Profesor copia) {
		super(copia);
		// TODO Auto-generated constructor stub
	}



	public ProfesorTitular() {
		super();
		this.catedratico = false;
	}



	public ProfesorTitular(boolean catedratico) {
		super();
		this.catedratico = catedratico;
	}

	

	/**
	 * @return the catedratico
	 */
	public boolean isCatedratico() {
		return catedratico;
	}



	/**
	 * @param catedratico the catedratico to set
	 */
	public void setCatedratico(boolean catedratico) {
		this.catedratico = catedratico;
	}



	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProfesorTitular [catedratico=");
		builder.append(catedratico);
		builder.append(this.toString());
		builder.append("]");
		return builder.toString();
	}



	@Override
	public double importeNomina() {
		
		return this.nominaBase * 1.3;
	}

	

}
