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
public class Gato extends Mamifero {
  
  public void maullar () {
    System.out.println("<El gato maulla>");
  }
  public void arañar () {
    System.out.println("<El gato saca las garras y araña>");
  }
  public void cazar (String presa) {
    System.out.println("El gato se prepara y consigue cazar a su presa ("+presa+")");
  }
}
