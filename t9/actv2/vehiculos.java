/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actv2;

/**
 *
 * @author rafa
 */
public class vehiculos {
 private static  int vehiculosCreados = 0;
 private static int kilometrosTotales = 0;
 
 private  int kilometrosRecorridos;

  public vehiculos() {
    this.kilometrosRecorridos = 0;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
  /**
   * 
   * @param km 
   */
public void recorrer (int km) {
  this.kilometrosRecorridos += km;
  vehiculos.kilometrosTotales += km;
}

 
}
