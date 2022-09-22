package com;

public class Principal {

	// Metodo principal
	/*
	 * No puede haber mas de un main en todo el programa
	 * "public static void main"
	 */
	public static void main(String[] args) {


//-----------------------------------------------------------------------------

//		__________TIPOS DE DATOS_________
//
//	    ___________Primitivos
//		_______ Enteros

//		byte b = 127;
//		short s = 32767;
//		int i = 999999999;
//		long l = 999999999999999999l;
//
//		______ Decimales
//
//		float f = 3.12f; // menos precision se agrega f
//		double d = 20.90; // mayor precision
//
//		_______Caracter
//
//		char c = '+'; // solo un caracter
//
//		_______Boolean

//		boolean bol = true; // true o false
//
//		_____________________TIPOS DE DATOS OBJETO (wrappers )________________

//		/// clases wrappers, envoltorio de un primitivo, dotado de funcionalidad
//		
//      String m = "hola mundo";
//		Integer numero = 233423;
//		Byte by = 127;
//		Short sh = 12345;
//		Long grande = 123456789101112131l;
//
//		Double decimal = 12.45;
//		Float fl = 13.9657f;
//		Character caracter = '7';
//		Boolean flag = false;
//
//		decimal.toString();
//		System.out.println(decimal.getClass());//obtener tipo es
//        

//----------------------------------------------------------------
		
//     ___________FOR_________
         /*
		 * if if-else switch-case while do-while for foreach
		 * 
		 * 
		 */
    	double dd = 11.11;
		double dg = 11.13;
		String g = "xperia";
		String a = "Xperia ";
		int x = 5;
		String o = "A";
//------------------------------------------------------
		//Es otra forma de condicion if 
		int time=18;       
		//                         true       false
		String result=(time<18)? "Buen dia": "Buen";
		System.out.println("dd"+result);
		
//------------------------------------------------------
		
		
		
		
		
		
//		____EJERCICIO 1
		
//		if (g.equals(a)) { // equal compara el string
//			// Si se cumple
//			System.out.println("ok");
//
//		} else {
//			// cuando no se cumple
//			System.out.println(":c");
//		}

//		____EJERCICIO 2
		
		
		if (x == 1) {
			System.out.println("es uno");

		} else if (x == 2) {
			System.out.println("es dos");

		} else if (x == 3) {
			System.out.println("es tres");

		} else if (x == 4) {
			System.out.println("es cuatro");

		} else {
			System.out.println("desconocido if");
		} 

//		_______EJERCICIO 3
		
//		___________SWITH_________

		switch (o) {
		case "a":
			System.out.println("m1");

			break;
		case "b":
			System.out.println("m2");
			break;
		case "c": //
			System.out.println("m4");
			break;
			
			default:
				System.out.println("Desconocido swith");
		}

	}
}
