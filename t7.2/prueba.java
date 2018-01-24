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

      for (int i = 0; i < 60; i++) {
         numero [i] = (int)(Math.random()* 20); 
      }
      for (int i = 0; i < 60; i++) {
          for (int j = 0; j < i; j++) {
              if (numero [i] == numero [j]) {
                  repetido = true;
              }
          }
      }
      for (int i : numero) {
          System.out.print(" "+ numero [i]);
          
      }
  }
}
