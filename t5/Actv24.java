/*
 * Actv24.java
 * 
 * Escribe un programa que lea un número "n" e imprima una pirámide de números
 * con "n" filas como en la siguiente figura:
 *    1
 *   121
 *  12321
 * 1234321
 * 
 * @author Rafael Campos Jurado
 */


public class Actv24 {
public static void main (String args[]) {
System.out.print("Introduce la altura de la pirámide: ");
  int pedirAltura = Integer.parseInt(System.console().readLine());
  
  //~ System.out.print("Introduce el carácter para rellenar la pirámide: ");
  int relleno = pedirAltura;
  
  int altura = 1;
  int i = 0;
  int espacios = pedirAltura - 1;
  
  while (altura <= pedirAltura) {
    
    for (i = 1; i <= espacios;i++) {
      System.out.print(" ");
    }
    
    for (i = 1; i < altura * 1; i++) {
      System.out.print(relleno);
    }
    System.out.println();
    altura++;
    espacios--;
  }

}
    
 }
