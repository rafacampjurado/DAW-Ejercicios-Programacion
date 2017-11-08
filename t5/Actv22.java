/*
 * Actv22.java
 * 
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv22 {

  public static void main (String args[]) {
  
    boolean esPrimo = true;
    
    for (int n = 2; n < 100; n++){
      esPrimo = true;
      
      for (int divisor = 2; divisor < n; divisor++) {
         if ((n % divisor) == 0) {
           esPrimo = false;
        } else {
        }
      } 
     if (esPrimo){
       System.out.print("|"+n+"|");
     }
    } 
    
  }
}
