/*
 * Actv14.java
 * 
 * Escribe un programa que pida una base y un exponente (entero positivo) y
 * que calcule la potencia.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv14 {
public static void main (String args[]) {
  System.out.print("Introduce la base (entero positivo): ");
  int numBase = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduce el exponente (entero positivo): ");
  int numExpo = Integer.parseInt(System.console().readLine());
  
  int contador = numExpo;
  
  int formula = numBase * numBase;
  
    
  while (contador >0) {
  formula *= numBase;
  contador--;
   //~ System.out.print(" "+formula);
   //~ System.out.print("     "+contador);
   
   if (contador ==0) {
     System.out.print(formula);
    } else {
    }
      }
  
  }
}


  
  


