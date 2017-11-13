/*
 * Actv46.java
 * 
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 * 
 * 
 * 
 * @Author Rafael Campos Jurado
 */

public class Actv46 {
 
  public static void main (String args[]) {
  System.out.print("Introduce la anchura del rectángulo (mínimo 4): ");
  int anchuraIntroducida = Integer.parseInt(System.console().readLine());
  System.out.print("Introduce la altura del rectángulo (mínimo 2): ");
  int alturaIntroducida = Integer.parseInt(System.console().readLine());
  
  int anchura = anchuraIntroducida;
  int altura = alturaIntroducida;
  int aux = 0;
  int espacios = anchura -1;
  if ((anchuraIntroducida < 4) || (alturaIntroducida < 2)){
    System.out.print("Los valores son erroneos");
  } else {
    //pinta la parte de arriba
      for (int i = 0; i < anchura; i++ ) {
        System.out.print("*");
      }
    // pinta la parte del medio
      for (int i = 2; i < altura ; i++) {
        System.out.print("\n*");
        for (int y = 2; y < anchura; y++) {
          System.out.print(" ");
        }
          System.out.print("*");
      }
      System.out.println();
        
        
    // vuelve a pintar la parte de arriba (porque es igual que la base)
      for (int i = 1; i <= anchura ; i++ ) {
      System.out.print("*");
      }
  }
  
 }
}
