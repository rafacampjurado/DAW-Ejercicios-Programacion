/*
 * Actv26.java
 * 
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv26 {
public static void main (String args[]) {
  System.out.print("Introduce un número: ");
  int numeroIntroducido = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduce un dígito que componga el número anterior: ");
  int digitoIntroducido = Integer.parseInt(System.console().readLine());
  int numero = numeroIntroducido;
  int volteado = 0;
  int suma = 0;
  int longitud = 0;
  
  int posicion = 1;
   System.out.print("Contando de izquierda a derecha, el " + digitoIntroducido + " aparece dentro de " + numeroIntroducido + " en las siguientes posiciones: ");
  
  if (numero == 0) {
      longitud = 1;
    }
    
  while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } // while
        
    // comprueba la posición
    while (volteado > 0) {
      if ((volteado % 10) == digitoIntroducido) {
        System.out.print(posicion + " ");
      }
      volteado /= 10;
      posicion++;
    } // while

    System.out.println();
 
  }
}

