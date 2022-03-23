package Scotiky;

import Scotiky.Cancion.genero;

public class testScotify {

	public static void main(String[] args) {
		
		//Creamos un objeto scotify
		Scotify sco1 = new Scotify();
		
		//Creamos los objeto podcast
		Podcast pod1 = new Podcast("pod1", 720, "12/10/2020", 5);
		Podcast pod2 = new Podcast("pod2", 350, "2/3/2020", 4);
		Podcast pod3 = new Podcast("pod3", 550, "5/7/2020", 8);
		
		//Creamos los objeto autor
		Autor au1 = new Autor("autor1", "des1");
		Autor au2 = new Autor("autor2", "des2");
		
		//Creamos los objeto disco
		Disco dis1 = new Disco("disco1", "2/3/2020", "autorG1", "discografia1");
		Disco dis2 = new Disco("disco2", "7/8/2020", "autorG2", "discografia2");
		Disco dis3 = new Disco("disco3", "9/8/2020", "autorG3", "discografia3");
		
		//Creamos los objeto cancion
		Cancion cancion1 = new Cancion("cancion1", 220, genero.HIPHOP, dis1);
		Cancion cancion2 = new Cancion("cancion2", 420, genero.JAZZ, dis2);
		Cancion cancion3 = new Cancion("cancion3", 620, genero.ELECTRONICA, dis3);
		
		//Añadimos la cancion al disco
		dis1.addCancion(cancion1);
		dis2.addCancion(cancion2);
		dis3.addCancion(cancion3);
		
		//Añadimos un autor a una cancion
		cancion1.addAutor(au1);
		cancion2.addAutor(au2);
		cancion3.addAutor(au2);
		
		//Añadimos canciones a scotify
		sco1.addM(cancion1);
		sco1.addM(cancion2);
		sco1.addM(cancion3);
		
		//Metodo reproducir
		cancion1.reproducir();
		
		//Metodo para ver cuantos segundos dura disco 1
		System.out.println("Disco 1 dura " + dis1.getDuracion() + " segundos");
				
		//Buscamos cancion por el autor
		System.out.println(sco1.buscarA(au1));
		System.out.println(sco1.buscarA(au2));
		
		
	}
}
