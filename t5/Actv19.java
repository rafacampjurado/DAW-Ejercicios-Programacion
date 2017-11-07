/*
 * Actv19.java
 * 
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv19 {
public static void main (String args[]) {
  System.out.print("Introduce la altura de la pirámide: ");
  int pedirAltura = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduce el carácter para rellenar la pirámide: ");
  String relleno = System.console().readLine();
  
  int altura = 1;
  int i = 0;
  int espacios = pedirAltura - 1;
  
  while (altura <= pedirAltura) {
    
    for (i = 1; i <= espacios;i++) {
      System.out.print(" ");
    }
    
    for (i = 1; i < altura * 2; i++) {
      System.out.print(relleno);
    }
    System.out.println();
    altura++;
    espacios--;
  }
}
}


  
  


