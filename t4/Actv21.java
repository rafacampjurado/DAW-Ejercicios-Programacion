/*
 * Actv21.java
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * 
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación
 * que se califica como apto o no apto, por tanto se debe preguntar al usuario
 * ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
 * resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
 * mantiene la nota media anterior.
 * 
 * 
 */

public class  Actv21 {
 public static void main (String args[]) {
  System.out.print("Introduce la nota del primer control: ");
  double primerExamen;
  primerExamen = Double.parseDouble(System.console().readLine());
  
  System.out.print("Introduce la nota del segundo control: ");
  double segundoExamen;
  segundoExamen = Double.parseDouble(System.console().readLine());
  
  double media = (primerExamen + segundoExamen)/2;
  
  if (media >=5){
  System.out.print("Has aprobado, tu nota media: " +media);
  } else {
  String examenRecu;
  System.out.println("¿Has aprobado el examen de recuperación? Responde con Si o No:");
  examenRecu = System.console().readLine().toLowerCase();
  
    if (examenRecu.equals("si")) {
      System.out.print("Al recuperar el examen tu nota media es un 5.");
    } else {
      System.out.print("Al no recuperar el examen tu nota media es "+media);
     }   
  }
}
}

