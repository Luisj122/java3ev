package DadosPoker;

public class Resultado {

	//Atributos
	private int valor;
	private int jugada;
	
	//Constructores
	public Resultado(int valor, int jugada) {
		super();
		this.valor = valor;
		this.jugada = jugada;
	}

	
	/**
	 * @return the jugada
	 */
	public int getValor() {
		return valor;
	}
	
	/**
	 * @return the tirada
	 */
	public int getJugada() {
		return jugada;
	}
	
	
	/**
	 * Metodo para sacar un nuermo entero
	 * @param otro
	 * @return
	 */
	public int ganador(Resultado otro) {
		
		if(this.jugada > otro.jugada) {
			return 0;
		}else if(this.jugada < otro.jugada) {
			if(this.jugada == otro.jugada) {
				if(this.valor > otro.valor) {
					return 0;
				}else if(this.valor < otro.valor) {
					return 1;
				}else if(this.valor == otro.valor && this.jugada == otro.jugada) {
					return 2;
				}	
			}
			return 1;
		}
		
		return -1;
	}
	
}
