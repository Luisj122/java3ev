package Serie;

import java.util.ArrayList;

public class ejecutable {

	public static void main(String[] args) {
		
		int contS=0;
		
		//Creamos las array
		ArrayList<videoJuegos>juegos;
		ArrayList<Serie>series;
		
		//Creacion de nuevos objetos de la clase video juegos
		videoJuegos j1 = new videoJuegos("juego1", "genero1", "desarrollador1");
		videoJuegos j2 = new videoJuegos("juego2", "genero2", "desarrollador2");
		videoJuegos j3 = new videoJuegos("juego3", "genero3", "desarrollador3");
		
		//Creacion de nuevos objetos de la clase titulo
		Serie s1 = new Serie("titulo1", "genero3", 4);
		Serie s2 = new Serie("titulo2", "genero4", 5);
		Serie s3 = new Serie("titulo3", "genero4", 6);
		
		//Inicializamos el array videojuegos
		juegos = new ArrayList<>();
		
		//Añadimos los objetos a la array
		juegos.add(j1);
		juegos.add(j2);
		juegos.add(j3);
		
		
		//Inicializamos el array serie
		series = new ArrayList<>();
		
		//Añadimos los objetos serie ala array
		series.add(s1);
		series.add(s2);
		series.add(s3);
		
		//Llamamos al metodo entregado
		j1.entregar();
		s1.entregar();
		s2.entregar();
		
		s1.devolver();
		
		//Recorremos el array con el forech
		for (Serie serie : series) {
			System.out.println(serie);
			
			//Un if para contar las series prestadas 
				if(serie.isPrestado()){
					contS++;
				}
		}
		
		System.out.println();
		
		for (videoJuegos juego : juegos) {
			System.out.println(juego);
			
			//If para contar el numero de juegos prestados 
				if(juego.isPrestado()) {
					contS++;
				}
		}
		
		//Pintamos el numero de series y videojuegos prestados 
		System.out.println("Series y Video Juegos prestados : " + contS);
	}
	
	

}
