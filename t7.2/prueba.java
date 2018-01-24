/*
Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha..
* @Author Rafael Campos Jurado
 */
package ArrayBidimensionales;

import java.util.Scanner;

public class prueba {

  public static void main(String[] args) {
    int numero[] = new int[60];
    boolean repetido = true;

      for (int j = 0; j < 60; j++) {
        do {
          numero [j] = (int)(Math.random()* 10);
          for (int k = 0; k < j; k++) {
            if (numero [j] == numero [k]) {
              repetido = true;
            }
          }
        } while (repetido);
      }

    for (int y : numero) {
      System.out.print("  " + y);
    }
  }
}
