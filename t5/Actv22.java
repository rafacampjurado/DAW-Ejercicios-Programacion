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
  
  for (int divisor = 2;((numero >=2)&&(numero <=100)); divisor++) {
    
     if (numero % divisor == 0) {
       numero++;
        //~ divisor++;
     } else {
       System.out.print("|"+numero+"|");
     }
    
  }
}
}
  
  //~ System.out.print("Introduzca un número entero: ");
    //~ int numeroIntroducido = 2;
  
  //~ boolean esPrimo = true;
    
    //~ for (int i = 2; i < numeroIntroducido; i++) {
      //~ if ((numeroIntroducido % i) == 0) {
        //~ esPrimo = false;
        //~ numeroIntroducido++;
      //~ }
    //~ }
        
    //~ if (esPrimo) {
      //~ System.out.println("El número introducido es primo.");
    //~ } else {
      //~ System.out.println("El número introducido no es primo.");
    //~ }
  
  



  
  


