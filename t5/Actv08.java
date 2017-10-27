/*
 * Actv08.java
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv08 {
public static void main (String args[]) {
  System.out.print("Introduce un número a multiplicar: ");
  int multiplicacion = Integer.parseInt(System.console().readLine());
  for (int multiplo = 1; multiplo <11; multiplo++){
    System.out.println(multiplo * multiplicacion);
  }
}
}


