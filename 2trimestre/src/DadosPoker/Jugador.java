package DadosPoker;

import java.util.Arrays;

public class Jugador  {
	
	//Atributros
	private boolean haGanado;
	private String nombre;
	private int [] tirada ;
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
		this.tirada = tirada();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the haGanado
	 */
	public boolean isHaGanado() {
		return haGanado;
	}
	

	/**
	 * @param haGanado the haGanado to set
	 */
	public void setHaGanado(boolean haGanado) {
		this.haGanado = haGanado;
	}

	/**
	 * @return the tirada
	 */
	public int[] getTirada() {
		return tirada;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jugador ");
		builder.append(nombre);
		builder.append(" con tirada ");
		builder.append(Arrays.toString(tirada));
		return builder.toString();
	}
	
	
	
	/**
	 * Metodo para sacar numeros aleatorios 
	 * @return
	 */
	public int[] tirada() {
		
		this.tirada = new int[5];
		for (int i = 0; i < this.tirada.length; i++) {
			 this.tirada[i]= (int) (Math.random()*6)+1;			 
		}
		Arrays.sort(this.tirada);
		return this.tirada;
		
	}
		
		
		public Resultado valorTirada() {
			
			//Poker real
			if ( (tirada[0] == tirada[1]) && (tirada[0] == tirada[2]) && (tirada[0] == tirada[3]) 
					&& (tirada[0] == tirada[4]) ) {
				Resultado r = new Resultado(8,tirada[0]);
				return r;
			}
			
			//Poker
			if ( ( (tirada[0] == tirada[1]) && (tirada[0] == tirada[2]) && (tirada[0] == tirada[3]) ) ) {
				Resultado r = new Resultado(7,tirada[0]);
				return r;
			}
			if ( (tirada[1] == tirada[2]) && (tirada[1] == tirada[3]) && (tirada[1] == tirada[4]) ) {
				Resultado r = new Resultado(7,tirada[1]);
				return r;
			}
			
			//Full
			if (tirada[0] == tirada[1] && tirada[1] == tirada[2] && tirada[3] == tirada[4]) {
				Resultado r = new Resultado(6,tirada[0]);
				return r;
			}
			if (tirada[2] == tirada[3] && tirada[3] == tirada[4] && tirada[0] == tirada[1]) {
				Resultado r = new Resultado(6,tirada[2]);
				return r;
			}
			
			//Escalera Mayor
			if (tirada[0] == 2 && tirada[1] == 3 && tirada[2] == 4 && tirada[3] == 5 && tirada[4] == 6) {
				Resultado r = new Resultado(5,0);
				return r;
			}
			
			//Escalera Menor
			if (tirada[0] == 1 && tirada[1] == 2 && tirada[2] == 3 && tirada[3] == 4 && tirada[4] == 5) {
				Resultado r = new Resultado(4,0);
				return r;
			}
			
			//Piernas o Trío
			if (tirada[0] == tirada[1] && tirada[1] == tirada[2]) {
				Resultado r = new Resultado(3,tirada[2]);
				return r;
			}
			if (tirada[1] == tirada[2] && tirada[2] == tirada[3]) {
				Resultado r = new Resultado(3,tirada[2]);
				return r;
			}
			if (tirada[2] == tirada[3] && tirada[3] == tirada[4]){
				Resultado r = new Resultado(3,tirada[2]);
				return r;
			}
			
			//Dobles parejas
			if (tirada[0] == tirada[1] && tirada[2] == tirada[3]) {
				if (tirada[0] > tirada[2]) {
					Resultado r = new Resultado(2,tirada[0]);
					return r;
				} else {
					Resultado r = new Resultado(2,tirada[2]);
					return r;
				}
			}
			
			if (tirada[1] == tirada[2] && tirada[3] == tirada[4]) {
				if (tirada[1] > tirada[3]) {
					Resultado r = new Resultado(2,tirada[1]);
					return r;
				} else {
					Resultado r = new Resultado(2,tirada[3]);
					return r;
				}
			}
				
			if (tirada[0] == tirada[1] && tirada[3] == tirada[4]) {
				if (tirada[0] > tirada[3]) {
					Resultado r = new Resultado(2,tirada[0]);
					return r;
				} else {
					Resultado r = new Resultado(2,tirada[3]);
					return r;
				}
			}
			
			
			//Parejas
			if (tirada[0] == tirada[1]) {
				return new Resultado(1,tirada[0]);
			}
			if (tirada[1] == tirada[2]) {
				return new Resultado(1,tirada[1]);
			}
			if (tirada[2] == tirada[3]) {
				return new Resultado(1,tirada[2]);
			}
			if (tirada[3] == tirada[4]) {
				return new Resultado(1,tirada[3]);
			}
			
			
			return new Resultado(-1,-1);
		}


	
	
	

}
