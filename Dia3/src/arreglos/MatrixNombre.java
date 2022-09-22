package arreglos;

import java.util.Scanner;

public class MatrixNombre {
	public static void main(String[] args) {
      //  Scanner entrada = new Scanner(System.in);
		String [][] matrix = new String [4][6];
		
		matrix [0][0] = "V";
		matrix [0][1] = "I";
		matrix [0][2] = "R";
		matrix [0][3] = "I";
		matrix [0][4] = "D";
		matrix [0][5] = "I";
		
		matrix [1][0] = "A";
		matrix [1][1] = "N";
		matrix [1][2] = "A";	
		matrix [1][3] = "V";
		matrix [1][4] = "A";
		matrix [1][5] = "L";
		
		matrix [2][0] = "D";
		matrix [2][1] = "E";
		matrix [2][2] = "S";
		matrix [2][3] = "M";
		matrix [2][4] = "A";
		matrix [2][5] = "R";
		
		matrix [3][0] = "T";
		matrix [3][1] = "I";
		matrix [3][2] = "N";
		matrix [3][3] = "E";
		matrix [3][4] = "Z";
		matrix [3][5] = ".";
	
		for(int f=0; f<matrix.length;f++) {
			
			for( int c=0; c<matrix[f].length; c++) {
				//System.out.println("dame");
				//matrix [f][c] = "V";
				System.out.println(matrix [f][c]);
			} 
			
		}
	}
}


//try {
//int number = Integer.parseInt(tabla1[f][c]);
//System.out.println(number);
//
//} catch (Exception ex) {
//System.out.println(0);
//}

/*
try {
	int number = Integer.parseInt(tabla1[f][c]);
	int number2 = Integer.parseInt(tabla2[f][c]);
	suma= number+number2;
	System.out.println(""+tabla1[f][c]+" "+ tabla2[f][c]+" "+suma);
	tablaR[f][c] = suma;
	System.out.println(tablaR[f][c]);
	} catch (Exception ex) {
	System.out.println(0);
	}
*/
/*suma= tabla1[f][c]+tabla2[f][c];
	System.out.println(""+tabla1[f][c]+" "+ tabla2[f][c]+" "+suma);
	//Llene la tabla
	tablaR[f][c] = suma;
	//System.out.println(tablaR[f][c]);*/