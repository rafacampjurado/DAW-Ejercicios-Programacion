/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto.perro;

/**
 *
 * @author rafa
 */
public class Perro {
  private String nombre;
  private String sexo;
  private String imagenUrl;

  public Perro(String nombre, String sexo, String imagenUrl) {
    this.nombre = nombre;
    this.sexo = sexo;
    this.imagenUrl = imagenUrl;
  }

  public Perro() {
  }


  @Override
  public String toString() {
    String resultado = " ";
    if (sexo.equals("macho")){
      resultado += "Perro ";
    } else {
      resultado += "Perra ";
    }
    resultado += this.nombre + " ";
    resultado += "<img src =\"img/"+ this.imagenUrl+"\" width =\"200\"></br>";
    return resultado;
  }
  
  public String ladrar () {
    return "Guau gau ";
  }
  
}
