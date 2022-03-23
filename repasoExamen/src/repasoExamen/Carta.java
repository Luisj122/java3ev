package repasoExamen;

public class Carta {
	
	protected int palo;
	protected String figura;
	
	public Carta(int palo, String figura) {
		super();
		this.palo = palo;
		this.figura = figura;
	}
	
	public Carta(Carta copia) {
		super();
		this.palo = copia.palo;
		this.figura = copia.figura;
	}

	/**
	 * @return the palo
	 */
	public int getPalo() {
		return palo;
	}

	/**
	 * @param palo the palo to set
	 */
	public void setPalo(int palo) {
		this.palo = palo;
	}

	/**
	 * @return the figura
	 */
	public String getFigura() {
		return figura;
	}

	/**
	 * @param figura the figura to set
	 */
	public void setFigura(String figura) {
		this.figura = figura;
	}
	
	
	public String getNombreCorto() {
		return this.palo + this.figura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BlackJack [palo=");
		builder.append(palo);
		builder.append(", figura=");
		builder.append(figura);
		builder.append("]");
		return builder.toString();
	}
	
	
}
