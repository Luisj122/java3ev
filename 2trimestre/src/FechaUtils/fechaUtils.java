package FechaUtils;

import java.time.LocalDate;
import java.time.Period;

public class fechaUtils {
	
	public static void cuentaAtras() {
		
	}
	
	//Public static String diaCumple()
	
	public int numYear(LocalDate fechaCumple) {
		
		Period anios = Period.between(fechaCumple, LocalDate.now());
		
		return anios.getYears();
	}

}
