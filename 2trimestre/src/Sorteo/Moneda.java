package Sorteo;

public class Moneda extends Sorteo {

	@Override
	public int lanzar() {
		int tp;
		String[] tipo = {"Cara", "Cruz"};
		tp = (int)(Math.random()*2)+1-1;
		System.out.println(tipo[tp]);
		return -1;
	}

}
