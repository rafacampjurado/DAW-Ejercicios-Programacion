/*
 * Actv07.java
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv07 {
public static void main (String args[]) {
  //~ int i = 0;
  int respuesta;
  for (int i = 0; i <4; i++){
    System.out.println("Introduce un número de 4 cifras: ");
     respuesta = Integer.parseInt(System.console().readLine());
  
  if (respuesta == 333) {
    System.out.println("Respuesta correcta. La caja se abre.");
  }else{
    System.out.print("La respuesta es incorrecta");
  }
  }
 }
}


