package ejercicioPoo;

public class ejer9 {
	
	//Propiedades
	
	private int codigo;
	private String estado;
	private String problema;
	private String solucion;
	private static int pendientes=0;
	
	//Constructores
	
	

	
	public ejer9(int codigo, String problema) {
		super();
		this.codigo=codigo;
		this.estado = "Abierto";
		this.problema = problema;
		ejer9.pendientes++;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ejer9 [codigo=");
		builder.append(codigo);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", problema=");
		builder.append(problema);
		builder.append(", solucion=");
		builder.append(solucion);
		builder.append("]");
		return builder.toString();
	}
	
	
	public void resuelve(String solucion) {
		this.estado="Resuelto";
		this.solucion=solucion;
		ejer9.pendientes--;
		
	}
	
	//Getters y setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	public static int getPendientes() {
		return pendientes;
	}

	public static void setPendientes(int pendientes) {
		ejer9.pendientes = pendientes;
	}

	
}
