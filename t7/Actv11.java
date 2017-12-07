//Realiza un programa que pida 10 números por teclado y que los almacene en
//un array. A continuación se mostrará el contenido de ese array junto al índice
//(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
//primos a las primeras posiciones, desplazando el resto de números (los que
//no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
//el array resultante.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;

public class Actv11 {

    public static void main(String[] args) {
        int numero[] = new int[10];
        int ordenado[] = new int[10];
        Scanner s = new Scanner(System.in);
        int posiciones = 0;
        int contadorPrimos = 0;
        boolean esPrimo = true;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número (" + i + " de 10) : ");
            numero[i] = s.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print(numero[i] + " ");
        }
        System.out.println("");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < 10; i++) {
            esPrimo = true;
            if (posiciones < 10) {
                for (int j = 2; j < numero[i]; j++) {
                    if (numero[i] % j == 0) {
                        esPrimo = false;
                    }
                }
                if (esPrimo) {
                    ordenado[posiciones] = numero[i];
                    posiciones++;
                } else {
                    contadorPrimos++;
                }
            }
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        posiciones = 10 - contadorPrimos;
        for (int i = 0; i < 10; i++) {
            esPrimo = true;
            if (posiciones < 10) {
                for (int j = 2; j < numero[i]; j++) {
                    if (numero[i] % j == 0) {
                        esPrimo = false;
                    }
                }
                if (!esPrimo) {
                    ordenado[posiciones] = numero[i];
                    posiciones++;
                } 
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(ordenado[i] + " ");
        }
    }
}
