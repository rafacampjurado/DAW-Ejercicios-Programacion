//Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
//muestre por pantalla separados por espacios. El programa pedirá entonces
//por teclado dos valores y a continuación cambiará todas las ocurrencias del
//primer valor por el segundo en la lista generada anteriormente. Los números
//que se han cambiado deben aparecer entrecomillados.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;

public class Actv7 {

  public static void main(String[] args) {
    int numero[] = new int[100];
    int probabilidad = 0;
    Scanner s = new Scanner(System.in);
    int preguntaNumero = 0;
    int numeroSustituto = 0;
//    INICIO BUCLE NUMEROS  ALEATORIOS
    for (int i = 0; i < 100; i++) {
      numero[i] = ((int) (Math.random() * 20) + 1);
      //probabilidad de que el número sea 0 o 1
      if (numero[i] == 1) {
        for (int y = 0; y < 1; y++) {
          probabilidad = ((int) (Math.random() * 2));
          if (probabilidad == 1) {
            numero[i] = 1;
          } else {
            numero[i] = 0;
          }
        }
      }
    }
//    FIN BUCLE NUMEROS ALEATORIOS
System.out.print("Indica el número que quieres remplazarr :");
preguntaNumero = s.nextInt();
System.out.print("Indica el número nuevo número :");
numeroSustituto = s.nextInt();

for (int i = 0; i < 100; i++) {
  if ((numero[i]) == preguntaNumero) {
    numero[i] = numeroSustituto;
  }
}
//    for (int i = 0; i < 100; i++) {
//      System.out.println(numero[i]);
//    }
  }
}
