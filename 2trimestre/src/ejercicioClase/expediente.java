package ejercicioClase;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class expediente {

	//Tipo enum definidos para mi clase
	enum Modalidad {FPB, GRADOMEDIO, GRADOSUPERIOR, BACHILLERATO}
	
	//Propiedades
	private static int totalAlumnado = 0;
	private final int id = expediente.totalAlumnado+1;
	private String nombre;
	private String apellido;
	private char sexo;
	private LocalDate fechaNacimiento;
	private Modalidad modalidad;
	private int curso;
	private ArrayList<notasCurso>notas;
	
	/**
	 * Constructores
	 */
	
	expediente(String nombre, String apellido, LocalDate fecha, int curso) {
		expediente.totalAlumnado++;
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fecha;
		this.curso = curso;
		//Inicializar ArrayList
		
		this.notas = new ArrayList<>();
	}

	
	//Getter y Setter
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the modalidad
	 */
	public Modalidad getModalidad() {
		return modalidad;
	}

	/**
	 * @param modalidad the modalidad to set
	 */
	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	/**
	 * @return the curso
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * @return the notas
	 */
	public ArrayList<notasCurso> getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(ArrayList<notasCurso> notas) {
		this.notas = notas;
	}

	/**
	 * @return the totalAlumnado
	 */
	public static int getTotalAlumnado() {
		return totalAlumnado;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("expediente [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", modalidad=");
		builder.append(modalidad);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", notas=");
		builder.append(notas);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellido, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		expediente other = (expediente) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(nombre, other.nombre);
	}
	
	
	public int getEdad() {
		return LocalDate.now().getYear() - this.fechaNacimiento.getYear();
	}
	
	
	public boolean mayorEdad() {
		if(this.getEdad()>=18) {
			return true;
		}
		return false;
	}
	/*
	public boolean titula() {
		if(this.modalidad == modalidad.BACHILLERATO)
	}*/
}
