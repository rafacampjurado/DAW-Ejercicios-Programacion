/*
 * Actv17.java
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 * 
 * 
 */


public class  Actv17 {
 public static void main (String args[]) {
  System.out.print("Introduce el número entero: ");
  int numero = Integer.parseInt(System.console().readLine());
  System.out.println("La última cifra del número introducido es el " + (numero % 10));
 }
}

