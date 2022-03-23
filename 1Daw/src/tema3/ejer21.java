package tema3;

import java.util.Scanner;

public class ejer21 {

	public static void pintarMatriz(char matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
    }
	
	public static boolean comprobarGanadorJ1(char[][] matriz) {
	
		for(int i=0; i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[i].length ;j++) {
				if(matriz[0][0]=='X' && matriz[1][0]=='X' && matriz[2][0]=='X' ) {
					return true;
				}
			
				if(matriz[0][1]=='X' && matriz[1][1]=='X' && matriz[2][1]=='X') {
					return true;
				}
		
				if(matriz[0][2]=='X' && matriz[1][2]=='X' && matriz[2][2]=='X') {
					return true;
				}
		
				if(matriz[1][0]=='X' && matriz[1][1]=='X' && matriz[1][2]=='X') {
					return true;
				}
	
				if(matriz[2][0]=='X' && matriz[2][1]=='X' && matriz[2][2]=='X') {
					return true;
				}

				if(matriz[0][0]=='X' && matriz[1][1]=='X' && matriz[2][2]=='X') {
					return true;
				}
		
				if(matriz[0][2]=='X' && matriz[1][1]=='X' && matriz[2][0]=='X') {
					return true;
				}
			
				
			}
		}
		
		return false;
	
	}
	
	public static boolean comprobarGanadorJ2(char[][] matriz) {
		
		for(int i=0; i<matriz.length ;i++) {
			for(int j=0 ;j<matriz[i].length ;j++) {
				if(matriz[0][0]=='O' && matriz[1][0]=='O' && matriz[2][0]=='O' ) {
					return true;
				}
			
				if(matriz[0][1]=='O' && matriz[1][1]=='O' && matriz[2][1]=='O') {
					return true;
				}
		
				if(matriz[0][2]=='O' && matriz[1][2]=='O' && matriz[2][2]=='O') {
					return true;
				}
		
				if(matriz[1][0]=='O' && matriz[1][1]=='O' && matriz[1][2]=='O') {
					return true;
				}
	
				if(matriz[2][0]=='O' && matriz[2][1]=='O' && matriz[2][2]=='O') {
					return true;
				}

				//Inclinados
				if(matriz[0][0]=='O' && matriz[1][1]=='O' && matriz[2][2]=='O') {
					return true;
				}
		
				if(matriz[0][2]=='O' && matriz[1][1]=='O' && matriz[2][0]=='O') {
					return true;
				}
			
				
			}
		}
		
		return false;
	
	}
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);

        char matriz[][]=new char[3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]='-';
            }
        }
        
        char jugador1='X';
        char jugador2='O';
        int fila;
        int columna;
        int opcion;
        int cont=0;
        do {
            System.out.println("Elije posicion");
            System.out.println("1.- Jugador1");
            System.out.println("2.- Jugador2");
            
            opcion=sc.nextInt();
            
            switch (opcion) {
            case 1:
            	 
                System.out.println("Elije posicion");
                System.out.println("[0,0], [0,1], [0,2]");
                System.out.println("[1,0], [1,1], [1,2]");
                System.out.println("[2,0], [2,1], [2,2]");
                System.out.println("elije fila");
                fila=sc.nextInt();
                System.out.println("elije columna");
                columna=sc.nextInt();
                if (matriz[fila][columna]==jugador2) {
                    System.out.println("Esta posicion esta ocupada por Jugador 2");
                }else {
                    matriz[fila][columna]=jugador1;
                }
                pintarMatriz(matriz);
              
                
            
                	  
               
                	  cont++;
                	 
                do {
                	if(comprobarGanadorJ1(matriz)==true) {
                      	System.out.println("Gano jugador 1");
                      	break;
                      	
                      }
				} while (cont==3);
				
                break;
                
            case 2:
                System.out.println("Elije posicion");
                System.out.println("[0,0], [0,1], [0,2]");
                System.out.println("[1,0], [1,1], [1,2]");
                System.out.println("[2,0], [2,1], [2,2]");
                System.out.println("elije fila");
                fila=sc.nextInt();
                System.out.println("elije columna");
                columna=sc.nextInt();
                if (matriz[fila][columna]==jugador1) {
                    System.out.println("Esta posicion esta ocupada por Jugador 2");
                }else {
                    matriz[fila][columna]=jugador2;
                }
                pintarMatriz(matriz);
                
                if(comprobarGanadorJ2(matriz)==true) {
                  	System.out.println("Gano jugador 2");
                  	break;
                  	
                  }
                
                break;
            case 3:
                
                break;

            }
        } while (opcion!=3);
        
        sc.close();
    }

}
