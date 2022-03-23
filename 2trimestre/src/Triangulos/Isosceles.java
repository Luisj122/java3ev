package Triangulos;

public class Isosceles extends Triangulo implements Comparable{

	public Isosceles(double lado1, double lado2, double lado3) throws IllegalArgumentException    {
        super(lado1, lado2, lado3);
        if(!valido()) {
        	throw new IllegalArgumentException("Error, introduce valores v�lidos para ese tipo de triangulo");
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
		
		double s;
		double area;
		
		s=((this.lado1+this.lado2+this.lado3)/2);
		area=(Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3)));
		
		return area;
	}

	@Override
	public boolean valido() {
		if(this.lado1 == this.lado2 && this.lado3 != this.lado1) {
			return true;
		}
		
		return false;
	}

}
