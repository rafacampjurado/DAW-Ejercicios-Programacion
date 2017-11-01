/*
 * Actv17.java
 * 
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 * @author Rafael Campos Jurado
 */


public class Actv17 {
public static void main (String args[]) {
  System.out.print("Introduce un número entero: ");
  int numeroIntroducido = Integer.parseInt(System.console().readLine());
  int multiplicador = 1;
  multiplicador = multiplicador * numeroIntroducido;
  for (int contador = 0;contador <= 100;contador++){
    System.out.print("|"+(multiplicador + contador)+"|");
  }
  
  }
}


  
  


