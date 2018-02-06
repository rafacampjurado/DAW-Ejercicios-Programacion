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
public class Mamifero {
  String nombreComun;
  String nombreCientifico;
  String tipoPelaje;
  String habitat;
  String alimentacion;
  

  public Mamifero(String nombreComun) {
    this.nombreComun = nombreComun;
  }

  public Mamifero(String nombreComun, String nombreCientifico, String tipoPelaje, String habitat, String alimentacion) {
    this.nombreComun = nombreComun;
    this.nombreCientifico = nombreCientifico;
    this.tipoPelaje = tipoPelaje;
    this.habitat = habitat;
    this.alimentacion = alimentacion;
  }

  public String getNombreComun() {
    return nombreComun;
  }

  public String getNombreCientifico() {
    return nombreCientifico;
  }

  public String getTipoPelaje() {
    return tipoPelaje;
  }

  public String getHabitat() {
    return habitat;
  }

  public String getAlimentacion() {
    return alimentacion;
  }

  public void setNombreComun(String nombreComun) {
    this.nombreComun = nombreComun;
  }

  public void setNombreCientifico(String nombreCientifico) {
    this.nombreCientifico = nombreCientifico;
  }

  public void setTipoPelaje(String tipoPelaje) {
    this.tipoPelaje = tipoPelaje;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  public void setAlimentacion(String alimentacion) {
    this.alimentacion = alimentacion;
  }

  @Override
  public String toString() {
    return "Mamifero{" + "nombreComun=" + nombreComun + ", nombreCientifico=" + nombreCientifico + ", tipoPelaje=" + tipoPelaje + ", habitat=" + habitat + ", alimentacion=" + alimentacion + '}';
  }
  
  public void comer () {
    switch(alimentacion) {
      case "carnivoro":
        System.out.println("El "+nombreComun+" está comiendo la carne de otro animal");
        break;
      case "herbivoro":
        System.out.println("El "+nombreComun+" está comiendo plantas ");
        break;
      case "homnivoro":
        System.out.println("El "+nombreComun+" puede estar comiendo carne o plantasl");
        break;
        default:  
    }
  }
    public void amamantar () {
      System.out.println("El "+nombreComun+" está amamantando a sus crías");
    }
    public void parir () {
      System.out.println("El "+nombreComun+" está dando a luz");
  }
}
