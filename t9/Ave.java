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
public class Ave {
  String nombreComun;
  String nombreCientifico;
  String habitat;
  String alimentacion;
  String especie;
  String colorPelaje;
  boolean tieneAlas;

  public Ave(String nombreComun, boolean tieneAlas) {
    this.nombreComun = nombreComun;
    this.tieneAlas = tieneAlas;
  }

  public Ave(String nombreComun, String nombreCientifico, String habitat, String alimentacion, String especie, String colorPelaje, boolean tieneAlas) {
    this.nombreComun = nombreComun;
    this.nombreCientifico = nombreCientifico;
    this.habitat = habitat;
    this.alimentacion = alimentacion;
    this.especie = especie;
    this.colorPelaje = colorPelaje;
    this.tieneAlas = tieneAlas;
  }

  public String getNombreComun() {
    return nombreComun;
  }

  public String getNombreCientifico() {
    return nombreCientifico;
  }

  public String getHabitat() {
    return habitat;
  }

  public String getAlimentacion() {
    return alimentacion;
  }

  public String getEspecie() {
    return especie;
  }

  public String getColorPelaje() {
    return colorPelaje;
  }

  public boolean isTieneAlas() {
    return tieneAlas;
  }

  public void setNombreComun(String nombreComun) {
    this.nombreComun = nombreComun;
  }

  public void setNombreCientifico(String nombreCientifico) {
    this.nombreCientifico = nombreCientifico;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  public void setAlimentacion(String alimentacion) {
    this.alimentacion = alimentacion;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public void setColorPelaje(String colorPelaje) {
    this.colorPelaje = colorPelaje;
  }

  public void setTieneAlas(boolean tieneAlas) {
    this.tieneAlas = tieneAlas;
  }

  @Override
  public String toString() {
    return "Ave{" + "nombreComun=" + nombreComun + ", nombreCientifico=" + nombreCientifico + ", habitat=" + habitat + ", alimentacion=" + alimentacion + ", especie=" + especie + ", colorPelaje=" + colorPelaje + ", tieneAlas=" + tieneAlas + '}';
  }



  
  public void ponerHuevos () {
    System.out.println("El "+nombreComun+" está realizando una puesta");
  }
public void volar () {
  if(tieneAlas) {
    System.out.println("El "+nombreComun+" está volando");
  } else {
    System.out.println("El "+nombreComun+" no puede volar");
  }
}
public void picotear () {
  System.out.println("El "+nombreComun+" está picoteando");
}
}
