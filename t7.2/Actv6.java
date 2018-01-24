/*
Modifica el programa anterior de tal forma que no se repita ningún número en
el array.
* @Author Rafael Campos Jurado
 */
package ArrayBidimensionales;

import java.util.Scanner;

public class Actv6 {

  public static void main(String[] args) {
    int[][] num = new int[6][10];
    int[] numeros = new int[60];
    int fila = 0;
    boolean salirBucle = false;
    int max = 0;
    int min = 10001;
    int maxFila = 0;
    int maxColum = 0;
    int minFila = 0;
    int minColum = 0;
    String naranja = "\033[33m";
    String verde = "\033[32m";
    String blanco = "\033[37m";
    
    int columna = 0;
    boolean repetido = false;
    int y = 0;
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        do {
          num[fila][columna] = (int)(Math.random() * 1001);

          // Comprueba si el número generado ya está en el array.
          repetido = false;
          for (y = 0; y< 10 * fila + columna; y++) {
            if (num[fila][columna] == num[y / 10][y % 10]) {
              repetido = true;
            }
          }
        } while (repetido);
      }
    }

    ///////////////////////////////////////monstramos el array//////////////////
    fila = 0;
    salirBucle = true;
    while (salirBucle) {
      if (fila == 5) {
        salirBucle = false;
      } else {
        salirBucle = true;
      }
      for (int j = 0; j < 10; j++) {
        System.out.print(naranja + " ( " + fila + ":" + j + " ) ");
        System.out.print(verde + "" + num[fila][j] + " ");
      }
      System.out.print(blanco + "     | Columna " + fila);
      System.out.println("");
      System.out.print("------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("----------------------------------");
      System.out.println("");
      fila++;
    }
    /////////////////////////// Buscamos el máximo y el mínimo /////////////////
    ///////////////////////////////MAX/////////////////////////////////
    fila = 0;
    while (!salirBucle) {
      if (fila == 5) {
        salirBucle = true;
      } else {
        salirBucle = false;
      }
      for (int j = 0; j < 10; j++) {
        if (num[fila][j] > max) {
          max = num[fila][j];
          maxFila = fila;
          maxColum = j;
        }
      }
      fila++;
    }
    System.out.println("El valor máximo  está en " + maxFila + " : " + maxColum);
    //////////////////////////Min//////////////////////////
    fila = 0;
    while (salirBucle) {
      if (fila == 5) {
        salirBucle = false;
      } else {
        salirBucle = true;
      }
      for (int j = 0; j < 10; j++) {
        if (num[fila][j] < min) {
          min = num[fila][j];
          minFila = fila;
          minColum = j;
        }
      }
      fila++;
    }
    System.out.println("El valor mínimo  está en " + minFila + " : " + minColum);
  }
}
