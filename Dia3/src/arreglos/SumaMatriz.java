package arreglos;

import java.util.Scanner;

public class SumaMatriz {
/// tambien se puede hacer con indexOf  
//  devuelve un -1   
// String numeros [0123456789]
// if(numeros.indexOf(tabla2[f][c])<=0)	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		String [][] tabla1 = new String[3][3];
		String [][] tabla2 = new String[3][3];
		int [][] tablaR = new int[6][3];

		
		int  suma, number, number2;
		//Llena la primer tabla
		System.out.println("Llenado de la primera tabla");
		for (int f = 0; f < tabla1.length; f++) {
			for (int c = 0; c < tabla1[f].length; c++) {
				System.out.println("Ingresa el dato 'coordenada ("+f+","+ c+")'");
			    tabla1[f][c]=entrada.nextLine();
				
			}
		}
		System.out.println(" \n Llenado de la segundo arreglo");
		
		//Llena la segunda tabla 
		for (int f = 0; f < tabla1.length; f++) {
			for (int c = 0; c < tabla1[f].length; c++) {
				System.out.println("Ingresa el dato 'coordenada ("+f+","+ c+")'");
			    tabla2[f][c]=entrada.nextLine();
				//System.out.println(" "+tabla1[f][c]+" "+ tabla2[f][c]+" ");
			    
			}
		}
		
		
		System.out.println(" \n Datos introducidos");
		//System.out.println(" \n tabla1 | tabla2 | tablaResultado");

		for (int f = 0; f < tabla1.length; f++) {
			for (int c = 0; c < tabla1[f].length; c++) {
				    
					if(tabla1[f][c].matches("[0-9]+") && tabla2[f][c].matches("[0-9]+")) {
						//System.out.println("true");
						 number = Integer.parseInt(tabla1[f][c]);
					     number2 = Integer.parseInt(tabla2[f][c]);
						suma= number+number2;
						
					}else {
						//System.out.println("false");
						suma=0;
						//tablaR[f][c];
					}
					
					tablaR [f][c]= suma;
					System.out.println("Coordenadas: " + f + "," + c + " -- tabla1: "
							+ tabla1[f][c]+" tabla2: " +tabla2[f][c]+" tablaResul: "+ tablaR[f][c]);
					
					//System.out.println(tabla1[f][c]+"  | "+ tabla2[f][c]+"  | "+tablaR[f][c]);
					
			}
		}

		
		
		
		
	}
}
