/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actv6POO;

/**
 *
 * @author rafa
 */
public class Tiempo {

  private int horas;
  private int minutos;
  private int segundos;

  public Tiempo(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  @Override
  public String toString() {
    return "Tiempo{" + "horas=" + horas + "h , minutos=" + minutos + "m , segundos=" + segundos + "s }";
  }

  public Tiempo sumar(Tiempo auxiliar) {
    int horas = 0;
    int minutos = 0;
    int segundos = 0;
    segundos = this.segundos + auxiliar.segundos;
    if (segundos >= 60) {
      segundos = segundos - 60;
      minutos += 1;
    }
    minutos += this.minutos + auxiliar.minutos;
    if (minutos >= 60) {
      minutos = minutos - 60;
      horas += 1;
    }
    horas += this.horas + auxiliar.horas;
    Tiempo resultado = new Tiempo(horas, minutos, segundos);
    return resultado;
  }

  public Tiempo restar(Tiempo auxiliar) {
    int horas = 0;
    int minutos = 0;
    int segundos = 0;
    horas = this.horas - auxiliar.horas;
    if (horas == 0) {
      horas = 0;
      minutos = 59;
    }
    minutos -= this.minutos + auxiliar.minutos;
    if (minutos == 0) {
      minutos = 0;
      segundos = 59;
    }
    segundos = this.segundos - auxiliar.segundos;
    Tiempo resultado = new Tiempo(horas, minutos, segundos);
    return resultado;
  }

}
