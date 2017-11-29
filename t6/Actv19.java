//Escribe un programa que muestre 50 números enteros aleatorios comprendidos
//entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
//luego el máximo de los pares el mínimo de los impares y la media de todos los
//números generados.
//@author Rafael Campos Jurado
package actividades;

public class Actv19 {

  public static void main(String[] args) {
    int numPositivo = 0;
    int numNegativo = 0;
    int auxSuma = 0;
    int suma = 0;
    int paresMax = 0;
    int paresMin = 0;
    for (int i = 0; i < 25; i++) {
      numPositivo = ((int) (Math.random() * 200) + 1);
      numNegativo = ((int) (Math.random() * -100) - 1);
      auxSuma += (numNegativo) * -1;
      suma = suma + numPositivo + auxSuma;
      System.out.println(" positivo = " + numPositivo + " ");
      System.out.println(" negativo = " + numNegativo + " ");

      if (numPositivo % 2 == 0) {
        if (numPositivo > paresMax) {
          paresMax = numPositivo;
        }
      }
      if (numNegativo % 2 == 0) {
        if (numNegativo < paresMin) {
          paresMin = numNegativo;
        }
      }
    }
    System.out.println("Media = " + (suma / 25));
    System.out.println("Máximo pares = " + paresMax);
    System.out.println("Mínimo pares = " + paresMin);
  }
}
