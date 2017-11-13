/*
 * Actv45.java
 * 
 * Escribe un programa que cambie un dígito dentro de un número dando la
 * posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
 * empezando por el 1. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos. Suponemos que el usuario introduce
 * correctamente los datos.
 * 
 * 
 * 
 * @Author Rafael Campos Jurado
 */

public class Actv45 {
 
  public static void main (String args[]) {
  System.out.print("Introduce un número: ");
  long numeroIntroducido = Long.parseLong(System.console().readLine());
  System.out.print("Introduce el número que deseas añadir: ");
  long numeroDos = Long.parseLong(System.console().readLine());
  System.out.print("Introduce la posición en la que deseas añadir el número: ");
  int numeroPosicion = Integer.parseInt(System.console().readLine());
  // Fin pedir al usuario
  long volteado = 0;
  long numero = numeroIntroducido;
  //~ int longitud = 0;
  long reves = 0;
  int longitud = 0;
  int longitudVuelta = 1;
  
  
  while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } // while
    //~ System.out.print("número volteado = "+ volteado);
    
  while (volteado > 0) {
    if (numeroPosicion == (longitudVuelta )) {
      
      reves = (reves * 10) + numeroDos;
    } else {
    reves = (reves * 10) + (volteado % 10);
    }
      volteado /= 10;
      longitudVuelta++;
    } // while
    System.out.println("número añadido = "+ reves);
 }
}

