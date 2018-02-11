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
public class Fraccion {
  private int numerador;
  private int divisor;

  public Fraccion(int numerador, int divisor) {
    this.numerador = numerador;
    this.divisor = divisor;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public void setDivisor(int divisor) {
    this.divisor = divisor;
  }

  public int getNumerador() {
    return numerador;
  }

  public int getDivisor() {
    return divisor;
  }

  @Override
  public String toString() {
    return "Fraccion{" + "numerador = " + numerador + ", divisor = " + divisor + '}';
  }
  public void  invertir () {
    int auxiliar = 0;
    auxiliar = numerador;
    numerador = divisor;
    divisor = auxiliar;
  }
  public void simpificar () {
    numerador = numerador /2;
    divisor = divisor /2;
  }
  public void multiplicar () {
    int aux = 0;
    aux = numerador;
    numerador = numerador * divisor;
    divisor = aux * divisor;
  }
  public void divisor () {
    int aux = 0;
    aux = numerador;
    numerador = numerador / divisor;
    divisor = aux / divisor;
  }
  
}
