package Sorteo;

public class Dado extends Sorteo {

	
	@Override
	public int lanzar() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*this.posibilidades)+1;
	}

}
