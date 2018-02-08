/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import ArrayBidimensionales.prueba;
/**
 *
 * @author rafa
 */
public class ejemploCoche {
  public static void main(String[] args) {

  Coche pruebacoche = new Coche("FIAT", "500");
  pruebacoche.recorre(10);
  Coche pruebaCocheDos = new Coche ("SEAT","LEON");
  pruebaCocheDos.recorre(20);
    System.out.println(pruebacoche);
    System.out.println(pruebaCocheDos);
    System.out.println("KILOMETRAJE TOTAL "+ Coche.getKilometrajeTotal());
}
}
