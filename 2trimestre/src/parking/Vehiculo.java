package parking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;


public class Vehiculo implements Descontable {

	protected String matricula;
	protected String marca;
	protected LocalDateTime fechaEntrada;
	protected int minutos;
	protected PlazaAparcamiento plaza;
	
	
	public Vehiculo() {
		super();
		this.matricula = "";
		this.marca = "";
	}
	
	public Vehiculo(String matricula, String marca) {
		super();
		this.matricula = matricula;
		this.marca = marca;
	}
	
	public Vehiculo(Vehiculo copia) {
		super();
		this.matricula = copia.matricula;
		this.marca = copia.marca;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the fechaEntrada
	 */
	public LocalDateTime getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	public void setFechaEntrada(LocalDateTime fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * @param minutos the minutos to set
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	/**
	 * @return the plaza
	 */
	public PlazaAparcamiento getPlaza() {
		return plaza;
	}

	/**
	 * @param plaza the plaza to set
	 */
	public void setPlaza(PlazaAparcamiento plaza) {
		this.plaza = plaza;
	}

	
	   

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append(", plaza=");
		builder.append(plaza);
		builder.append("]");
		return builder.toString();
	}
	
	
	public int calcularMinutos() {
		LocalDateTime ahora = LocalDateTime.now();
		Duration d = Duration.between(this.fechaEntrada,ahora);
		this.minutos=d.toMinutesPart();
		return (int) d.toMinutes();
	
	}
	
	public double calcularImporte() {
		return 0;
	}

	public double descuento() {
		return 0;
	}
	
	
}
