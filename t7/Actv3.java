//Escribe un programa que lea 10 números por teclado y que luego los muestre
//en orden inverso, es decir, el primero que se introduce es el último en
//mostrarse y viceversa.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;
public class Actv3 {

  public static void main(String[] args) {
    int [] numero = new int [11];
    Scanner s = new Scanner (System.in);
    int numeroIntroducido = 0;
    for (int i =  0; i < 11; i++) {
    System.out.print("Introduce un número: ");
    numeroIntroducido = s.nextInt();
    numero [i] = numeroIntroducido;
    
  }
    for (int i = 10; i >= 0; i--) {
      System.out.println(numero[i]);
    }
    
  }
}
