//Escribe un programa que lea 15 números por teclado y que los almacene en un
//array. Rota los elementos de ese array, es decir, el elemento de la posición 0
//debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
//la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
//del array.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;

public class Actv6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero[] = new int[15];
    int numeroPasado[] = new int[15];
    int valorPosicionCero = 0;
//    PEDIR DATOS
    for (int i = 0; i < 15; i++) {
      System.out.print("Introduce un número (" + i + " de 15) : ");
      numero[i] = s.nextInt();
    }
//    FIN PEDIR DATOS 
//    MUESTRA CONTENIDO ARRAY
    System.out.print("Números del Array = ");
    for (int i = 0; i < 15; i++) {
      System.out.print(" " + numero[i]);
    }
    System.out.print(" ");
    System.out.println(" ");
//    FIN MOSTRAR CONTENIDO ARRAY
//-------------------------------------------------------------------
//    INICIO CAMBIAR VALORES
    for (int i = 0; i < 15; i++) {
      if (i + 1 == 15) {
        numeroPasado[(0)] = numero[14];
      } else {
        numeroPasado[(1 + i)] = numero[i];
      }
    }
// FIN CAMBIAR VALORES
//  MUESTRA CONTENIDO ARRAY VOLTEADO
    System.out.print("Números del Array cambiado  = ");
    for (int i = 0; i < 15; i++) {
      System.out.print(" " + numeroPasado[i]);
    }
//    FIN MOSTRAR CONTENIDO ARRAY VOLTEADO
    System.out.println(" ");
  }
}
