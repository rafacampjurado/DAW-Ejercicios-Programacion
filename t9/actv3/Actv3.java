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
    Animal prueba01 = new Animal("Macho");
    Mamifero prueba02 = new Mamifero("Macho");
    Perro perro01 = new Perro("Macho");
    perro01.ladrar();
    Ave aveprueba01 = new Ave(false);
    aveprueba01.volar();
    
  }
}