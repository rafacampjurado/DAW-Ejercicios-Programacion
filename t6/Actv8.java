//Modifica el programa anterior para que la probabilidad de que salga un 1 sea
//de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
//2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
// @author Rafael Campos Jurado
 
package actividades;

import java.util.Scanner;


public class Actv8 {

    public static void main(String[] args) {
      int seleccion = 0;
      String rojo = "\033[31m";
      String colorOff="\033[0m";
      int columnas = 3;
      int numColumna = 1;

      for (int i = 0; i < 15; i++) {
        System.out.printf("%4d. |", i+1);
        for (int apuesta = 1; apuesta <= columnas; apuesta++) {
          seleccion = (int)(Math.random() * 6) + 1;
          
            switch (seleccion) {
             case 1:
          case 2:
          case 3:
            System.out.print("1  |");
            break;
          case 4:
          case 5:
            System.out.print(" X |");
            break;
          case 6:
            System.out.print("  2|");
          default:
        }
      }
        System.out.println();
              
        }
              
    }
  }
