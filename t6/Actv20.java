//Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
//agua. La capacidad será indicada por el usuario. La cuba se llenará con una
//cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
//pueda admitir. El ancho de la cuba no varía.
//Ejemplo:
//@author Rafael Campos Jurado
package actividades;

import java.util.Scanner;
public class Actv20 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
     int agua = 0;
     int posicionAgua = 0;
     int contadorPosicion = 0;
     
    System.out.print("Introduce la cantidad de agua que soporta la cuba: ");
    agua = s.nextInt();
    posicionAgua = (int)(Math.random () * (agua + 1));
    System.out.println(posicionAgua);
    
    for (int i = 0; i <  agua; i++){
      if (i < ( agua - posicionAgua)) {
        System.out.println("*    *");
      } else {
       System.out.println("*====*");
      }
    }
    System.out.println("******");
  }
}
