/*
 * Actv29.java
 * 
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma. * 
 * @author Rafael Campos Jurado
 */


public class Actv29 {
 
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

