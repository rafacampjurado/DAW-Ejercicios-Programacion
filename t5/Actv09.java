/*
 * Actv09.java
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv09 {
public static void main (String args[]) {
  System.out.print("Introduce un número: ");
  int numero = Integer.parseInt(System.console().readLine());
  //~ for (int multiplo = 1; multiplo <11; multiplo++){
    //~ System.out.println(multiplo * multiplicacion);
  //}~
  for (int contador = 1; numero >0; contador++){
    numero = numero/10;
    //~ System.out.println(numero);
  if (numero == 0) {
    System.out.print("El número introducido tiene "+contador+" dígitos");
  }
  }
  
}
}


