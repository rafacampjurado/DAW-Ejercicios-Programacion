/*
 * Actv42.java
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido. Al lado de cada número se debe indicar si se trata de un primo o
 * no.
 * 
 * 
 * 
 * @Author Rafael Campos Jurado
 */

public class Actv42 {
 
  public static void main (String args[]) {
  System.out.print("Introduce un número entero positivo: ");
  int numeroIntroducido = Integer.parseInt(System.console().readLine());
  int numero = numeroIntroducido;
  int suma;
  for (int i = 0; i <= 5 ; i++) {
    
    if ((numero % 2) == 0) {
        System.out.println(numero + " es primo");
    } else {
        System.out.println(numero + " no es primo");
    }
    numero += 1;
  }
 }
}

