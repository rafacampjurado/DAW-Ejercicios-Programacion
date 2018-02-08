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
  private String sexo;

  public Caballo(String nombre, String sexo) {
    this.nombre = nombre;
    this.sexo = sexo;
  }
  public Caballo () {
    
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

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  

  @Override
  public String toString() {
    return "Caballo\n" + "nombre = " + nombre +" sexo = "+sexo+", peso = " + peso + ", altura = " + altura + ", color = " + color + ", velocidad = " + velocidad + ", raza = " + raza + ", sillaDeMontar = " + sillaDeMontar + "\njinete = " + jinete;
  }
  public Caballo seApareaCon(Caballo pareja, String nombreFemenino, String nombreMasculino) {
    if (this.sexo.equals(pareja.getSexo())) {
      System.out.println("Error ");
      return null;
    } else {
      Caballo potrillo = new Caballo ();
      if ((int)(Math.random()*2) == 0) {
        potrillo.setNombre(nombreFemenino);
        potrillo.setSexo("hembra");
      } else {
        potrillo.setNombre(nombreMasculino);
        potrillo.setSexo("macho");
      }
      return potrillo;
    }
 }
}
