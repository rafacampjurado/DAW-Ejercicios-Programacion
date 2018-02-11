/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author rafa
 */
public class Ave extends Animal{
  private boolean tieneAlas;

  public Ave() {
  }

  public Ave(boolean tieneAlas) {
    this.tieneAlas = tieneAlas;
  }
  



  
  public void ponerHuevos () {
    System.out.println("Está realizando una puesta");
  }
public void volar () {
  if(tieneAlas) {
    System.out.println("Está volando");
  } else {
    System.out.println("No puede volar");
  }
}
public void picotear () {
  System.out.println("Está picoteando");
}
}
