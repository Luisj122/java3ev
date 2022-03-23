package Triangulos;

public class Equilatero extends Triangulo implements Comparable {

	public Equilatero(double lado1, double lado2, double lado3) throws IllegalArgumentException    {
        super(lado1, lado2, lado3);
        if(!valido()) {
        	throw new IllegalArgumentException("Error, introduce valores válidos para ese tipo de triangulo");
        } ;
    }
	
	@Override
	public int copareTo(Triangulo t) {
		
		if(this.area() < t.area()) {
			return -1;
		}
		if(this.area() > t.area()) {
			return 1;
		}
		if(this.area() == t.area()) {
			return 0;
		}
		return 2;
	}

	@Override
	public double area() {
		
		return ((Math.sqrt(3)/4)*Math.pow(this.lado3, 2));
		
	}

	@Override
	public boolean valido() {
		
		if(this.lado1 == this.lado2 && this.lado2 == this.lado3 && this.lado1 == this.lado3){
			return true;
		}
		
		return false;
	}

	
}
