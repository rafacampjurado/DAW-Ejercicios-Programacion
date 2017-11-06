/*
 * Actv23.java
 * 
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv23 {
public static void main (String args[]) {
  int A = 0;
  int suma = 0;
  int C = 0;
   
  
  for (int contador = 1;(suma <= 10000);contador++) {
    System.out.print("Introduce un número: ");
    A = Integer.parseInt(System.console().readLine());
    suma += A;
    
    if (suma >10000){
      System.out.println("Se han introduccido "+contador+" números");
      System.out.println("Suma = "+suma);
      System.out.println("Media = "+ (suma / contador));
    }
    
  }
  
 
  }
}


  
  


