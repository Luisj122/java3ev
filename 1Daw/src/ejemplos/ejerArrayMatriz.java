package ejemplos;

public class ejerArrayMatriz {

	public static void pintarMatriz(int notas[][]) {
		for (int i = 0;  i< notas.length; i++) {
			//Pinta la fila entera 
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			//Cuando termino la fila, pinto un salto de linea
			System.out.println();
		}
		
	}
	
	public static void pintaMedia(int notas[][]) {
		
		String asignatura[]= {"Fol", "SSII", "LM", "BBDD", "Entornos", "Programacion"};
		
		for (int i = 0;  i< notas.length; i++) {
			int total=0;
			for (int j = 0; j < notas[i].length; j++) {
				total=total+notas[i][j];
			}
			System.out.println("Media de " + asignatura[i] + " es " + total/notas[i].length);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Asignaturas: FOL, SSII, LM, BBDD, Entornos, Programacion
		//Notas por asignatura: 6 notas
		
		//Matriz 6x4
		int notas[][]=new int[6][6];
		
		//Llenamos la matriz de forma aleatoria
		
		for (int i = 0;  i< notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				notas[i][j]=(int)(Math.random()*10+1); 
			}
			
		}
		pintarMatriz(notas);
		pintaMedia(notas);
	}

}
