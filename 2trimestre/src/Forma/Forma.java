package Forma;

import java.util.Objects;

public abstract class Forma implements Dibujado {
	
	public abstract double area() ;
		
	
	public abstract void dibujar();

	
	//Propiedades
	protected int id;
	private static int contF=0;
	
	Forma() {
		Forma.contF++;
		this.id=Forma.contF;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the contF
	 */
	public static int getContF() {
		return contF;
	}


	/**
	 * @param contF the contF to set
	 */
	public static void setContF(int contF) {
		Forma.contF = contF;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Forma other = (Forma) obj;
		return id == other.id;
	}

	
	
}
