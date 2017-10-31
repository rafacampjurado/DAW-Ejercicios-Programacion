/*
 * Actv16.java
 * 
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv16 {
public static void main (String args[]) {
  System.out.print("Introduce un número: ");
  int numPrimo = Integer.parseInt(System.console().readLine());
  int divisor = 1;
  //~ int division = numPrimo / divisor;
  
  do {
    int division = numPrimo / divisor;
    divisor++;
    
    } while (division > 0);
  
  }
}



  
  


