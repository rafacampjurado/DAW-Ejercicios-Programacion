/*
 * Actv13.java
 * 
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv13 {
public static void main (String args[]) {
  int contador = 0;
  int contadorPositivo = 0;
  int contadorNegativo = 0;
   
   do {
     System.out.print("Introduce un número: ");
      int A = Integer.parseInt(System.console().readLine());
      contador++;
      if (A >=0){
        contadorPositivo++;
      }else if (A <0){
        contadorNegativo++;
      }
      } while (contador <=10);
      System.out.print("Hay "+contadorPositivo+" números positivos y "+contadorNegativo+" números negativos.");
      }
  }


  
  


