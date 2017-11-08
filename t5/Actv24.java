/*
 * Actv24.java
 * 
 * Escribe un programa que lea un número "n" e imprima una pirámide de números
 * con "n" filas como en la siguiente figura:
 *    1
 *   121
 *  12321
 * 1234321
 * 
 * @author Rafael Campos Jurado
 */


public class Actv24 {
public static void main (String args[]) {
System.out.print("Introduce la altura de la pirámide: ");
  int pedirAltura = Integer.parseInt(System.console().readLine());
     int num = pedirAltura;
        int longi = num- 1;
        int altura=1;
        int max=1;
        int h=1;
        
        for (int i = 1; i <= num; i++) {
          
            for (int j = 1; j <= longi; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < altura * 2; j++) {

                if(j>max) {
                    System.out.print(h-1);
                    h--;
                } else {
                    System.out.print(j);
                }
            }
            System.out.println("");
            max++;
            h=max;
            altura++;
            longi--;
        }
    }
}
