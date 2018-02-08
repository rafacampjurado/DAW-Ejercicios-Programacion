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
public class Coche {
  private static int kilometrajeTotal = 0;
    
  private String marca;
  private String modelo;
  private String numBastidor;
  private String matricula;
  private String color;
  private int numeroDePuertas;
  private int kilometraje;

  public Coche(String marca, String modelo, String numBastidor, String matricula, String color, int numeroDePuertas, int kilometraje) {
    this.marca = marca;
    this.modelo = modelo;
    this.numBastidor = numBastidor;
    this.matricula = matricula;
    this.color = color;
    this.numeroDePuertas = numeroDePuertas;
    this.kilometraje = kilometraje;
  }

  public Coche(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
    kilometraje = 0;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public static int getKilometrajeTotal() {
    return kilometrajeTotal;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getNumBastidor() {
    return numBastidor;
  }

  public void setNumBastidor(String numBastidor) {
    this.numBastidor = numBastidor;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getNumeroDePuertas() {
    return numeroDePuertas;
  }

  public void setNumeroDePuertas(int numeroDePuertas) {
    this.numeroDePuertas = numeroDePuertas;
  }

  public int getKilometraje() {
    return kilometraje;
  }

  public void setKilometraje(int kilometraje) {
    this.kilometraje = kilometraje;
  }

  @Override
  public String toString() {
    return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", numBastidor=" + numBastidor + ", matricula=" + matricula + ", color=" + color + ", numeroDePuertas=" + numeroDePuertas + ", kilometraje=" + kilometraje + '}';
  }

  public void recorre(int kilometros) {
    kilometraje += kilometros;
    Coche.kilometrajeTotal += kilometros;
  }
}
