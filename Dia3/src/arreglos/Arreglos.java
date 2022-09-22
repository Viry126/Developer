package arreglos;

import java.util.Date;

public class Arreglos {
	public static void main(String[] args) {
		
//		//Array es coleccion de datos estatica no cambia su tamano
//		//No necesariamente se puede llenar todas las posiciones
//		//No tiene 
//		//Object
//		
//		
//		//iniciaizar un array vacio
//		int [] nn = new int [10];
//		
//		//inicializar un array con valores
//		int [] x = {2,7,4,9,0,1,3,6}; 
//		
//		String[]txt = new String [5];
//		String[] texto = {"String","hola","1111","/%"};
//		
//		//crear un array objeto clase tipodato
//		
//		Object[] coleccion1 = new Object [10];
//		Object[] coleccion2 = {9000,"novecientos",86.7f,true,'k', 
//			new Date()};
//		System.out.println(coleccion2[2]);
//		
//		//llenar un array vacio
//		nn [0] = 10;
//		nn [1] = 12;
//		nn [2] = 10;
//		nn [3] = 2;
//		nn [4] = 14;
//		nn [5] = 22;
//		nn [6] = 76;
//		nn [7] = 26;
//		nn [8] = 9;
//		nn [9] = 34;
//		
//		//nn[10]=10
//		
////		//imprimir el tamano del array con el atributo .length 
////		System.out.println("Array 1:"+nn.length);
////		System.out.println("Array 2:"+x.length);
////		
////		System.out.println(nn[6]);//solo ver que hay en esa posicion
////		
//		//recorrer un array con un ciclo
//		
//		int cont =0;
//		while(cont<nn.length) {
//			System.out.println("Iteracion"+cont+" valor"+nn[cont]);
//			cont++; 
//			
//		}
//		
//	--------------------------------------
	   //
		int [][] tabla = new int [5] [4];
		//llenar tabla
		tabla [0][0]=30;
		tabla [0][1]=12;
		tabla [0][2]=20;
		tabla [0][3]=11;
		
		tabla [1][0]=90;
		tabla [1][1]=6;
		tabla [1][2]=24;
		tabla [1][3]=45;
		
		tabla [2][0]=7;
		tabla [2][1]=11;
		tabla [2][2]=83;
		tabla [2][3]=64;
		
		tabla [3][0]=45;
		tabla [3][1]=7;
		tabla [3][2]=49;
		tabla [3][3]=52;
		
		tabla [4][0]=1;
		tabla [4][1]=1;
		tabla [4][2]=1;
		tabla [4][3]=1;
		
		//Iterar sobre las filas
		for(int fila = 0; fila < tabla.length;fila++) {
			System.out.println(tabla[fila]); //si solo imprimimos puras filas solo nos va a mostror la direccion de memoria
		    for(int columnas=0; columnas<tabla[fila].length;columnas++) {
		    	System.out.println("Coordenada: " + fila + ":" + columnas + " valor almacenado: " + tabla[fila][columnas]); 
		    }
		}
		/*
		viridianavaldesmartinez
		23
		11*3*/
		
		
		
		
		}
}
