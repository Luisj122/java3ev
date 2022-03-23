package parking;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Parking {
	
	protected ArrayList<Vehiculo>vehiculosAr;
	protected ArrayList<PlazaAparcamiento>plazaAr;
	protected int plazaDisponible;
	protected float saldoAcumulado;
	protected static final float PRECIO_BASE_POR_MINUTO =(float) 0.04;
	protected static final float PRECIO_BASE_POR_METRO =(float) 0.2;
	
	public Parking() {
		super();
		this.vehiculosAr = new ArrayList<>();
		this.plazaAr = new ArrayList<PlazaAparcamiento>(100);
		for (int i = 1; i <= 100; i++) {
			this.plazaAr.add(new PlazaAparcamiento(i,true));
		}
		this.plazaDisponible = 100;
		this.saldoAcumulado = 0;
	}

	/**
	 * @return the vehiculosAr
	 */
	public ArrayList<Vehiculo> getVehiculosAr() {
		return vehiculosAr;
	}

	/**
	 * @return the plazaDisponible
	 */
	public int getPlazaDisponible() {
		return plazaDisponible;
	}

	/**
	 * @return the saldoAcumulado
	 */
	public float getSaldoAcumulado() {
		return saldoAcumulado;
	}
	
	public void imprimeParking() {
		for (PlazaAparcamiento pA : plazaAr) {
			if(pA.isLibre()) {
				System.out.println(pA);
			}else {
				for (Vehiculo vehiculo : vehiculosAr) {
					if(vehiculo.getPlaza().equals(pA)) {
						System.out.println(pA);
						System.out.println("Matricula " + vehiculo.matricula + 
								" minutos pasados " + vehiculo.calcularMinutos()
								+ " importe total " + vehiculo.calcularImporte());					
					}
				}
				
			}
		}
	
		
	}
	
	public String registrarEntradaVehiculo(Vehiculo v) {
		 if (this.plazaDisponible > 0) {
	            for(PlazaAparcamiento p : plazaAr) {
	                if (p.isLibre()) {
	                    p.setLibre(false);
	                    v.setPlaza(p);
	                    v.setFechaEntrada(LocalDateTime.now());
	                    this.vehiculosAr.add(v);
	                    this.plazaDisponible--;
	                    return "El coche con matricula " + v.getMatricula() +" esta aparcado el la plaza " + p.getNumeroPlaza();
	                }
	            }

	        } else {
	            return "El parking esta lleno";
	        }

	        return null;
		
	}
	
	public String registrarSalidaVehiculo(Vehiculo v) {
		for (Vehiculo vv : vehiculosAr) {
			if(!(vv.equals(v))) {
				this.saldoAcumulado += v.calcularImporte();
				vv.getPlaza().setLibre(true);
				vehiculosAr.remove(v);
				this.plazaDisponible++;
				return "Matricula " + vv.getMatricula() + " entro " + vv.getFechaEntrada()
				+ " salio " + LocalDateTime.now() + " estando " + vv.calcularMinutos() + " con un coste de "
				+ vv.calcularImporte();
			}else {
				return "No se a encontrado ese coche en el parking";
			}
		}
		return null;
	}
	
	
}
