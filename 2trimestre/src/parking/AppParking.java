package parking;

import java.util.Scanner;

public class AppParking {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		String matricula ="";
		String modelo = "";
		int tipo =0;
		
		Parking p1 = new Parking();
		
		
		do {
			
			System.out.println(" Menú ");
			System.out.println("0. Salir del programa");
			System.out.println("1. Registrar entrada vehículo");
			System.out.println("2. Registrar salida vehículo");
			System.out.println("3. Número plazas disponibles");
			System.out.println("4. Imprimir estado del parking");
			System.out.println("5. Saldo disponible");
			
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1: {
				//Entrada
				System.out.println("Tipo de vehiculo");
				System.out.println("1. Coche ");
				System.out.println("2. Furgoneta");
				tipo = Integer.parseInt(sc.nextLine());
				switch (tipo) {
					case 1: {
						System.out.println("Matricula ");
						matricula = sc.nextLine().toUpperCase();
						System.out.println("Modelo");
						modelo = sc.nextLine().toUpperCase();
						Coche c1 = new Coche(matricula, modelo, null);
						p1.registrarEntradaVehiculo(c1);
						break;	
					}
					case 2: {
						System.out.println("Matricula ");
						matricula = sc.nextLine().toUpperCase();
						System.out.println("Modelo");
						modelo = sc.nextLine().toUpperCase();
						Furgoneta f1 = new Furgoneta(matricula, modelo, 2);
						p1.registrarEntradaVehiculo(f1);
						break;
					}
				
				}
				
				
				break;
				
			}
			case 2: {
				//Salida
				System.out.println("Matricula ");
				matricula = sc.nextLine().toUpperCase();
				Vehiculo v1 = new Vehiculo(matricula, null);
				System.out.println(p1.registrarSalidaVehiculo(v1));				
				break;
			}
			case 3: {
				//Numero plaza
				System.out.println(p1.getPlazaDisponible());
				break;
				
			}
			case 4: {
				//Imprimir estado
				p1.imprimeParking();
				
				break;
				
			}
			case 5: {
				//Saldo
				System.out.println(p1.getSaldoAcumulado());
				break;
				
			}
			
			
			default:
				System.out.println("Opcion incorrecta");
			}
			
		} while (opcion!=0);
		
		sc.close();
		
	}
}
