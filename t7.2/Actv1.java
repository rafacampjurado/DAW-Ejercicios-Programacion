/*
* Define un array de números enteros de 3 filas por 6 columnas con nombre num
* y asigna los valores según la siguiente tabla. Muestra el contenido de todos
* los elementos del array dispuestos en forma de tabla como se muestra en la
* figura.
* @Author Rafael Campos Jurado
 */
package ArrayBidimensionales;
public class Actv1 {
  public static void main(String[] args) {
    int [] [] num  = new int [3] [6];
    num [0] [1] = 30;
    num [0] [2] = 2;
    num [0] [5] = 5;
    num [1] [0] = 75;
    num [2] [2] = -2;
    num [2] [3] = 3;
    num [2] [5] = 11;
    
    boolean salirBucle = false;
    int fila = 0;
    while (!salirBucle) {
      if (fila == 2) {
        salirBucle = true;
      } else {
        salirBucle = false;
      }
      for (int i = 0; i < 6; i++) {
//        System.out.print("|  "+ num [fila] [i] +"  |");
System.out.printf("|%2d |",num [fila] [i]);
    }
      System.out.println("");
      fila++;
    }
    
  }
}
