/*
 * Actv37.java
 * 
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 * 
 * @author Rafael Campos jurado
 */


public class Actv37 {
 
  public static void main (String args[]) {
  System.out.print("Introduce un número: ");
  long numeroIntroducido = Long.parseLong(System.console().readLine());
  long numero = numeroIntroducido;
  int digito = 0;
  long volteado = 0;
  int longitud = 0;
  //~ int contador = 0;
  
  while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } // while
    
    System.out.print("El número "+ numeroIntroducido + " es " );
    for (int i = 0; i < longitud; i++) {

      digito = (int)(volteado % 10);
      for (int contador = 0; contador < digito; contador++) {
        System.out.print("|");
      
      }
      if (volteado > 10) { // para no pintar el último guión
        System.out.print(" - "); // separador de dígitos
      }

      volteado /= 10;
    }
  System.out.print(" en el sistema de los palotes");
 }
}

