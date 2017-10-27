/*
 * Actv10.java
 * 
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv10 {
public static void main (String args[]) {
   System.out.print("Introduce un número: ");
  int A = Integer.parseInt(System.console().readLine());
  
  for (int contador = 1; A >=0; contador++){
 int B = Integer.parseInt(System.console().readLine());
 int C = A+B;
 A = 0;
 System.out.print("Introduce un número: ");
 A = Integer.parseInt(System.console().readLine());
 System.out.print(C);
  
  }
}
}
  
  


