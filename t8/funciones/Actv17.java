/*
Escribe un programa que pase de binario a decimal.
@Author Rafael Campos Jurado
 */
package funciones;

import funciones.matematicas;
import java.util.Scanner;

public class Actv17 {

    public static void main(String[] args) {
      Scanner s = new  Scanner(System.in);
      int numero = 0;
      int binario = 0;
      int volteado = 0;
      int multipli = 1;
      System.out.print("Introduce el número binario : ");
      binario = s.nextInt();
      int copiaNumero = binario;
      while (binario > 0) {        
        if ( binario % 10 == 1) {
          numero = numero + multipli;
        }
        multipli *= 2;
        binario = binario / 10;
      }
      System.out.print("El número binario  "+copiaNumero + "corresponde al número decimal "+ numero);
      System.out.println("");
    }
}
