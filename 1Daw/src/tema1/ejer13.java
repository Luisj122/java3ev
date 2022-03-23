package tema1;

public class ejer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t=11120;
		int hora, minuto, segundo;
		hora= (int)Math.floor(t/3600) ;
		minuto=(int)Math.floor(t%3600/60);
		segundo=(int)Math.floor(t%3600%60);
		System.out.println(hora + ":" + minuto + ":" + segundo);
	}

}
