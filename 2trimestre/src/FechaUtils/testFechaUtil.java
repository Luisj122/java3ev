package FechaUtils;

import java.time.LocalDate;

public class testFechaUtil {

	public static void main(String[] args) {
		
		fechaUtils f1 = new fechaUtils();
		LocalDate f = LocalDate.of(1990, 1, 16);
		
		System.out.println(f1.numYear(f));

	}

}
