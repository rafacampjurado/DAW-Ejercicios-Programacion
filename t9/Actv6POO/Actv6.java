/*
Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
30) donde los parámetros que se le pasan al constructor son las horas, los
minutos y los segundos respectivamente. Crea el método toString para ver los
intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
comprobar que la clase funciona bien.
 */
package Actv6POO;

/**
 *
 * @author rafa
 */
public class Actv6 {
  public static void main(String[] args) {
    Tiempo ejemplo01 = new Tiempo(0, 30, 40);
    Tiempo ejemplo02 = new Tiempo(0, 35, 20);
    Tiempo resultadoSuma = ejemplo01.sumar(ejemplo02);
    System.out.println("resultado suma = "+ resultadoSuma);
    Tiempo resta = new Tiempo(7, 30, 40);
    System.out.println("valor de resta  = "+ resta);
    Tiempo resultadoResta = resta.restar(resultadoSuma);
    System.out.println("resultado resta = "+resultadoResta);
  }
}
