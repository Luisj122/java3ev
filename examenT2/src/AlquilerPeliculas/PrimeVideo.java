package AlquilerPeliculas;

import java.util.ArrayList;

/**
 * 
 * @author usuario
 *
 */
public class PrimeVideo {
	
	protected ArrayList<Multimedia>catalogo;
	protected ArrayList<Cliente>suscriptores;
	protected double ganacias;
	
	/**
	 * 
	 */
	public PrimeVideo() {
		super();
		this.catalogo = new ArrayList<>();
		this.suscriptores = new ArrayList<>();
		this.ganacias = 0;
	}
	
	/**
	 * 
	 * @param c objeto cliente
	 */
	public void addSusciptor(Cliente c) {
		for (Cliente us : suscriptores) {
			if(!(us.equals(c))) {
				suscriptores.add(c);
			}
			
		}
	}
	
	/**
	 * 
	 * @param c objeto cliente
	 */
	public void delSuscriptor(Cliente c) {
		suscriptores.remove(c);
	}
	
	/**
	 * 
	 * @param m objeto multimedia
	 */
	public void addMultimedia(Multimedia m) {
		for (Multimedia mul : catalogo) {
			if(!(mul.equals(m))) {
				catalogo.add(m);
			}
			
		}
	}
	
	/**
	 * 
	 * @param m objeto multimedia
	 */
	public void delMultimedia(Multimedia m) {
		catalogo.remove(m);
	}
	
	/**
	 * 
	 * @param m objeto multimedia
	 * @param c objeto cliente
	 */
	public void ver(Multimedia m, Cliente c) {
		if((!(c.esPro())) && m.isPlus()) {
			this.ganacias = m.precio;
		}
	}
	
	/**
	 * 
	 * @return ganancias
	 */
	public double getGanancias() {

        return ganacias * 12;

    }

}
