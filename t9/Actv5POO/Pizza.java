/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actv5POO;

/**
 *
 * @author rafa
 */
public class Pizza {
  private  Tipo tipo;
  private Tamaño tamaño;
  private String estado;
  private static int pizzasTotales;
  private static int pizzasServidas;

  public Pizza(Tipo tipo, Tamaño tamaño) {
    this.tipo = tipo;
    this.tamaño = tamaño;
    this.estado = "pedida";
    Pizza.pizzasTotales += 1;
  }

  public static int getPizzasTotales() {
    return pizzasTotales;
  }

  public static int getPizzasServidas() {
    return pizzasServidas;
  }

  public String getEstado() {
    return estado;
  }

  @Override
  public String toString() {
    return "Pizza \n----------------------\n" + "- tipo = " + tipo + "\n"+" - tama\u00f1o = " + tamaño + "\n - estado = " + estado;
  }
  
  
  public void servirPizza () {
    if (estado.equals("servida")) {
      System.out.println("Esa pizza ya ha sido servida");
    } else {
      System.out.println("La pizza "+this.tipo +" "+ this.tamaño + " , servida");
      this.estado = "servida";
      pizzasServidas += 1;
    }
    
  }
}
