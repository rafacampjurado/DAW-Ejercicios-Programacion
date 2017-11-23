//Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
//con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
//convertir un entero en un carácter.
// * @author Rafael Campos Jurado
// */
package actividades;

public class Actv12{
  public static void main(String[] args) {
    int numero = 0;
    String verde = "\033[32m";
    while (true) {
      numero = ((int)(Math.random()*94)+32);
//      numero = String.ValueOf(numero);
      System.out.print(verde+(char)numero);
    }
  }
}
