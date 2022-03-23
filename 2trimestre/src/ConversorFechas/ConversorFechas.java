package ConversorFechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ConversorFechas {

	public static void main(String[] args) {
		
	}
	
	public String normalToAmaricano(String fecha) {
		DateTimeFormatter fechaN = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate f2 = LocalDate.parse(fecha,fechaN);
		
		String nta =f2.format(formato);
		return nta;
		
	}
	
	
	public String americanoToNormal(String fecha) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate tp = LocalDate.parse(fecha);
		String atn =tp.format(formato);
		return atn;
	}
	
	

}
