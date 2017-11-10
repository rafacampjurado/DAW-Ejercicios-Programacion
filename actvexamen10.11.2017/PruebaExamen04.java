/*
 * PruebaExamen04.java
 * 
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8 (todos los que
 * encuentre). 
 * Realiza un programa que muestre un número antes y después de haber sido comido por
 * el gusano. Si el animalito no se ha comido ningún dígito, el programa debe indicarlo.
 * 
 * 
 * Ejemplo 1:
 * Introduzca un número entero (mayor que cero): 51803458
 * Después de haber sido comido por el gusano numérico se queda en 51345F
 * 
 * Ejemplo 2:
 * Introduzca un número entero (mayor que cero): 29614
 * El gusano numérico no se ha comido ningún dígito.
 * 
 * @author Rafael Campos Jurado
 */


public class PruebaExamen04 {
public static void main (String args[]) {
  System.out.print("Introduce un número: ");
  long numero = Long.parseLong(System.console().readLine());
  long volteado = 0;
  boolean siCome = false;
  while (numero >0) {
      
      if (((numero % 10) == 0)||((numero % 10) == 8)) {
       
       siCome = true;
      } else {
       volteado = (volteado * 10) + (numero % 10);
      }
      numero = numero / 10;
    
  }
  if (siCome){
    System.out.println("El gusano ha deborado algunos números y se queda en "+volteado);
  } else {
    System.out.println("No había comida para el gusano esta vez, el número se queda en "+volteado);
  }
   
   
   
 } 
}




  
  


