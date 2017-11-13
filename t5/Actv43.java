/*
 * Actv43.java
 * 
 * Escribe un programa que permita partir un número introducido por teclado en
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
 * el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
 * el número introducido tiene dos dígitos como mínimo y la posición en la que
 * se parte el número está entre 2 y la longitud del número. No se permite en
 * este ejercicio el uso de funciones de manejo de String (por ej. para extraer
 * subcadenas dentro de una cadena).
 * 
 * 
 * 
 * @Author Rafael Campos Jurado
 */

public class Actv43 {
 
  public static void main (String args[]) {
  System.out.print("Introduce un número: ");
  long numeroIntroducido = Long.parseLong(System.console().readLine());
  
  System.out.print("Introduce la posición en la que deseas añadir el número: ");
  int numeroPosicion = Integer.parseInt(System.console().readLine());
  // Fin pedir al usuario
  long numero = numeroIntroducido;
  int longitud = 0;
  long numeroIzquierda = 0;
  long numeroDerecha = 0;
  
  
  do {
    numero /= 10;
    longitud++;
  }while (numero >0);
  
  // parte izquierda
    long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - numeroPosicion + 1));
    
    // parte derecha
    long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - numeroPosicion + 1));
    
    System.out.println("Parte izquierda del número: "+ parteIzquierda);
    System.out.println("Parte derecha del número: "+ parteDerecha);
 }
}

