/*
 * Actv22.java
 * 
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv22 {
public static void main (String args[]) {
  
  int numero = 2;
  //~ int divisor = 2;
  
  for (int divisor = 2;((numero >1)&&(numero <101)); divisor++) {
    numero++;
     if (numero % divisor == 0) {
       
        //~ divisor++;
     } else {
       System.out.print("|"+numero+"|");
     }
    
  }
}
}
  
  
  



  
  


