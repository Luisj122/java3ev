package repasoExamen;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Baraja {

	protected ArrayList<Carta>baraja;

	public Baraja() {
		super();
		this.baraja = new ArrayList<>();
	}
	
	public abstract Carta Azar();
	
	public void barajar() {
		Collections.shuffle(baraja);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Baraja [baraja=");
		builder.append(baraja);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
