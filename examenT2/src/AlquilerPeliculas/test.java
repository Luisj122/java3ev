package AlquilerPeliculas;

/**
 * 
 * @author usuario
 *
 */
public class test {
	
	
	/**
	 * 
	 * @param args test de las peliculas
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeVideo p1 = new PrimeVideo();

		for (int i = 1; i <=170; i++) {
			Pelicula p = new Pelicula("p1", false, 10, Genero.AVENTURAS, 12);
			
			p1.addMultimedia(p);
			
				for (int j = 1; j <= 30; j++) {
					Pelicula pP = new Pelicula("p1", true, 10, Genero.AVENTURAS, 12);
					p1.addMultimedia(pP);
					
					for (int k = 1; k <= 1000; k++) {
						Cliente c = new Cliente("a", "d","f");
						p1.addSusciptor(c);
		
							for (int k2 = 1; k2 <= 250; k2++) {
								ClientePrime cp = new ClientePrime("a", "np1", "emp1");
								p1.addSusciptor(cp);
								
								for (int l = 1; l <= 40; l++) {
									p1.ver(p, c);
									
								}
								
							}	
						}
					}			
				}
	System.out.println(p1.getGanancias());
	
	Serie serie = new Serie("s1", true, 5, Genero.AVENTURAS);
	for(int i=0; i<10; i++) {
		Temporada t = new Temporada(i);
			for(int j=0; j<10; j++) {
				t.addEpisodio(new Episodio("Episodio "+j, 50));
			}
				serie.addTemporadas(t);
		}
		System.out.println(serie);
	}
}