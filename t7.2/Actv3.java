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
      int sumaFila0 = 0;
      int sumaFila1 = 0;
      int sumaFila2 = 0;
      int sumaFila3 = 0;

      while (!salirBucle) {
          if (fila == 3) {
              salirBucle = true;
          } else {
              salirBucle = false;
          }
          for (int j = 0; j < 5; j++) {
              System.out.print("Introduce un número: ");
              num[fila][j] = s.nextInt();
              if (fila == 0) {
                  sumaFila0 = sumaFila0 + num[fila][j];
              } else if (fila == 1) {
                  sumaFila1 = sumaFila0 + num[fila][j];
              } else if (fila == 2) {
                  sumaFila2 = sumaFila0 + num[fila][j];
              } else if (fila == 3) {
                  sumaFila3 = sumaFila0 + num[fila][j];
              }
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
              System.out.printf("|      %3d       ", num[fila][j]);
              suma = suma + num[fila][j];
          }
          if (fila == 0) {
              System.out.print("|  Fila " + fila + "  | " + sumaFila0);
          } else if (fila == 1) {
              System.out.print("|  Fila " + fila + "  | " + sumaFila1);
          } else if (fila == 2) {
              System.out.print("|  Fila " + fila + "  | " + sumaFila2);
          } else if (fila == 3) {
              System.out.print("|  Fila " + fila + "  | " + sumaFila3);
          }
//            System.out.print("|  Fila " + fila + "  | ");
          System.out.println("");
          fila++;
      }
      for (int i = 0; i < 5; i++) {
          System.out.print("| Columna " + i + " ");
//      System.out.print("");
      }
      System.out.print(" | ");
      System.out.print(suma);
      System.out.println("");
  }
}
