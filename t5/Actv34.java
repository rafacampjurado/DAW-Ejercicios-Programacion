/*
 * Actv34.java
 * 
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares.
 * 
 * Se van comprobando los dígitos de la siguiente manera: primer dígito
 * del primer número, primer dígito del segundo número,
 * segundo dígito del primer número, segundo dígito del segundo número,
 * tercer dígito del primer número... Para facilitar
 * el ejercicio, podemos suponer que el usuario introducirá dos números de la
 * misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
 * long en lugar de int donde sea necesario para admitir números largos.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv34 {
 
 public static void main (String args[]) {
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroUnoIntroducido = Long.parseLong(System.console().readLine());
    
    System.out.print("Por favor, introduzca un segundo número entero positivo: ");
    long numeroDosIntroducido = Long.parseLong(System.console().readLine());
    
    
// Le da la vueta al número y calcula la longitud
    long numeroUno = numeroUnoIntroducido;
    long numeroDos = numeroDosIntroducido;
    long volteadoUno = 0;
    long volteadoDos = 0;
    int longitudUno = 0;
    int longitudDos = 0;
    
    if ((numeroUno == 0)&&(numeroDos == 0)) {
      longitudUno = 1;
      longitudDos = 1;
    }
    
    while (numeroUno > 0) {
      volteadoUno = (volteadoUno * 10) + (numeroUno % 10);
      numeroUno /= 10;
      longitudUno++;
    }
    while (numeroDos > 0) {
      volteadoDos = (volteadoDos * 10) + (numeroDos % 10);
      numeroDos /= 10;
      longitudDos++;
    } // while

    
    

    int digitoUno;
    int digitoDos;
    long digitosPares = 0;
    long digitosImpares = 0;
    
    
    
    for (int i = 0; i < longitudUno; i++) {

      digitoUno = (int)(volteadoUno % 10);
      digitoDos = (int)(volteadoDos % 10);

      if ((digitoUno % 2) == 0) {
        digitosPares = digitosPares * 10 + digitoUno;
       
      } else {
        digitosImpares = digitosImpares * 10 + digitoUno;
        
      }
      
      if ((digitoDos % 2) == 0) {
        digitosPares = digitosPares * 10 + digitoDos;
        
      } else {
        digitosImpares = digitosImpares * 10 + digitoDos;
      }

      

      volteadoUno /= 10;
      volteadoDos /= 10;
    }
    
    // Muestra la suma de los dígitos pares
    System.out.println("Dígitos pares: " + digitosPares);
    System.out.println("Dígitos impares: " + digitosImpares);
    
  }
}




