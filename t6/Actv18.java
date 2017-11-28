//Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
//sustituir el color blanco por colores más alegres.
//     Realiza un programa que genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
//cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
//que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y naranja.
//@author Rafael Campos Jurado
package actividades;

public class Actv18 {

  public static void main(String[] args) {
    String color = "";
    int colorA = 0;
    int colorB = 0;
    int colorC = 0;
    do {
      colorA = ((int) (Math.random() * 6) + 1);
      colorB = ((int) (Math.random() * 6) + 1);
      colorC = ((int) (Math.random() * 6) + 1);
    } while (((colorA == colorB) || (colorA == colorC) || (colorB == colorC)));

    switch (colorA) {
      case 1:
        color = "rojo";
        break;
      case 2:
        color = "azul";
        break;
      case 3:
        color = "verde";
        break;
      case 4:
        color = "amarillo";
        break;
      case 5:
        color = "violeta";
        break;
      case 6:
        color = "naranja";
        break;
      default:
        break;
    }
    System.out.println("color A = " + color);

    switch (colorB) {
      case 1:
        color = "rojo";
        break;
      case 2:
        color = "azul";
        break;
      case 3:
        color = "verde";
        break;
      case 4:
        color = "amarillo";
        break;
      case 5:
        color = "violeta";
        break;
      case 6:
        color = "naranja";
        break;
      default:
        break;
    }
    System.out.println("color B = " + color);

    switch (colorC) {
      case 1:
        color = "rojo";
        break;
      case 2:
        color = "azul";
        break;
      case 3:
        color = "verde";
        break;
      case 4:
        color = "amarillo";
        break;
      case 5:
        color = "violeta";
        break;
      case 6:
        color = "naranja";
        break;
      default:
        break;
    }
    System.out.println("color C = " + color);
  }
}
