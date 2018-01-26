/*
Escribe un programa que pase de decimal a binario.
@Author Rafael Campos Jurado
 */
package funciones;

import funciones.matematicas;
import java.util.Scanner;

public class Actv18 {

    public static void main(String[] args) {
      Scanner s = new  Scanner(System.in);
      int numero = 0;
      int copiaNumero = numero;
      int binario = 0;
      System.out.print("Introduce el número: ");
      numero = s.nextInt();
      while (numero > 0) {
        binario = (binario * 10) + (numero % 2);
        numero = numero / 2;
      }
      System.out.println("El número "+ copiaNumero + " equivale al número binario "+ matematicas.voltea(binario));
    }
}
