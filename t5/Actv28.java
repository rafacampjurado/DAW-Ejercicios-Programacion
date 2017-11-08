/*
 * Actv28.java
 * 
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * Ejemplo:
 * Por favor, introduzca un número entero: 6
 * 6! = 720
 * 
 * @author Rafael Campos Jurado
 */


public class Actv28 {
 
 public static void main (String args[]) {
   System.out.print("Introduce un número: ");
    int numeroIntroduccido = Integer.parseInt(System.console().readLine());
    int numero = numeroIntroduccido;
    int suma = 0;
    int mult = 0;
    
    for (int i = (numeroIntroduccido - 1); i >0; i--) {
      numero = i * numero ;
      
    }
    System.out.println(+ numeroIntroduccido+"! = "+numero);
  }
}

