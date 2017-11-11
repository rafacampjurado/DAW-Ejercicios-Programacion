/*
 * Actv31.java
 * 
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 * 
 * 
 * @author Rafael Campos Jurado
 */


public class Actv31 {
 
 public static void main (String args[]) {
  System.out.print("Introduce la altura: ");
  int pedirAltura = Integer.parseInt(System.console().readLine());
  int altura = pedirAltura;
  int i = 0;
  int división;
  
  for (i = 1; i < altura; i++) {
    System.out.println("*");
    
  }
  //~ System.out.println("  "+i+"Valor de I");
  if (i == altura) {
    división = altura / 2;
    for (int h = 1; h <= (división + 1); h++){
      System.out.print("*");
    
    }
  }
 }
}

