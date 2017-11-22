//Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
  //para los 14 partidos y el pleno al quince (15 filas).
// @author Rafael Campos Jurado
 
package actividades;

import java.util.Scanner;


public class Actv7 {

    public static void main(String[] args) {
      int seleccion = 0;
      String rojo = "\033[31m";
      String colorOff="\033[0m";
      int columnas = 0;
      int numColumna = 1;
      for (int i = 0; i < 45; i++) {
        
        for (int y = 0; y <  2; y++) {
          seleccion = ((int)(Math.random()*3)+1);
//          System.out.print(i);
//          System.out.print(numColumna+"  ");
          
        }
        
        if (columnas == 0) {
          System.out.print(numColumna);
        }
            if (seleccion == 1) {
              System.out.print ("  "+colorOff +rojo + "  | X "+colorOff+"| x"+"| 2 |");
              columnas++;
    //          System.out.println();
            }

            if (seleccion == 2) {
              System.out.print ("  "+colorOff+colorOff+ "  | 1 "+rojo+"| X"+colorOff+"| 2 |");
              columnas++;
    //          System.out.println();
            }

            if (seleccion == 3) {
              System.out.print ("  "+colorOff + "  |"+" 1 "+colorOff+"| x"+rojo+"| X |"+colorOff);
              columnas++;
    //          System.out.println();
            }
            if (columnas == 3) {
              columnas = 0;
              numColumna++;
              System.out.println();
//              System.out.print(numColumna+"  ");
            }
            
        
      }
    }
}