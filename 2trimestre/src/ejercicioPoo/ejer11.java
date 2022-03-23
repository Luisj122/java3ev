package ejercicioPoo;

public class ejer11 {

	//Atributos
	
	private int posicionX;
	private int posicionY;
	private boolean haLlegado;
	private int numeroPasos;
	private static int contarRobots=0;
	private final static int contFilasTablero=100;
	private final static int contColumnasTablero=100;
	
	
	//Constructores
	public ejer11() {
		super();
		this.posicionX = 0;
		this.posicionY = 0;
		this.haLlegado = false;
		this.numeroPasos = 0;
		ejer11.contarRobots++;
	}
	
	public ejer11(int posicionX, int posicionY) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.haLlegado = false;
		this.numeroPasos = 0;
		ejer11.contarRobots++;
	}

	//Getters y Setters
	
	public int getPosicionX() {
		return posicionX;
	}


	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}


	public int getPosicionY() {
		return posicionY;
	}


	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}


	public boolean isHaLlegado() {
		return haLlegado;
	}


	public void setHaLlegado(boolean haLlegado) {
		this.haLlegado = haLlegado;
	}


	public int getNumeroPasos() {
		return numeroPasos;
	}


	public void setNumeroPasos(int numeroPasos) {
		this.numeroPasos = numeroPasos;
	}


	public static int getContarRobots() {
		return contarRobots;
	}


	public static void setContarRobots(int contarRobots) {
		ejer11.contarRobots = contarRobots;
	}
	
	//To String

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ejer11 [posicionX=");
		builder.append(posicionX);
		builder.append(", posicionY=");
		builder.append(posicionY);
		builder.append(", haLlegado=");
		builder.append(haLlegado);
		builder.append(", numeroPasos=");
		builder.append(numeroPasos);
		builder.append(", numeroRobots=");
		builder.append(contarRobots);
		builder.append("]");
		return builder.toString();
	}
	
	//Metodos
	
	public void irArriba() {
		if(this.posicionY<ejer11.contFilasTablero-1	)
			
		this.posicionY++;
		this.numeroPasos++;
	}
	
	public void irAbajo() {
		if(this.posicionY>0)
		this.posicionY--;
		this.numeroPasos++;
	}
	
	public void irDerecha() {
		if(this.posicionX<ejer11.contColumnasTablero-1)
		this.posicionX++;
		this.numeroPasos++;
	}
	
	public void irIzquierda() {
		if(this.posicionX>0)
		this.posicionX--;
		this.numeroPasos++;
	}
	
	
	
}
