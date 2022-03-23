package ejercicioClase;

import java.time.LocalDate;

public abstract class Profesor {
	
	//Atributos
	protected int numeroRegistroPersonal;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNacimiento;
	protected double nominaBase;
	
	
	public Profesor(int numeroRegistroPersonal, String nombre, String apellidos, LocalDate fechaNacimiento,
			double nominaBase) {
		super();
		this.numeroRegistroPersonal = numeroRegistroPersonal;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.nominaBase = nominaBase;
	}
	
	public Profesor() {
		super();
		this.numeroRegistroPersonal = 0;
		this.nombre = "";
		this.apellidos = "";
		this.fechaNacimiento = LocalDate.now();
		this.nominaBase = 0;
	}
	
	public Profesor(Profesor copia) {
		super();
		this.numeroRegistroPersonal = copia.numeroRegistroPersonal;
		this.nombre = copia.nombre;
		this.apellidos = copia.apellidos;
		this.fechaNacimiento = copia.fechaNacimiento;
		this.nominaBase = copia.nominaBase;
	}

	/**
	 * @return the nominaBase
	 */
	public double getNominaBase() {
		return nominaBase;
	}

	/**
	 * @param nominaBase the nominaBase to set
	 */
	public void setNominaBase(double nominaBase) {
		this.nominaBase = nominaBase;
	}

	/**
	 * @return the numeroRegistroPersonal
	 */
	public int getNumeroRegistroPersonal() {
		return numeroRegistroPersonal;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	/**
	 * Metodo abstracto
	 * @return
	 */
	public abstract double importeNomina();

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Profesor [numeroRegistroPersonal=");
		builder.append(numeroRegistroPersonal);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", nominaBase=");
		builder.append(nominaBase);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
