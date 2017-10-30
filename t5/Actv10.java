/*
 * Actv10.java
 * 
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv10 {
public static void main (String args[]) {
   double A = 0;
   double contador = 0;
   double C = 0;
   System.out.print("Introduce varios números positivos: ");
  
  
    while (A >=0) {
      A = Integer.parseInt(System.console().readLine());
      contador++;
      C += A;
      //~ Esto es igual que C = C+A;
    }
    System.out.print("Tu nota media es: "+(C - A)/(contador-1));
    //~ Se resta uno al contador porque a pesar de que el número sea negativo
    //~ se suma un número más al contador.
    
  
 
  
  }
}

  
  


