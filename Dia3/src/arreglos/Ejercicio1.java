package arreglos;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*Scanner entrada = new Scanner (System.in);
		 int [] array2 = new int [19];
		 
		 System.out.println("Ingresa el numero");
		 int cont1=0;
		 
		 while() {
			 
		 }
		*/
		
		
	     int[] array= {1,2,3,4,5,6,7,8,9,10,11,12,13,14
	    		 ,15,16,17,18,19,20};
	     
	     int cont=0;
	     int suma=0;
	     while(cont<array.length) {
	    	  
	    	  //System.out.println(array[cont]);
	    	  int mod=array[cont]%2;
	    	  if(mod==0) {
	    		 //System.out.println(array[cont]);
	    		 suma = suma + array[cont];
	    		 //System.out.println(suma);
	    	  } 
	    	  cont++;
	     }
	     System.out.println(suma);
	     
	}

}
