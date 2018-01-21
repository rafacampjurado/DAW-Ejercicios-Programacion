/*
Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha..
* @Author Rafael Campos Jurado
 */
package ArrayBidimensionales;

import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        int numero = -1;
        for (int i = 0; i < 1000; i++) {
            numero = (int) (Math.random() * 1001);
            if ((numero == 0) || (numero == 1000)) {
                System.out.println("|  " + numero + " |");

            }
        }

    }
}
