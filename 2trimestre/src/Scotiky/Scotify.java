package Scotiky;

import java.util.ArrayList;

public class Scotify {
	
	protected ArrayList<Multimedia>scot;

	public Scotify() {
		super();
		this.scot = new ArrayList<>();
	}
	
	public void addM(Multimedia nombre) {
		scot.add(nombre);
	}
	
	public void delM(Multimedia nombre) {
		scot.remove(nombre);
	}
	
	public void buscarM(Multimedia nombre) {
		for (Multimedia multimedia : scot) {
			if (multimedia.equals(nombre)) {
				System.out.println(multimedia);
			}
		}
	}
	
	public ArrayList<Multimedia> buscarA(Autor autor) {
		ArrayList<Multimedia>mul = new ArrayList<>();
		
		for (Multimedia ml : scot) {
			for (Autor aut : ml.getAutores()) {
				if (aut.equals(autor)) {
					mul.add(ml);
				}			
			}
			
		}
		return mul;
	}

}
