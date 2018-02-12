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
public class  Perro extends  Mamifero {

  public Perro(String sexo) {
    super(sexo);
  }
  
    public void ladrar() {
    System.out.println("Guau guau");
  }

  public void darLaPata() {
    System.out.println("Toma mi patita");
  }
  
  public void aullar () {
    System.out.println("¡Aaaaaaauu!");
  }
  
}
