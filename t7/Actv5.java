//Escribe un programa que pida 10 números por teclado y que luego muestre
//los números introducidos junto con las palabras “máximo” y “mínimo” al lado
//del máximo y del mínimo respectivamente.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;
public class Actv5 {

  public static void main(String[] args) {
    int [] numero = new int [10];
    Scanner s = new Scanner (System.in);
    int aux1 = 0;
    int aux2 = 0;
    
//    INICIO PEDIR DATOS
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce 10 números: ");
      numero [i] = s.nextInt();
    }
//    FIN PEDIR DATOS
    for (int i = 0; i < 10; i++) {
      System.out.print(numero[i]);
    }
    for (int i = 0; i < 10; i++) {
      numero[i] = aux1;
      if (aux1 > numero[i]) {
        System.out.print(numero+"MAX");
      }
    }
  }
}
