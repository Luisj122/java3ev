package ejerPajaros;

public class Jugador {

	//Propiedades
	private int vida; //1-100
	private int mana;//1-100
	private int damageFisic;
	private int damageMagic;
	private String nombre; 
	private String clase;
	
	//Constructores
	Jugador(){
		this.vida=100;
		this.mana=100;
		this.damageFisic=2;
		this.damageMagic=15;
		this.nombre="Joselito";
		this.clase="Mago";
	}
	

	public Jugador(int vida, int mana, int damageFisic, int damageMagic, String nombre, String clase) {
		this.vida = vida;
		this.mana = mana;
		this.damageFisic = damageFisic;
		this.damageMagic = damageMagic;
		this.nombre = nombre;
		this.clase = clase;
	}

	//Getters Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getDamageFisic() {
		return damageFisic;
	}

	public void setDamageFisic(int damageFisic) {
		this.damageFisic = damageFisic;
	}

	public int getDamageMagic() {
		return damageMagic;
	}

	public void setDamageMagic(int damageMagic) {
		this.damageMagic = damageMagic;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	
	
	@Override
	public String toString() {
		return "Jugador [vida=" + vida + ", mana=" + mana + ", damageFisic=" + damageFisic + ", damageMagic="
				+ damageMagic + ", nombre=" + nombre + ", clase=" + clase + "]";
	}
	
	
	public void golpear(String tipo, Jugador rival) {
		if(tipo.equals("magico")) {
			//Quitar al rival la vida de mi golpe magico
			
			if(this.mana>=5) {
				rival.setVida(rival.getVida()-this.damageMagic);
				this.mana -=5;//usa 5 de mana cada vez que use golpe magico
			}
			
			
		}else if(tipo.equals("fisico")) {
			rival.setVida(rival.getVida()-this.damageFisic);
		}
		
		if(rival.getVida()<=0) {
			System.out.println(this.nombre + " win");
		}
	}
	
	
	
	
	
}
