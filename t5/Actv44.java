/*
 * Actv44.java
 * 
 * Escribe un programa que sea capaz de insertar un dígito dentro de un número
 * indicando la posición. El nuevo dígito se colocará en la posición indicada y el
 * resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
 * izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 * correctamente los datos. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * 
 * 
 * 
 * @Author Rafael Campos Jurado
 */

public class Actv44 {
 
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
  
  
  for (int longitud = 1;numero > 0; longitud++) {
      
      if (longitud == numeroPosicion) {
          volteado = (volteado * 10)+ numeroDos;
          volteado = (volteado * 10)+ (numero % 10);
      } else {
        
      volteado = (volteado * 10) + (numero % 10);
      }
      numero /= 10;
      
      //~ longitud++;
      System.out.println(longitud);
    } // while
    System.out.print(volteado);
 }
}

