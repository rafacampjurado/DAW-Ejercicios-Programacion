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
  int numerador;
  int divisor;

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
    numerador += 1;
    divisor += 1;
  }
  public void simpificar () {
    numerador -= 1;
    divisor -= 1;
  }
  
}
