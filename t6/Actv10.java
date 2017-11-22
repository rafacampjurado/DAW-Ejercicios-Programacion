//Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
//El carácter con el que se pinta cada línea se elige de forma aleatoria
//entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
//aleatoria entre 1 y 40 caracteres.
// @author Rafael Campos Jurado
 
package actividades;

import java.util.Scanner;


public class Actv10 {

    public static void main(String[] args) {
      int numCaracter = 0;
      String caracter = "";
      int longitud = 0;
      for (int i = 0; i <= 10; i++) {
        numCaracter = ((int)(Math.random()*6)+1);
          switch (numCaracter) {
            case 1:
              caracter = "*";
              break;
            case 2:
              caracter = "-";
              break;
            case 3:
              caracter = "=";
              break;
            case 4:
              caracter = ".";
              break;
            case 5:
              caracter = "|";
              break;
            case 6:
              caracter = "@";
              break;
            default:
              break;
          }
          longitud = ((int)(Math.random()*40)+1);
          for (int y = 1; y <= longitud; y++) {
            System.out.print(caracter);
        }
          System.out.println();
      }
  }
}