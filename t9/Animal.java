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
public class Animal {
  String nombreComun;
  String nombreCientifico;
  String reinoAnimal;

  public Animal(String nombreComun) {
    this.nombreComun = nombreComun;
  }

  public String getNombreComun() {
    return nombreComun;
  }

  public String getNombreCientifico() {
    return nombreCientifico;
  }

  public String getReinoAnimal() {
    return reinoAnimal;
  }

  public void setNombreComun(String nombreComun) {
    this.nombreComun = nombreComun;
  }

  public void setNombreCientifico(String nombreCientifico) {
    this.nombreCientifico = nombreCientifico;
  }
  
 /*
  Mamifero , Ave, Gato, Perro, Canario, Pinguino y Lagarto
  */
  public void setReinoAnimal(String reinoAnimal) {
    this.reinoAnimal = reinoAnimal;
  }

  @Override
  public String toString() {
    return "Animal{" + "nombreComun=" + nombreComun + ", nombreCientifico=" + nombreCientifico + ", reinoAnimal=" + reinoAnimal + '}';
  }



  
  public void comer () {
    System.out.println("El "+ nombreComun + " está comiendo");
  }
  public void dormir () {
    System.out.println("El "+nombreComun+ " está durmiendo");
  }
  public void caminar (){
    System.out.println("El "+nombreComun+" está caminando");
  }
}
