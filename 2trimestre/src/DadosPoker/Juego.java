package DadosPoker;

public class Juego {	
	
	Jugador jugador1;
	Jugador jugador2;
	
	//Atributos 
	private static int numPartidas=0;
	private int partidas;
	
	
	//Constructores
	public Juego(String j1, String j2) {
		super();
		Juego.numPartidas++;
		this.partidas = Juego.numPartidas;
		this.jugador1 = new Jugador(j1);
		this.jugador2 = new Jugador(j2);
		
	}


	/**
	 * Metodo para decir que jugador a ganado
	 */
	public void jugar() {
		Resultado r1 = jugador1.valorTirada();
		Resultado r2 = jugador2.valorTirada();
	
		
		if(r1.ganador(r2)== 0) {
			System.out.println("Ha ganado " + this.jugador1.getNombre());
			jugador1.setHaGanado(true);
		}else if(r1.ganador(r2)== 1) {
			System.out.println("Ha ganado " + this.jugador2.getNombre());
			jugador2.setHaGanado(true);
		}else {
			System.out.println("Empate");
		}
		
	}

	/**
	 * Metodo para pintar los jugadores con sus tiradas 
	 * @return
	 */
	public String mostrarResultado() {
		Resultado r1 = jugador1.valorTirada();
		Resultado r2 = jugador2.valorTirada();
		
		
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("Partidas= ");
		builder.append(partidas);
		builder.append("\n");
		
		builder.append(jugador1);
		builder.append(" tiene jugada de ");
		
		if(r1.getValor() == 8) {
			builder.append ("Poker real");
		}else if(r1.getValor() == 7) {
			builder.append ("Poker");
		}else if(r1.getValor() == 6) {
			builder.append ("Full");
		}else if(r1.getValor() == 5) {
			builder.append ("Escalera mayor");
		}else if(r1.getValor() == 4) {
			builder.append ("Escalera menor");
		}else if(r1.getValor() == 3) {
			builder.append ("Piernas");
		}else if(r1.getValor() == 2) {
			builder.append ("Pares dobles");
		}else if(r1.getValor() == 1) {
			builder.append ("Par");
		}
		
		builder.append("\n");
		builder.append(jugador2);
		builder.append(" tiene jugada de ");
		
		if(r2.getValor() == 8) {
			builder.append ("Poker real");
		}else if(r2.getValor() == 7) {
			builder.append ("Poker");
		}else if(r2.getValor() == 6) {
			builder.append ("Full");
		}else if(r2.getValor() == 5) {
			builder.append ("Escalera mayor");
		}else if(r2.getValor() == 4) {
			builder.append ("Escalera menor");
		}else if(r2.getValor() == 3) {
			builder.append ("Piernas");
		}else if(r2.getValor() == 2) {
			builder.append ("Pares dobles");
		}else if(r2.getValor() == 1) {
			builder.append ("Par");
		}
		
		
		return builder.toString();
	}
	
	


	
	

}
