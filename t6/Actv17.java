//Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
//Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
//serán de 4 unidades. No hay que comprobar que los datos se introducen
//correctamente; podemos suponer que el usuario los introduce bien. 
//Dentro de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
//situado en cualquiera de las posiciones que quedan en el hueco que forma el
//rectángulo.
//@author Rafael Campos Jurado
package actividades;

import java.util.Scanner;

public class Actv17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int alto = 0;
    int ancho = 0;
    int contadorEspacios = 0;
    
    System.out.print("introduce el ancho de la pecera (mínimo 4): ");
    ancho = s.nextInt();
    System.out.print("introduce el alto de la pecera (mínimo 4): ");
    alto = s.nextInt();
    int numEspacios = (ancho - 2) * 2;
    int posicionPez = ((int)(Math.random ()* (alto - 2) * (ancho - 2)));
    int posicion = 0;
    boolean pez = true;
    System.out.println(numEspacios);
    System.out.println(posicionPez);
    
   // Línea superior ////////////////////////////////////////////////////////
      for (int i = 1; i <= ancho; i++) {
        System.out.print("* ");
      }
      
      // Parte intermedia //////////////////////////////////////////////////////
      for (int i = 2; i < alto; i ++) {
        System.out.print("\n* ");
        for (int espacios = 2; espacios < ancho; espacios++) {
          if (posicion == posicionPez) {
                System.out.print("& ");
//                pez = false;
          } else {
            System.out.print("  ");
           
          }
           posicion++;
        }
        System.out.print("* ");
      }
      System.out.println();
      
      // Línea inferior ////////////////////////////////////////////////////////
      for (int i = 1; i <= ancho; i++) {
        System.out.print("* ");
      }
      System.out.print("\n"+contadorEspacios);
  }
}

