/*
 * Actv25.java
 * 
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 * @author Rafael Campos Jurado
 */


public class Actv25 {
public static void main (String args[]) {
  System.out.print("Introduce un número: ");
  int numeroA = Integer.parseInt(System.console().readLine());
  int numeroB = numeroA;
  int volteado = 0;
  while (numeroB >0){
    volteado = (volteado * 10) + (numeroB % 10);
    numeroB = numeroB / 10;
  }
  System.out.print("El número volteado es: "+volteado);
  
   
}
    
 }
