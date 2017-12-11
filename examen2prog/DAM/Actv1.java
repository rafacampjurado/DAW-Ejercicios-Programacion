/*Realiza un programa que genere 20 números aleatorios entre 2 y 100. A continuación, el programa
deberá mostrar un listado con todos los números primos encontrados. Si no existiera ningún primo, el
programa deberá mostrar el mensaje “No se ha encontrado ningún número primo.”

@Author Rafael Campos Jurado
 */
package DAM_Examen;

public class Actv1 {

  public static void main(String[] args) {
    int numero[] = new int[20];
    boolean esPrimo = true;
    int contador = 0;

    for (int i = 0; i < 20; i++) {
      numero[i] = ((int) (Math.random() * 99) + 2);
    }
    for (int i = 0; i < 20; i++) {
      for (int y = 2; y < numero[i]; y++) {
        if (numero[i] % y == 0) {
          esPrimo = false;
        }
      }
      if (!esPrimo) {
        contador++;
      }
      if (esPrimo) {
        System.out.println("Primo = " + numero[i]);
      }
    }
    if (contador == 20) {
      System.out.println("No hay números primos");
    }
  }
}
