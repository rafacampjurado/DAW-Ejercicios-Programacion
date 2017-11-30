//Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
//Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
//@author Rafael Campos Jurado
package actividades;

import java.util.Scanner;
public class Actv23 {

  public static void main(String[] args) {
    int valorFigura = 0;
    String figura = "";
    for (int i = 0; i < 5; i++) {
      valorFigura = ((int)(Math.random ()*6)+1);
      switch (valorFigura) {
        case 1:
          figura = "As";
          break;
        case 2:
          figura = "K";
          break;
        case 3:
          figura = "Q";
          break;
        case 4:
          figura = "J";
          break;
        case 5:
          figura = "7";
          break;
        case 6:
          figura = "8";
          break;
      }
      System.out.print(figura +" ");
    }
  }
}
