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
public class Persona {

  String nombre;
  String apellidos;
  int peso;
///Constructores

  public Persona() {
  }

  public Persona(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellidos = apellidos;
  }

  public Persona(String nombre, String apellidos, int peso) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.peso = peso;
  }
////FIN contructores
  //////////////////////////////////////////////////////////////////////
  ////Setters y Getters 
/*
  Vacío 
  */
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }
////////////////////////////////////////////////////////////////////////////////////////////////
  //////////////////////////////// TO STRING

  @Override
  public String toString() {
    return "Ficha persona \n--------------------------------\n" + "nombre = " + nombre + "\napellidos = " + apellidos + "\npeso = " + peso+"Kg \n--------------------------------";
  }
public void espolea (String actitud) {
  switch(actitud){
    case "agresiva":
      System.out.println("Ghia!!!!!");
        break;
        case "cariñosa":
      System.out.println("Corre caballito");
        break;
        default:
          System.out.println("Arre arre");
  }
  
}
}
