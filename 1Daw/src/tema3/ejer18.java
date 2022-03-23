package tema3;

import java.util.Iterator;

public class ejer18 {

	public static void pintarMatriz(int[][] matriz) {
		for(int i=0 ;i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[i].length ;j++) {
				System.out.print(matriz[i][j] + "   ");
			
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Encuesta matriz 10x3
		
		int encuesta[][];
		encuesta = new int[10][3];
		
		//Rellenar con datos aleatorios
		
		for(int i=0 ;i<encuesta.length ;i++) {
			//sexo
			encuesta[i][0] = (int)((Math.random()*2)+1);
			
			//Trabaja
			encuesta[i][1] = (int)((Math.random()*2)+1);
			
			//Sueldo
			
			if(encuesta[i][1]==2) {
				encuesta[i][2]=0;
			}else {
				encuesta[i][2]=(int)((Math.random()*1401)+600);
			}
		}
		
		pintarMatriz(encuesta);
		
		//Calcular porcentaje encuesta
		
		int porcentajeHombres=0;
		int porcentajeMujeres=0;
		int porcentajeHombresTrabajan=0;
		int porcentajeMujeresTrabajan=0;
		int sueldoHombres=0;
		int sueldoMujeres=0;
		
		for(int i=0 ;i<encuesta.length ;i++) {
			
			//Hombre
			if(encuesta[i][0]==1) {
				porcentajeHombres++;
				
				//Si trabaja
				if(encuesta[i][1]==1) {
					porcentajeHombresTrabajan++;
					sueldoHombres += encuesta[i][2];
				}
			}
			//Mujeres
			if(encuesta[i][0]==2) {
				porcentajeMujeres++;
				
				//Trabajan
				if(encuesta[i][1]==1) {
					porcentajeMujeresTrabajan++;
					sueldoMujeres += encuesta[i][2];
				}
			}
		}
		
		
		//Pintar resultado
		
		System.out.println("El porcentaje de hombres es : " + porcentajeHombres*100/encuesta.length + " % ");
		System.out.println("El porcentaje de mujeres es : " + porcentajeMujeres*100/encuesta.length + " % ");
		System.out.println("El porcentaje de hombres que trabajan es : " + porcentajeHombresTrabajan*100/porcentajeHombres + " % ");
		System.out.println("El porcentaje de mujeres que trabajan es : " + porcentajeMujeresTrabajan*100/porcentajeMujeres + " % ");
		System.out.println("El sueldo medio de los hombres son : " + sueldoHombres/porcentajeHombresTrabajan);
		System.out.println("El sueldo medio de los hombres son : " + sueldoMujeres/porcentajeMujeresTrabajan);



	}

}
