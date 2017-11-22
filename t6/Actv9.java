//Realiza un programa que vaya generando números aleatorios pares entre 0
//y 100 y que no termine de generar números hasta que no saque el 24. El
//programa deberá decir al final cuántos números se han generado.
// @author Rafael Campos Jurado
 
package actividades;

import java.util.Scanner;


public class Actv9 {

    public static void main(String[] args) {
      boolean salirBucle = true;
      int numero = 0;
      int esUno = 0;
      while (salirBucle) {
        numero = ((int)(Math.random()* 100)+1);
//        Si el número es 1 se hace un Math.random para que tenga el 50% de ser 0 y el 50% de ser 1
          if (numero == 1) {
                for (int y = 0; y < 1; y++) {
                  esUno = ((int)(Math.random()* 2));
                    if (esUno == 1) {
                      numero = 1;
                    } else {
                      numero = 0;
                    }
               }
             }
//        FIN del 0 y 1
          if (numero % 2  == 0) {
//             Si el numero es igual a 24 se termina el bucle y si no se muestra
              if (numero == 24) {
                 salirBucle = false;
               }
              System.out.println(numero);
          } else {
//            System.out.println("el numero es impar");
          } 
          
     }
  }
}