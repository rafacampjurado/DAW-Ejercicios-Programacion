//Muestra por pantalla una secuencia aleatoria de 10 números múltiplos de 7 comprendidos entre el 140
//y el 210 ambos incluidos.
//@Author Rafael Campos Jurado
package Examen;

import java.util.Scanner;

public class Actv6 {

    public static void main(String[] args) {
        int numero[] = new int[10];
        int aleatorio = 1;

        for (int i = 0; i < 10; i++) {
            while (aleatorio % 7 != 0) {
                aleatorio = ((int) (Math.random() * 71) + 140);
            }
            System.out.println("Num "+ (i+1) +" "+ aleatorio + " ");
            aleatorio = 1;
        }


    }
}
