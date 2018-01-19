/*
Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).
* @Author Rafael Campos Jurado
 */
package ArrayBidimensionales;

import java.util.Scanner;

public class Actv3 {

  public static void main(String[] args) {
    int[][] num = new int[4][5];
    boolean salirBucle = false;
    Scanner s = new Scanner(System.in);
    int fila = 0;
    int suma = 0;
    
    while (!salirBucle) {
      if (fila == 3) {
        salirBucle = true;
      } else {
        salirBucle = false;
      }
      for (int j = 0; j < 5; j++) {
        num[fila][j] = (int)((Math.random () * 899)+100);
      }
      fila++;
    }
fila = 0;
    boolean bucleDos = false;
    while (!bucleDos) {
      if (fila == 3) {
         bucleDos = true;
      } else {
        bucleDos = false;
      }
      for (int j = 0; j < 5; j++) {
//        System.out.print("| " + num [fila][j] + " |");
        System.out.printf("|      %3d       ",num [fila] [j]);
        suma = suma + num [fila] [j];
      }
      System.out.print("|  Fila "+ fila + "  | ");
      System.out.println("");
      fila++;
    }
    for (int i = 0; i < 5; i++) {
      System.out.print("| Columna "+i+" ");
//      System.out.print("");
    }
    System.out.print(" | ");
    System.out.print(suma);
    System.out.println("");
  }
}
