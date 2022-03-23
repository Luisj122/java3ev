package AlquilerPeliculas;

/**
 * 
 * @author usuario
 *
 */
public class ClientesPrimerPro extends Cliente {

	protected static double precioMensual = 5;
	
	/**
	 * 
	 * @param dni del cliente
	 * @param nombre del cliente
	 * @param email del cliente
	 */
	public ClientesPrimerPro(String dni, String nombre, String email) {
		super(dni, nombre, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esPro() {
		
		return true;
	}

	@Override
	public double getPrecioMensuales() {
		
		return 5;
	}

}
