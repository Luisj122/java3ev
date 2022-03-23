package tema8Poo;

import java.util.Objects;

public class Direccion {

	//Atributos
	private String tipoNombreVia;
	private int numero;
	private String poblacion;
	private String provincia;
	private int cp;
	private String pais;
	private double latitud;
	private double longitud;
	
	
	//Constructor
	public Direccion() {
		super();
		this.tipoNombreVia = "";
		this.numero = 0;
		this.poblacion = "";
		this.provincia = "";
		this.cp = 0;
		this.pais = "";
		this.latitud = 0;
		this.longitud = 0;
	}
	
	public Direccion(String tipoNombreVia, int numero, String poblacion, String provincia, int cp, String pais,
			double latitud, double longitud) {
		super();
		this.tipoNombreVia = tipoNombreVia;
		this.numero = numero;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.cp = cp;
		this.pais = pais;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	
	public Direccion(Direccion copia) {
		super();
		this.tipoNombreVia = copia.tipoNombreVia;
		this.numero = copia.numero;
		this.poblacion = copia.poblacion;
		this.provincia = copia.provincia;
		this.cp = copia.cp;
		this.pais =copia.pais;
		this.latitud = copia.latitud;
		this.longitud = copia.longitud;
	}
	
	//Getters y Setters

	/**
	 * @return the tipoNombreVia
	 */
	public String getTipoNombreVia() {
		return tipoNombreVia;
	}

	/**
	 * @param tipoNombreVia the tipoNombreVia to set
	 */
	public void setTipoNombreVia(String tipoNombreVia) {
		this.tipoNombreVia = tipoNombreVia;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the poblacion
	 */
	public String getPoblacion() {
		return poblacion;
	}

	/**
	 * @param poblacion the poblacion to set
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	/**
	 * @return the cp
	 */
	public int getCp() {
		return cp;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(int cp) {
		this.cp = cp;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the latitud
	 */
	public double getLatitud() {
		return latitud;
	}

	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	/**
	 * @return the longitud
	 */
	public double getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direccion [tipoNombreVia=");
		builder.append(tipoNombreVia);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", poblacion=");
		builder.append(poblacion);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", cp=");
		builder.append(cp);
		builder.append(", pais=");
		builder.append(pais);
		builder.append(", latitud=");
		builder.append(latitud);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(latitud, longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return Double.doubleToLongBits(latitud) == Double.doubleToLongBits(other.latitud)
				&& Double.doubleToLongBits(longitud) == Double.doubleToLongBits(other.longitud);
	}
	
	
	
	public double distanciaKM(Direccion otra) {
		
		double lat1 = Math.toRadians(this.latitud);
        double lat2 = Math.toRadians(otra.latitud);
        double long1 = Math.toRadians(this.longitud);
        double long2 = Math.toRadians(otra.longitud);
        double r=6378;
        double alat= lat2 - lat1;
        double along= long2-long1;
        double a= (Math.pow(Math.sin(alat/2), 2)) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(along/2),2);
        double c = 2 * (Math.atan2(Math.sqrt(a), Math.sqrt(1-a)));
        
        return r * c;
       
    
	}
	
}
