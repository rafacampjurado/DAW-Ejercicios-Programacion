/*
Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
El siguiente código del programa principal debe dar la salida que se muestra:
@Author Rafael Campos Jurado
 */
package Actv5POO;
public class Actv5 {

  public static void main(String[] args) {
Pizza p1 = new Pizza(Tipo.margarita, Tamaño.mediana);
    System.out.println(p1.getEstado());
    p1.servirPizza();
    System.out.println(p1.getEstado());
    p1.servirPizza();
    System.out.println(p1);
    Pizza p2 = new Pizza(Tipo.funghi, Tamaño.mediana);
    System.out.println(Pizza.getPizzasServidas());
    System.out.println(Pizza.getPizzasTotales());
  }
}
