/*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
* también la suma total (los puntos que suman entre los tres dados).
*/
package actividades;

/**
 *
 * @author rafa
 */
public class Actividad1 {
public static void main(String[] args) {
  int dado = 0;
  int suma = 0;
    for (int i = 1; i <= 3; i++)  {
       dado = ((int)(Math.random()* 6) + 1 );
       suma += dado;
       System.out.println("Valor del dado "+ i +" = "+dado);
       
     }
    System.out.println("Suma total de los resultados =  "+suma);
  }
}
