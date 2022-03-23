package tema8Poo;

public class Persona {
	
	//Atributos 
	private String nombre;
	private int edad;
	private String sexo;
	private double peso;
	private double altura;
	
	//Constructores 
	
	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.sexo = "h";
		this.peso = 0;
		this.altura = 0;
	}
	
	
	public Persona(String nombre, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad	;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}


	public Persona(String nombre, int edad, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Persona(Persona copia) {
		super();
		this.nombre = copia.nombre;
		this.edad = copia.edad;
		this.sexo = copia.sexo;
		this.peso = copia.peso;
		this.altura = copia.altura;
	}
	
	//Metodo
	
	/**
	 * Metodo para indicar el peso ideal 
	 * @param peso
	 * @param altura
	 * @return
	 */
	public int calcularIMC() {
		
		int pesoIdeal=(int) (this.peso/Math.pow(this.altura, 2));
		int pesoSNS =0;
		if(pesoIdeal<20) {
			pesoSNS = -1;
		}else if(pesoIdeal>=20 && pesoIdeal<=25) {
			pesoSNS = 0;
		}else if(pesoIdeal>25) {
			pesoSNS =1;
		}
		
		return pesoSNS;
		
	}
	
	
	/**
	 * Metodo para indicar si es mayor de edad
	 * @param edad
	 * @return
	 */
	public boolean esMayorEdad() {
		if(this.edad>=18) {
			return true;
		}
		
		return false;
			
	}

	
	//Getter y Setters



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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}


	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}


	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}


	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}


	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
