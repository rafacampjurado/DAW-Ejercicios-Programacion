/*
Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres métodos específicos de cada clase y redefne el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.
@Author Rafael Campos Jurado
 */
package Objetos;

public class Actv3 {
  public static void main(String[] args) {
    Animal gecko = new Animal("prueba01");
    Mamifero oso = new Mamifero("Oso pardo");
    oso.setAlimentacion("herbivoro");
    oso.comer();
//    gecko.comer();
//    gecko.dormir();
//    gecko.caminar();
  }
}