//Realiza un programa que pida 8 números enteros y que luego muestre esos
//números junto con la palabra “par” o “impar” según proceda.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;

public class Actv9   {

  public static void main(String[] args) {
    int pedirNumero [] = new int [8];
    Scanner s = new Scanner (System.in);
    for (int i = 0; i < 8; i++) {
      System.out.print("Introduce un número ("+ i +" de 8) : ");
      pedirNumero[i] = s.nextInt();
    }
    for (int i = 0; i < 8; i++) {
      if (pedirNumero[i] % 2 == 0) {
        System.out.println("par "+ pedirNumero[i]);
      } else {
        System.out.println("Impar "+ pedirNumero[i]);
      }
    }
  }
}
