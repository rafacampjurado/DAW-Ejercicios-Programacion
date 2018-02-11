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
public class Mamifero extends Animal{

  public Mamifero() {
  }
  

  public Mamifero(String sexo) {
    super(sexo);
  }
  
public void amamantar () {
  if (this.getSexo  () == "Macho") {
    System.out.println("El animal es macho, no puede");
  } else {
    System.out.println("El animal amamanta a su cría");
  }
}

}
