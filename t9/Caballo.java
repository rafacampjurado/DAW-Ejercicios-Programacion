/*
Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
instancias y aplicándole algunos métodos.
@Author Rafael Campos Jurado
 */
package Objetos;

public class Caballo {
   String nombre;
  double peso;
  int altura;
  String color;
  int velocidad = 0;
  String raza;
  String sillaDeMontar;
  Persona jinete;

  public Caballo(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPeso() {
    return peso;
  }

  public int getAltura() {
    return altura;
  }

  public String getColor() {
    return color;
  }

  public int getVelocidad() {
    return velocidad;
  }

  public String getRaza() {
    return raza;
  }

  public String getSillaDeMontar() {
    return sillaDeMontar;
  }

  public Persona getJinete() {
    return jinete;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setSillaDeMontar(String sillaDeMontar) {
    this.sillaDeMontar = sillaDeMontar;
  }

  public void setJinete(Persona jinete) {
    this.jinete = jinete;
  }

  @Override
  public String toString() {
    return "Caballo\n" + "nombre = " + nombre + ", peso = " + peso + ", altura = " + altura + ", color = " + color + ", velocidad = " + velocidad + ", raza = " + raza + ", sillaDeMontar = " + sillaDeMontar + "\njinete = " + jinete;
  }
  
}
