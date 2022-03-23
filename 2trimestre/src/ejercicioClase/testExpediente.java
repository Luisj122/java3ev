package ejercicioClase;

import java.time.LocalDate;

public class testExpediente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		expediente alumno1 = new expediente("Carlos", "Guerrero", LocalDate.of(2000, 2, 20), 1);
		System.out.println(alumno1);
		
		alumno1.getNotas().add(new notasCurso("Programacion", 1,5,6,7));
		System.out.println(alumno1);
		
		

	}

}
