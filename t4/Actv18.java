/*
 * Actv18.java
 * 
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * 
 */


public class Actv18 {
public static void main (String args[]) {
  System.out.print("Introduce un numero: ");
  int num = Integer.parseInt(System.console().readLine());
  if (num < 100) {
 System.out.print(num /10);
  }
  else if (num < 1000){
 System.out.print (num /100);
  }
  else if (num < 10000) {
  System.out.print(num /1000);
  }
else {
  System.out.print("El numero excede las 5 cifras");
}
}
}
