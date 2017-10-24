/*
 * Actv15.java
 * 
 * Escribe un programa que pinte una pirámide rellena con un carácter introdu-
 * cido por teclado que podrá ser una letra, un número o un símbolo como *, +,
 * -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
 * el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
 * izquierda o hacia la derecha.
 * 
 * 
 */


public class Actv15 {
public static void main (String args[]) {
System.out.print("Escribe un caracter: ");
String pregunta = System.console().readLine();
if (pregunta.equals("*")) {
System.out.println("   *   ");
System.out.println("  ***  ");
System.out.println(" ***** ");
System.out.println("*******");
}
else {
}

  }
}

