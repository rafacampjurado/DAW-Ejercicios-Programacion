/*
 * Actv15.java
 * 
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
 * 
 * @author Rafael Campos Jurado
 */


public class Actv15 {
public static void main (String args[]) {
  System.out.print("Introduce la base (número real): ");
  int numBase = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduce el exponente (entero positivo): ");
  int numExpo = Integer.parseInt(System.console().readLine());
  
  
  
  for (int contador = 1; contador <= numExpo; contador++) {
   int formula = numBase * contador;
   System.out.print("|"+numBase+"^"+contador+"|");
   System.out.println("|"+formula+"|");
  
  }
}
}


  
  


