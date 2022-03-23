package ejercicioClase;

import java.util.Objects;

public class notasCurso {
	
	//Atributos
	private String materia;
	private int curso;
	private double nota1Ev;
	private double nota2Ev;
	private double nota3Ev;
	private double notaFinal;
	
	
	
	//Metodos
	public notasCurso(String materia, int curso) {
		super();
		this.materia = materia;
		this.curso = curso;
	}
	
	
	
	public notasCurso(String materia, int curso, double nota1Ev, double nota2Ev, double nota3Ev) {
		super();
		this.materia = materia;
		this.curso = curso;
		this.nota1Ev = nota1Ev;
		this.nota2Ev = nota2Ev;
		this.nota3Ev = nota3Ev;
		this.calcularNotaFinal();
	}



	//To string

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("notasCurso [materia=");
		builder.append(materia);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", nota1Ev=");
		builder.append(nota1Ev);
		builder.append(", nota2Ev=");
		builder.append(nota2Ev);
		builder.append(", nota3Ev=");
		builder.append(nota3Ev);
		builder.append(", notaFinal=");
		builder.append(notaFinal);
		builder.append("]");
		return builder.toString();
	}
	
	//equals
	

	@Override
	public int hashCode() {
		return Objects.hash(curso, materia, nota1Ev, nota2Ev, nota3Ev);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		notasCurso other = (notasCurso) obj;
		return curso == other.curso && Objects.equals(materia, other.materia)
				&& Double.doubleToLongBits(nota1Ev) == Double.doubleToLongBits(other.nota1Ev)
				&& Double.doubleToLongBits(nota2Ev) == Double.doubleToLongBits(other.nota2Ev)
				&& Double.doubleToLongBits(nota3Ev) == Double.doubleToLongBits(other.nota3Ev);
		
		
	}

	/**
	 * @return the materia
	 */
	public String getMateria() {
		return materia;
	}

	/**
	 * @param materia the materia to set
	 */
	public void setMateria(String materia) {
		this.materia = materia;
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
	 * @return the nota1Ev
	 */
	public double getNota1Ev() {
		return nota1Ev;
	}

	/**
	 * @param nota1Ev the nota1Ev to set
	 */
	public void setNota1Ev(double nota1Ev) {
		this.nota1Ev = nota1Ev;
		this.calcularNotaFinal();
	}

	/**
	 * @return the nota2Ev
	 */
	public double getNota2Ev() {
		return nota2Ev;
	}

	/**
	 * @param nota2Ev the nota2Ev to set
	 */
	public void setNota2Ev(double nota2Ev) {
		this.nota2Ev = nota2Ev;
		this.calcularNotaFinal();
	}

	/**
	 * @return the nota3Ev
	 */
	public double getNota3Ev() {
		return nota3Ev;
	}

	/**
	 * @param nota3Ev the nota3Ev to set
	 */
	public void setNota3Ev(double nota3Ev) {
		this.nota3Ev = nota3Ev;
		this.calcularNotaFinal();
	}
	
	/**
	 * @return the notaFinal
	 */
	public double getNotaFinal() {
		this.calcularNotaFinal();	
		return notaFinal;
	}
	
	
	//metodo
	
	


	/**
	 * Devuelve true si la nota final es >=5 
	 * @return
	 */
	public boolean aprobado() {
		if(this.notaFinal >=5) {
			return true;
		}else
			return false;
	}
	
	/**
	 * Calcular la media de las notas y asignarle a notaFinal
	 */
	public void calcularNotaFinal() {
		this.notaFinal=(this.nota1Ev+this.nota2Ev+this.nota3Ev)/3;
		
	}
	
	
	
	
	

}
