/*
 * Actv11.java
 * 
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv11 {
public static void main (String args[]) {
   int numeroUno;
   int contadorNumero = 1;
   int numeroCubo;
   int numeroCuadrado;
   
   System.out.print("Introduce un número: ");
   numeroUno = Integer.parseInt(System.console().readLine());
   numeroCubo = numeroUno * numeroUno;
    numeroCuadrado = numeroUno * numeroUno * numeroUno;
   System.out.printf("| %3d | %3d | %3d \n", numeroUno, numeroCubo, numeroCuadrado); 
    
   
   
   while (contadorNumero <5){
    numeroUno++;
    contadorNumero++;
    numeroCubo = numeroUno * numeroUno;
    numeroCuadrado = numeroUno * numeroUno * numeroUno;
    System.out.printf("| %3d | %3d | %3d \n", numeroUno, numeroCubo, numeroCuadrado); 
  }
     
    
  
 
  
  }
}

  
  


