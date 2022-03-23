package tema8Poo;

public class Contrasena {

	//Atributos
	
	private int longitud;
	private StringBuilder constasena;
	
	
	//Constructores 
	
	public Contrasena() {
		super();
		this.longitud = 8;
		this.constasena =generarPassword();
	}

	public Contrasena(int logitud) {
		super();
		this.longitud = logitud;
		this.constasena =generarPassword();
	}
	
	public Contrasena(Contrasena copia) {
		super();
		this.longitud = copia.longitud;
		this.constasena = copia.constasena;
	}
	
	
	//Metodos
	
	
	/**
	 * Metodo para generar una contrasena aleatoria 
	 * @return
	 */
	public StringBuilder generarPassword() {
		StringBuilder contra = new StringBuilder(this.longitud);
		
		for (int i = 0; i < this.longitud; i++) {
			contra.append((char)(Math.random()*(122-33)+33));
		}
		
		return contra;
		
	}

	
	
	/**
	 * Metodo para comprobar si la contrasena generar es fuerte o no
	 * @return
	 */
	public boolean esFuerte() {
		int contMay=0;
		int contMin=0;
		int contNum=0;
		int contSim=0;
		
		for (int i = 0; i < this.constasena.length(); i++) {
				if(this.constasena.charAt(i)>=65 && this.constasena.charAt(i)<=90) {
					contMay++;
				}else if(this.constasena.charAt(i)>=97 && this.constasena.charAt(i)<=122) {
					contMin++;
				}else if(this.constasena.charAt(i)>=48 && this.constasena.charAt(i)<=57) {
					contNum++;
				}else {
					contSim++;
				}					
		}
		
		if(this.longitud == this.longitud && contMay >= 1 && contMin >=2 && contNum >= 2 && contSim >= 1) {
			return true;
		}
		
		return false;
		
	}
	
	
	
	
	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the constasena
	 */
	public StringBuilder getConstasena() {
		return constasena;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contrasena [constasena=");
		builder.append(constasena);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
