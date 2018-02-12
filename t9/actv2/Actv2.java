/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actv2;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class Actv2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int km = 0;
    int elegir = 0;
    System.out.println("Se crean dos vehiculos, un coche (cocheA) y una bicicleta (biciA)");
    Coche cocheA = new Coche();
    Bicileta biciA = new Bicileta();
    do {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz un caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.print("Introduce 8 para salir : ");
      elegir = s.nextInt();
      System.out.println(" ");

      if (elegir != 8) {
        switch (elegir) {
          case 1:
            System.out.println("¿Cuantos metros quieres recorrer? :");
            km = s.nextInt();
            biciA.recorrer(km);
            System.out.println(" ");
            break;
          case 2:
            biciA.caballito();
            break;
          case 3:
            System.out.println("¿Cuantos metros quieres recorrer? :");
            km = s.nextInt();
            cocheA.recorrer(km);
            System.out.println(" ");
            break;
          case 4:
            cocheA.quemarRuedas();
            System.out.println(" ");
            break;
          case 5:
            System.out.println("La bicicleta ha realizado "+biciA.getKilometrosRecorridos()+" km");
            System.out.println(" ");
            break;
          case 6:
            System.out.println("El coche  ha realizado "+cocheA.getKilometrosRecorridos()+" km");
            System.out.println(" ");
            break;
          case 7:
            System.out.println("Se han realizado "+vehiculos.getKilometrosTotales()+" km");
            System.out.println(" ");
            break;
        }
      }
    } while (elegir != 8);

  }

}
