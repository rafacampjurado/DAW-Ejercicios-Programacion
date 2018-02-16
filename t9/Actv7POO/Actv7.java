/*
Queremos gestionar la venta de entradas (no numeradas) de Expocoches
Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles,
la zona de compra-venta con 200 entradas disponibles y la zona vip
con 25 entradas disponibles. Hay que controlar que existen entradas antes de
venderlas.
La clase Zona con sus atributos y métodos se muestra a continuación:
@Author Rafael Campos Jurado
 */
package Actv7POO;

import java.util.Scanner;

public class Actv7 {

  public static void main(String[] args) {
    Zona salaA = new Zona(1000);
    Zona salaB = new Zona(200);
    Zona salaC = new Zona(25);
    Scanner s = new Scanner(System.in);
    int opcion = 0;
    int entradas = 0;
    do {
      System.out.println("1. Mostrar número de entradas libres.");
      System.out.println("2. Vender entradas.");
      System.out.println("3. Salir");
      opcion = s.nextInt();
      switch (opcion) {
        case 1:
          System.out.println("Para la sala principal quedan " + salaA.getEntradasPorVender() + " entradas");
          System.out.println("Para la sala de compra-venta quedan " + salaB.getEntradasPorVender() + " entradas");
          System.out.println("Para la sala vip quedan  " + salaC.getEntradasPorVender() + " entradas");
          break;
        case 2:
          System.out.println("¿De qué tipo desea la entrada (1-Sala principal, 2-Sala compra-venta, 3-Sala vip) ?: ");
          opcion = s.nextInt();
          switch (opcion) {
            case 1:
              System.out.println("¿Cuántas entradas desea comprar para la sala principal? :");
              entradas = s.nextInt();
              salaA.vender(entradas);
              break;
            case 2:
              System.out.println("¿Cuántas entradas desea comprar para la sala compra-venta? :");
              entradas = s.nextInt();
              salaB.vender(entradas);
              break;
            case 3:
              System.out.println("¿Cuántas entradas desea comprar para la sala vip? :");
              entradas = s.nextInt();
              salaC.vender(entradas);
              break;
            default:
          }
          break;
        case 3:
          System.out.println("Saliendo..");
          break;
      }
    } while (opcion != 3);
  }

}
