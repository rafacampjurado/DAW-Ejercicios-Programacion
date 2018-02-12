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
  private String sexo;

  public Animal() {
  }

  public Animal(String sexo) {
    this.sexo = sexo;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
public void comer (String comida) {
  System.out.println("El animal está cominendo "+comida);
} 
public void dormir () {
  System.out.println("El animal está durmiendo");
}

}
