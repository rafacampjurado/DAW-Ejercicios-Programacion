/*
 * PruebaExamen03.java
 * 
 * Dibuja el número 155
 * 
 * 
 * 
 * @Author Rafael Campos Jurado
 */

public class PruebaExamen03 {
 
  public static void main (String args[]) {
    System.out.print("Introduzca la altura (5 como mínimo): ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
    int espacios = Integer.parseInt(System.console().readLine());
    for (int i = 0; i < altura; i++) {
      System.out.print("*");
      if ((i == 0) || (i == 2) || (i == altura - 1)) { //primera, tercera o ultima linea
        int cont = 0;
        while (cont < 2) {
          for (int e = 0; e < espacios; e++) {
            System.out.print(" ");//espacios hasta el primer 5
          }
          for (int c = 0; c < 4; c++) {
            System.out.print("*");//espacios hasta el primer 5
          }
          cont++;
        }
      } else if (i == 1) { //segunda linea
        for (int e = 0; e < espacios; e++) {
          System.out.print(" ");//espacios hasta el primer 5
        }
        System.out.print("*");
        for (int e = 0; e < espacios+3; e++) {
          System.out.print(" ");//espacios hasta el segundo 5
        }
        System.out.print("*");

      } else {
        int cont = 0;
        while (cont < 2) {
          for (int e = 0; e < espacios+3; e++) {
            System.out.print(" ");
          }
          System.out.print("*");
          cont++;
        }
      }
      System.out.println();
    }
  }
}
 

