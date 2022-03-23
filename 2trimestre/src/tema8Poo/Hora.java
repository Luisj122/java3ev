package tema8Poo;

import java.util.Objects;

public class Hora {

	//Atributos
	
	private int milisegundos;
	private int segundos;
	private int minutos;
	private int horas;
	
	
	//Contructores
	
	public Hora() {
		super();
		this.segundos = 0;
		this.minutos = 0;
		this.horas = 0;
	}
	
	public Hora(int segundos, int minutos, int horas) {
		super();
		this.segundos = segundos;
		this.minutos = minutos;
		this.horas = horas;
	}
	
	public Hora(Hora copia) {
		super();
		this.segundos = copia.segundos;
		this.minutos = copia.minutos;
		this.horas = copia.horas;
	}
	
	public Hora(String hora) {
		super();	
		this.segundos= Integer.parseInt(hora.substring(6, 8));
		this.minutos= Integer.parseInt(hora.substring(3, 5)); 
		this.horas= Integer.parseInt(hora.substring(0, 2)); 
			
	}
	
	

	/**
	 * @return the milisegundos
	 */
	public int getMilisegundos() {
		return milisegundos;
	}

	/**
	 * @param milisegundos the milisegundos to set
	 */
	public void setMilisegundos(int milisegundos) {
		this.milisegundos = milisegundos;
	}

	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * @param segundos the segundos to set
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
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
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	/**
	 * Metodo para comprobar la hora valida
	 * @return
	 */
	public boolean horaValida() {
		if((this.horas>=0 && this.horas<=23) && (this.minutos>=0 && this.minutos<=59) && (this.segundos>=0 && this.segundos<=59) && (this.milisegundos >= 0 && this.milisegundos <= 999)) {
			return true;
			}
		return false;
	}


	public void segundoSiguiente() {
		this.segundos++;
		
			if(this.segundos>59) {
				this.minutos++;
				this.segundos=0;
				}
			
			if(this.minutos>59) {
				this.horas++;
				this.minutos=0;
			}
			
			if(this.horas>23) {
				this.horas=0;
			}
		}

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hora [Horas=");
		builder.append(horas);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append(", segundos=");
		builder.append(segundos);
		builder.append("]");
		return builder.toString();
	}

	public String horaCompleta() {

			StringBuilder builder = new StringBuilder();
			builder.append("Hora [Horas=");
			builder.append(horas);
			builder.append(", minutos=");
			builder.append(minutos);
			builder.append(", segundos=");
			builder.append(segundos);
			builder.append(", milisegundos=");
			builder.append(milisegundos);
			builder.append("]");
			return builder.toString();
		
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hora other = (Hora) obj;
		return horas == other.horas && minutos == other.minutos && segundos == other.segundos;
	}
	
	
	
	
	
	
}
