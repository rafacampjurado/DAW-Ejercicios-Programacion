//Define tres arrays de 20 números enteros cada una, con nombres numero,
//cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
//array cuadrado se deben almacenar los cuadrados de los valores que hay en el
//array numero. En el array cubo se deben almacenar los cubos de los valores que
//hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
//en tres columnas.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;
public class Actv4 {

  public static void main(String[] args) {
    int [] numero = new int [20];
    int [] cuadrado = new int [20];
    int [] cubo = new int [20];
    int probabilidad = 0;
    
    System.out.print("Numero = ");
    for (int i = 0; i < 20; i++) {
      numero [i] = ((int)(Math.random()*100)+1);
      //probabilidad de que el número sea 0 o 1
      if (numero [i] == 1) {
                for (int y = 0; y < 1; y++) {
                  probabilidad = ((int)(Math.random()* 2));
                    if (probabilidad == 1) {
                      numero[i] = 1;
                    } else {
                      numero[i] = 0;
                    }
               }
             }
      System.out.printf("  %3d",numero[i]);
    }
    
    System.out.println("");
    System.out.print("Cuadrado = ");
    for (int i = 0; i < 20; i ++) {
      cuadrado [i] = numero [i] * 2;
      System.out.printf("  %3d",cuadrado[i]);
    }
    
     System.out.println("");
    System.out.print("Cubo = ");
    for (int i = 0; i < 20; i ++) {
      cubo [i] = numero [i] * 4;
      System.out.printf("  %3d",cubo[i]);
    }
    
    
  }
}
