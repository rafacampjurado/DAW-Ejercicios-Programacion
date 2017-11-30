//Escribe un programa que muestre por pantalla 100 números enteros separados
//por un espacio. Los números deben estar generados de forma aleatoria
//en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
//almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
//@author Rafael Campos Jurado
package actividades;

import java.util.Scanner;

public class Actv25 {

  public static void main(String[] args) {
    int numero = 0;

    for (int i = 0; i < 100; i++) {
      numero = (int) ((Math.random() * 200) + 10);
      if (numero % 2 == 0) {
        System.out.println("#" + numero + "#");
      }
      
      if (numero % 5 == 0) {
        System.out.println("[" + numero + "]");
      }
    }
  }
}
