/*
 * Actv36.java
 * 
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 * long en lugar de int ya que el primero admite números más largos.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv36 {
 
 public static void main (String args[]) {
    
    System.out.print("Por favor, introduzca un número entero: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    long numero = numeroIntroducido;
    long volteado = 0;
    int longitud = 1;
    
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } // while
    
    
    if (volteado == numeroIntroducido) {
       System.out.println("El número "+ numeroIntroducido +" es capicúa.");
    } else {
      System.out.println("El número "+ numeroIntroducido +" no es capicúa.");
    }
    
    
    
    
    
    
  
  
  
   
 }
}
