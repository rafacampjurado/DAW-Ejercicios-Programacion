/*Realiza un programa que genere 20 números aleatorios entre 2 y 100. A continuación, el programa
deberá mostrar un listado con todos los números primos encontrados. Si no existiera ningún primo, el
programa deberá mostrar el mensaje “No se ha encontrado ningún número primo.”

@Author Rafael Campos Jurado
 */
package DAM_Examen;

public class Actv1V2 {

  public static void main(String[] args) {
    int numero[] = new int[20];
    boolean esPrimo = true;
    int primos[] = new int[20];
    int contador = 0;

//INICIO GENERAMOS LOS NÚMEROS ALEATORIOS Y LOS MUESTRA
    for (int i = 0; i < 20; i++) {
      numero[i] = ((int) (Math.random() * 99) + 2);
      System.out.print(numero[i] + " ");
    }
//FIN GENERAR NÚMEROS ALEATORIOS 
    System.out.println("");
//INICIO COMPRUEBA SI LOS NÚMEROS SON PRIMOS 
    for (int i = 0; i < 20; i++) {
      esPrimo = true;
      for (int y = 2; y < numero[i]; y++) {
        if ((numero[i] % y) == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        primos[i] = numero[i];
      } else {
        contador++;
      }
    }
//FIN COMPROBAR SI LOS NÚMEROS SON PRIMOS
//INICIO MOSTRAR MENSAJES
    if (contador == 20) {
      System.out.println("No hay números primos");
    } else {
      System.out.print("Primos encontrados  = ");
      for (int i = 0; i < 20; i++) {
        if (primos[i] == 0) {
        } else {
          System.out.print(" " + primos[i] + " ");
        }
      }
    }
//FIN MOSTRAR MENSAJES
    System.out.println("");
  }
}
