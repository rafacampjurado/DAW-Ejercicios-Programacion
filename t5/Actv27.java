/*
 * Actv27.java
 * 
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv27 {
 
 public static void main (String args[]) {
   System.out.print("Introduce un número: ");
  int numeroIntroduccido = Integer.parseInt(System.console().readLine());
  int contador = 0;
  int multip;
  int suma = 0;
  for (int i = 0; i <= numeroIntroduccido; i++){
    multip = i * 3;
    suma += multip;
    contador++;
  } 
  System.out.println("Cuenta = "+ contador +"\nSuma total de los múltiplos = "+suma);
 
  }
}

