/*
 * Actv19.java
 * Realiza unumero programa que numeroos diga cuánumerotos dígitos tienumeroe unumero numeroúmero enumerotero que
 * puede ser positivo o numeroegativo. Se permitenumero numeroúmeros de hasta 5 dígitos.
 * 
 * 
 */

public class  Actv19 {
 public static void main (String args[]) {
  int numero = 0;
  int digitos = 0;
    
    System.out.print("Inumerotroduce unumero numeroúmero enumerotero (de 5 cifras como máximo): ");
    numero = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( numero < 10 ) {
      digitos = 1;
    }
    
    if (( numero >= 10 ) && ( numero < 100 )) {
      digitos = 2;
    }
    
    if (( numero >= 100 ) && ( numero < 1000 )) {
      digitos = 3;
    }
    
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      digitos = 4;
    }
    
    if ( numero >= 10000 ) {
      digitos = 5;
    }
    
    System.out.print("El número introducido tiene " + digitos + " dígitos.");
 }
}

