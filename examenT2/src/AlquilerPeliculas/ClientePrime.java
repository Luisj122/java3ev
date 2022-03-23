package AlquilerPeliculas;

/**
 * 
 * @author usuario
 *
 */
public class ClientePrime extends Cliente{
	
	protected static final double precioMensual = 3;

	/**
	 * 
	 * @param dni del cliente
	 * @param nombre del cliente
	 * @param email del cliente
	 */
	public ClientePrime(String dni, String nombre, String email) {
		super(dni, nombre, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esPro() {
		return false;
	}

	@Override
	public double getPrecioMensuales() {
		return 3;
	}

}
