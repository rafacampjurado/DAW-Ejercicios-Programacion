/*
 * Actv18.java
 * 
 * Escribe un programa que obtenga los números enteros comprendidos entre
 * dos números introducidos por teclado y validados como distintos, el programa
 * debe empezar por el menor de los enteros introducidos e ir incrementando de
 * 7 en 7.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv18 {
public static void main (String args[]) {
  System.out.print("Introduce un número entero: ");
  int A = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduce un segundo  número entero: ");
  int B = Integer.parseInt(System.console().readLine());
  
  //~ int aux = 0;
  
  if (A>B) {
   int aux = A;
   A = B;
   B = aux;   
  }
  for (int i = A; i <= B; i = i + 7) {
    System.out.print("|"+i+"|");
  }
  System.out.println();
  }
}


  
  


