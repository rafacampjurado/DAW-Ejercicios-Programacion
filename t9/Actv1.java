/*
Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
instancias y aplicándole algunos métodos.
@Author Rafael Campos Jurado
 */
package Objetos;

public class Actv1 {
  public static void main(String[] args) {
    Caballo rocinante = new Caballo("Rocinante");
    Persona pepe = new Persona("Pepe", "Pérez");
    rocinante.setRaza("Flaco");
    rocinante.setColor("blanco");
    rocinante.setJinete(pepe);
   
//    System.out.println(pepe);
    System.out.println(rocinante);
    pepe.espolea("agresiva");
  }
}