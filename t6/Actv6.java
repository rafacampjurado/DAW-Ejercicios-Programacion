//Escribe un programa que piense un número al azar entre 0 y 100. El usuario
//debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
//fallido, el programa dirá cuántas oportunidades quedan y si el número introducido
//es menor o mayor que el número secreto.
// @author Rafael Campos Jurado
 
package actividades;

import java.util.Scanner;


public class Actv6 {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int numAdiv = ((int)(Math.random()*100)+1);
      int numero = 0;
      int cuentaOportunidades = 0;
      boolean oportunidades = true;
      
//      Inicio del While 
      while (oportunidades) {
        
       System.out.print("chivato "+ numAdiv + "    ");
       System.out.print("Intenta adivinar el número: ");
        numero = s.nextInt();
        cuentaOportunidades++;
        if (numAdiv == numero) {
          System.out.println("Felicidades, has acertado el número");
          oportunidades = false;
        } else {
              if (numero > numAdiv) {
                System.out.println("Ese no era el número.");
                System.out.println("El número que has introducido es mayor que el número secreto");
              } else {
                System.out.println("Ese no era el número.");
                System.out.println("El número que has introducido es menor que el número secreto");
              }
          
          System.out.println("Te quedan "+ (5 - cuentaOportunidades) + " oportunidades, vuelve a intentarlo");
          oportunidades = true;
        }
        
        if (cuentaOportunidades == 5) {
          oportunidades = false;
        }
      }
//      Fin del while 
    }
}