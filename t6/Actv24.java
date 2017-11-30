//Escribe un programa que, dado un número introducido por teclado, elija al azar
//uno de sus dígitos.
//@author Rafael Campos Jurado
package actividades;

import java.util.Scanner;

public class Actv24 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numeroPedido = 0;
    System.out.print("Introduce un número entero: ");
    numeroPedido = s.nextInt();
    int volteado = 0;
    int contadorPosiciones = 0;
    int numero = 0;
    int aleatorio = 0;
    int posiciones = 0;

    while (numeroPedido > 0) {
      contadorPosiciones++;
      volteado = (volteado * 10) + (numeroPedido % 10);
      numeroPedido = numeroPedido / 10;
    }
    aleatorio = ((int) (Math.random() * contadorPosiciones) + 1);
    posiciones = contadorPosiciones;
//    System.out.println(contadorPosiciones + "  "+ posiciones);
    while (volteado > 0) {

      if (posiciones == aleatorio) {
        System.out.println(volteado % 10);

      } else {
      }
      numero = (numero * 10) + (volteado % 10);
      volteado = volteado / 10;
      posiciones--;

    }
//    System.out.println(numero);
  }
}
