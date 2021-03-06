/*
Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
A continuación, el programa deberá dar la posición tanto del máximo como
del mínimo.
* @Author Rafael Campos Jurado
 */
package ArrayBidimensionales;

import java.util.Scanner;

public class Actv5 {

    public static void main(String[] args) {
        int[][] num = new int[6][10];
        int fila = 0;
        boolean salirBucle = false;
        int max = 0;
        int min = 10001;
        int maxFila = 0;
        int maxColum = 0;
        int minFila = 0;
        int minColum = 0;
        String naranja = "\033[33m";
        String verde = "\033[32m";
        String blanco = "\033[37m";
        while (!salirBucle) {
            if (fila == 5) {
                salirBucle = true;
            } else {
                salirBucle = false;
            }
            for (int j = 0; j < 10; j++) {
                num[fila][j] = (int) (Math.random() * 1001);
            }
            fila++;
        }
        ///////////////////////////////////////monstramos el array//////////////////
        fila = 0;
        while (salirBucle) {
            if (fila == 5) {
                salirBucle = false;
            } else {
                salirBucle = true;
            }
            for (int j = 0; j < 10; j++) {
                System.out.print(naranja+" ( "+fila+":"+j+" ) ");
                System.out.print(verde + ""+num[fila][j] + " ");
            }
            System.out.print(blanco +"     | Columna " + fila);
            System.out.println("");
            System.out.print("------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("----------------------------------");
            System.out.println("");
            fila++;
        }
        /////////////////////////// Buscamos el máximo y el mínimo /////////////////
        ///////////////////////////////MAX/////////////////////////////////
        fila = 0;
        while (!salirBucle) {
            if (fila == 5) {
                salirBucle = true;
            } else {
                salirBucle = false;
            }
            for (int j = 0; j < 10; j++) {
                if (num[fila][j] > max) {
                    max = num[fila][j];
                    maxFila = fila;
                    maxColum = j;
                }
            }
            fila++;
        }
        System.out.println("El valor máximo  está en " + maxFila + " : " + maxColum);
        //////////////////////////Min//////////////////////////
                fila = 0;
        while (salirBucle) {
            if (fila == 5) {
                salirBucle = false;
            } else {
                salirBucle = true;
            }
            for (int j = 0; j < 10; j++) {
                if (num[fila][j] < min) {
                    min = num[fila][j];
                    minFila = fila;
                    minColum = j;
                }
            }
            fila++;
        }
        System.out.println("El valor mínimo  está en " + minFila + " : " + minColum);
    }
}
