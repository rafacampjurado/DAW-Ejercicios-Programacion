//Escribe un programa que simule la tirada de dos dados. El programa deberá
//continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
//dados tengan el mismo valor.
// * @author Rafael Campos Jurado
// */
package actividades;

public class Actv13{
  public static void main(String[] args) {
    int tiradaDadoUno = 0;
     int tiradaDadoDos = 0;
    boolean dados = true;
    while (dados) {
      tiradaDadoUno = ((int)(Math.random()*6)+1);
      tiradaDadoDos = ((int)(Math.random()*6)+1);
      System.out.println("Tirada del primer dado = "+ tiradaDadoUno);
      System.out.println("Tirada del segundo dado = "+ tiradaDadoDos);
      if (tiradaDadoUno == tiradaDadoDos) {
        dados = false;
      }
    }
  }
}
