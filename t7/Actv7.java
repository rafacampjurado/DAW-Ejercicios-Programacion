//Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
//muestre por pantalla separados por espacios. El programa pedirá entonces
//por teclado dos valores y a continuación cambiará todas las ocurrencias del
//primer valor por el segundo en la lista generada anteriormente. Los números
//que se han cambiado deben aparecer entrecomillados.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;

public class Actv7 {

  public static void main(String[] args) {
    int[] numero = new int[101];
    int probabilidad = 0;
    int pedirValor1 = 0;
    int pedirValor2 = 0;
    String rojo = "\033[31m";
    String colorOff = "\033[0m";
    Scanner s = new Scanner(System.in);
//    --------------------------------------------------------------
    for (int i = 0; i < 100; i++) {
      numero[i] = ((int) (Math.random() * 20) + 1);
      if (numero[i] == 1) {
        for (int y = 0; y < 1; y++) {
          probabilidad = ((int) (Math.random() * 2));
          if (probabilidad == 1) {
            numero[i] = 1;
          } else {
            numero[i] = 0;
          }
        }
      }
    }
    for (int i = 0; i < 100; i++) {
      System.out.print(numero[i] + " ");
    }
//        INICIO PIDE DATOS
    System.out.println("");
    System.out.print("introduce el valor que deseas remplazar: ");
    pedirValor1 = s.nextInt();
    System.out.print("introduce el nuevo valor: ");
    pedirValor2 = s.nextInt();
    System.out.println("El número " + pedirValor1 + " será remplazado por el número " + pedirValor2);
//        FIN PEDIR DATOS
//        MUESTRA EL RESULTADO
    for (int i = 0; i < 100; i++) {
      if (numero[i] == pedirValor1) {
        numero[i] = pedirValor2;
        System.out.print(rojo + "\"" + numero[i] + "\"  ");
      } else {
        System.out.print(colorOff + numero[i] + " ");
      }

    }
  }
}
