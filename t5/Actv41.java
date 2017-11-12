/*
 * Actv41.java
 * 
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv41 {
 
 public static void main (String args[]) {
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    // Le da la vueta al número y calcula la longitud
    long numero = numeroIntroducido;
    long volteado = 0;
    int longitud = 0;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } // while


    int digito;
    int sumaPares = 0;
    int sumaImpares = 0;
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(volteado % 10);

      if ((digito % 2) == 0) {
        sumaPares += 1;
      } else {
        sumaImpares += 1;
      }

      volteado /= 10;
    }
    
    // Muestra la suma de los dígitos pares e impares
    System.out.println("El número tiene "+ sumaPares +" dígitos pares y "+ sumaImpares +" dígitos impares.");
  }
}




