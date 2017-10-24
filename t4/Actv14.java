/*
 * Actv14.java
 * 
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * 
 */


public class Actv14 {
public static void main (String args[]) {
  System.out.print("Introduce un número: ");
  int numero = Integer.parseInt(System.console().readLine());
  //~ System.out.print(numero);
  //~ int divisionPar = numero /2;
  //~ int divisionImpar = numero /5;
  if ((numero %2) == 0){
  System.out.print("El número es par ");
  } else {
  System.out.print("El número es impar, divisible entre 5");
    }
  }
}

