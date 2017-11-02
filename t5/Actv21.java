/*
 * Actv21.java
 * 
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo
 * 
 * @author Rafael Campos Jurado
 */


public class Actv21 {
public static void main (String args[]) {
  int contador = 0;
  int contadorPar = 0;
  int contadorImpar = 0;
  int contadorNegativo = 0;
  int contadorPositivo = 0;
  int C = 0;
  int D = 0;

   do {
     System.out.print("Introduce un número: ");
      int A = Integer.parseInt(System.console().readLine());
      contador++;
      if (A >=0){
          if (A % 2 == 0){
          int C += A;
          contadorPar++;
          }  else {
          int D = D + A;
          contadorPositivo++;
          }
      } else if (A <0){
        contadorNegativo++;
      }
      
      
      } while (contador <=10);
      System.out.print("Hay "+contadorPositivo+" números positivos y "+contadorNegativo+" números negativos.");
      
      

      
}
}


  
  


