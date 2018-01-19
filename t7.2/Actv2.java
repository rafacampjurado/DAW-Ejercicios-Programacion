/*
Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha..
* @Author Rafael Campos Jurado
 */
package ArrayBidimensionales;

import java.util.Scanner;

public class Actv2 {

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
        System.out.print("Introduce un número: ");
        num[fila][j] = s.nextInt();
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
