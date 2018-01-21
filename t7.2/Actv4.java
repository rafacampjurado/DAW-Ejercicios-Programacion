/*
Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.
* @Author Rafael Campos Jurado
 */
package ArrayBidimensionales;

import java.util.Scanner;

public class Actv4 {

    public static void main(String[] args)
            throws InterruptedException {
        int[][] num = new int[4][5];
        boolean salirBucle = false;
        Scanner s = new Scanner(System.in);
        int fila = 0;
        int suma = 0;
        int sumaFila0 = 0;
        int sumaFila1 = 0;
        int sumaFila2 = 0;
        int sumaFila3 = 0;

        while (!salirBucle) {
            if (fila == 3) {
                salirBucle = true;
            } else {
                salirBucle = false;
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("Introduce un número: ");
                num[fila][j] = s.nextInt();
                if (fila == 0) {
                    sumaFila0 = sumaFila0 + num[fila][j];
                } else if (fila == 1) {

                    sumaFila1 = sumaFila0 + num[fila][j];
                } else if (fila == 2) {

                    sumaFila2 = sumaFila0 + num[fila][j];
                } else if (fila == 3) {

                    sumaFila3 = sumaFila0 + num[fila][j];
                }
            }
            fila++;
        }
        fila = 0;
        boolean bucleDos = false;
        while (!bucleDos) {
            if (fila == 3) {
                bucleDos = true;
            } else {
                bucleDos = false;
            }
            for (int j = 0; j < 5; j++) {
//        System.out.print("| " + num [fila][j] + " |");
                System.out.printf("|      %3d       ", num[fila][j]);
                suma = suma + num[fila][j];
            }
            if (fila == 0) {
                Thread.sleep(1000);
                System.out.print("|  Fila " + fila + "  | " + sumaFila0);
            } else if (fila == 1) {
                Thread.sleep(1000);
                System.out.print("|  Fila " + fila + "  | " + sumaFila1);
            } else if (fila == 2) {
                Thread.sleep(1000);
                System.out.print("|  Fila " + fila + "  | " + sumaFila2);
            } else if (fila == 3) {
                Thread.sleep(1000);
                System.out.print("|  Fila " + fila + "  | " + sumaFila3);
            }
//            System.out.print("|  Fila " + fila + "  | ");
            System.out.println("");
            fila++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("| Columna " + i + " ");
//      System.out.print("");
        }
        System.out.print(" | ");
        Thread.sleep(1000);
        System.out.print(suma);
        System.out.println("");
    }
}
