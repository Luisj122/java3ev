package tema8Poo;

import java.util.Scanner;

public class testPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		int edad;
		String sexo;
		double peso;
		double altura;
		
		System.out.println("Introduce tu nombre");
        nombre = sc.nextLine();
        
        System.out.println("Introduce tu edad");
        edad = Integer.parseInt(sc.nextLine());
        
        System.out.println("Introduce tu sexo");
        sexo = sc.nextLine();
        
        System.out.println("Introduce tu peso");
        peso = Double.parseDouble(sc.nextLine());
        
        System.out.println("Introduce tu altura");
        altura = Double.parseDouble(sc.nextLine());
        
		Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
		
		
		
		
		if(p1.esMayorEdad()) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
		
		if(p1.calcularIMC()==1) {
			System.out.println("Sobre peso");
		}else if(p1.calcularIMC()==0) {
			System.out.println("Por debajo de tu peso ideal");
		}else {
			System.out.println("Peso ideal");
		}
		
		
		System.out.println(p1);
		sc.close();
		
	}

}
