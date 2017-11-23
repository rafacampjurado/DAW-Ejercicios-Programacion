//Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
  //para los 14 partidos y el pleno al quince (15 filas).
// @author Rafael Campos Jurado
 
package actividades;

import java.util.Scanner;


public class Actv7V2 {

    public static void main(String[] args) {
      int seleccion = 0;
      String rojo = "\033[31m";
      String colorOff="\033[0m";
      int columnas = 0;
      int numColumna = 1;
      for (int i = 0; i < 15; i++) {
        
        for (int y = 0; y <  2; y++) {
          seleccion = ((int)(Math.random()*3)+1);
        }
          System.out.printf("%4d. ", i+1);
        
            if (seleccion == 1) {
              System.out.println ("  "+colorOff +rojo + "  | X "+colorOff+"| x"+"| 2 |");
            }

            if (seleccion == 2) {
              System.out.println ("  "+colorOff+colorOff+ "  | 1 "+rojo+"| X"+colorOff+"| 2 |");
            }

            if (seleccion == 3) {
              System.out.println("  "+colorOff + "  |"+" 1 "+colorOff+"| x"+rojo+"| X |"+colorOff+"");
            }
              System.out.println();

      }
    }
}