package GestionBiblioteca;

import java.util.ArrayList;
import java.util.Objects;

public class Publicacion {
	
	protected ArrayList<Autor>autores;
	
	//Atributos
	protected String ISBN;
	protected String titulo;
	protected int anio;
	protected int paginas;
	
	public Publicacion( String titulo, int anio, int paginas) {
		super();
		ISBN = generarIsbn();
		this.titulo = titulo;
		this.anio = anio;
		this.paginas = paginas;
		this.autores = new ArrayList<>();
	}
	
	public Publicacion(Publicacion copia) {
		super();
		ISBN = copia.ISBN;
		this.titulo = copia.titulo;
		this.anio = copia.anio;
		this.paginas = copia.paginas;
		this.autores = new ArrayList<>();
	}



	//Metodos
	
	/*
	 *Metodo para generar un isbn aleatorio 
	 */
	public String generarIsbn() {
        StringBuilder isbn = new StringBuilder();

        for(int i=0; i<5;i++) {
            isbn.append((char) (Math.random()*(48-57)+57));
        }
        return isbn.toString();
    }
	
	/*
	 * Metodo para añadir un autor al arraylist
	 */
	public void addAutor(String nombre, String apellido) {
		autores.add(new Autor(nombre, apellido));
	}
	
	/*
	 * Meotodo para borrar un autor del array
	 */
	public void deleteAutor(String nombre, String apellido) {
		
		autores.remove(new Autor(nombre,apellido));
		
	}

	


	/**
	 * @return the autores
	 */
	public ArrayList<Autor> getAutores() {
		return autores;
	}
	

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publicacion [ISBN=");
		builder.append(ISBN);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", anio=");
		builder.append(anio);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append("]");
		return builder.toString();
	}




	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return Objects.equals(titulo, other.titulo);
	}
	
	
	
	

}
