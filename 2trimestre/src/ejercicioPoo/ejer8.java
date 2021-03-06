package ejercicioPoo;

public class ejer8 {
	
	//Propiedades
	
	private double peso;
	
	//Constructores
	
	public ejer8(double kg, String medida) {
        switch (medida) {
            case "lb": this.peso =(kg * 0.453); break;
            case "li": this.peso =(kg * 14.59); break; 
            case "oz": this.peso =(kg * 0.02835); break;
            case "p": this.peso =(kg * 0.155); break;
            case "k": this.peso =(kg * 1); break;
            case "g": this.peso =(kg / 1000); break;
            
            default:
            	System.out.println("Tipo erroneo");break;
            }
        
        
    }
	
	//Getter y Setter
	public double getKilogramos() {
		return this.peso;
	}
	
	
	public double getLibras() {
		return this.peso *= 0.453;
	}
	
	public double getLingotes() {
		return this.peso *= 14.59;
	}
	
	public double getPeso(String medida) {
		switch (medida) {
        case "lb":  this.peso /= 0.453; break;
        case "li": this.peso /= 14.59; break; 
        case "oz": peso /= 0.02835;break; 
        case "p": this.peso /= 0.155; break;
        case "k": this.peso /= 1; break;
        case "g": this.peso *= 1000; break;
        
        default:
        	System.out.println("Tipo erroneo");break;
    }
		
		return peso;
	}
	
	//To String

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("peso=");
		builder.append(peso);
		return builder.toString();
	}
	
	
}
