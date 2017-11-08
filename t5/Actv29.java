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
   int numeroUno = Integer.parseInt(System.console().readLine());
   System.out.print("Introduce otro número: ");
   int numeroDos = Integer.parseInt(System.console().readLine());
   
   for (int i = 1; i < numeroUno; i++){
      if ((i % numeroDos)!=0){
      System.out.print("|"+i+"|");
      }
    }  
  }
}

