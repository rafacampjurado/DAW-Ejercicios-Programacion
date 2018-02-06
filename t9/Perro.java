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
public class Perro {
  String nombreComun;
  String nombreCientifico;
  String raza;
  String colorPelo;
  String tipoPelaje;

  public Perro(String nombreComun, String raza) {
    this.nombreComun = nombreComun;
    this.raza = raza;
  }

  public Perro(String nombreComun, String nombreCientifico, String raza, String colorPelo, String tipoPelaje) {
    this.nombreComun = nombreComun;
    this.nombreCientifico = nombreCientifico;
    this.raza = raza;
    this.colorPelo = colorPelo;
    this.tipoPelaje = tipoPelaje;
  }

  public String getNombreComun() {
    return nombreComun;
  }

  public String getNombreCientifico() {
    return nombreCientifico;
  }

  public String getRaza() {
    return raza;
  }

  public String getColorPelo() {
    return colorPelo;
  }

  public String getTipoPelaje() {
    return tipoPelaje;
  }

  public void setNombreComun(String nombreComun) {
    this.nombreComun = nombreComun;
  }

  public void setNombreCientifico(String nombreCientifico) {
    this.nombreCientifico = nombreCientifico;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setColorPelo(String colorPelo) {
    this.colorPelo = colorPelo;
  }

  public void setTipoPelaje(String tipoPelaje) {
    this.tipoPelaje = tipoPelaje;
  }

  @Override
  public String toString() {
    return "Perro{" + "nombreComun=" + nombreComun + ", nombreCientifico=" + nombreCientifico + ", raza=" + raza + ", colorPelo=" + colorPelo + ", tipoPelaje=" + tipoPelaje + '}';
  }
  
  public void ladrar () {
    System.out.println("El "+nombreComun+" está ladrando");
  }
  public void escarvar () {
    System.out.println("El "+nombreComun+" está escarvando un agujero");
  }
  public void aullar () {
    System.out.println("El "+nombreComun+" está aullando");
  }
  
}
