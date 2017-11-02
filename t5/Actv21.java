/*
 * Actv21.java
 * 
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo
 * 
 * @author Rafael Campos Jurado
 */


public class Actv21 {
public static void main (String args[]) {
  int contador = 0;
  int numero = 1;
  int sumaImpares = 0;
  int contadorImpares = 0;
  int aux = 0;
  while (numero >0){
    System.out.print("Introduce un número: ");
     numero = Integer.parseInt(System.console().readLine());
     contador++;
     aux = numero;
     
      if (numero % 2  >0){
        contadorImpares++;
        sumaImpares += numero; 
        System.out.println(sumaImpares+" "+contadorImpares);
      }
     
      if (numero % 2 == 0){
      
      }
      if (numero <0){
      System.out.println("Se han introducido "+contador+" números");
      System.out.println("El mayor número par es: "+ numero);
       }
       
      
  }
  System.out.print("La media de los números impares es : "+(sumaImpares / contadorImpares));
  
      

      
}
}


  
  


