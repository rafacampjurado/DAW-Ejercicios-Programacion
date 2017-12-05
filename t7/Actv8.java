//Realiza un programa que pida la temperatura media que ha hecho en cada mes
//de un determinado año y que muestre a continuación un diagrama de barras
//horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
//de asteriscos o cualquier otro carácter.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;

public class Actv8 {

  public static void main(String[] args) {
    int temperatura[] = new int[12];
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < 12; i++) {
      System.out.print("Introduce la temperatura media de mes (" + (i + 1) + " de 12) : ");
      temperatura[i] = s.nextInt();
    }
    for (int i = 0; i < 12; i++) {
      System.out.print("Mes " + i + " ");
      for (int y = 0; y < temperatura[i]; y++) {
        System.out.print("#");
      }
      System.out.println();
    }

  }
}
