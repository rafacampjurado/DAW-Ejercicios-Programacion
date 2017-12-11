//Escribe un programa que rellene un array con 10 números aleatorios (números entre 0 y 100) y que luego cree
//otro array con esos mismos números “barajados”, es decir, reordenados de forma aleatoria. Puede haber
//números repetidos en el array original.
//@Author Rafael Campos Jurado
package Examen;

import java.util.Scanner;

public class Actv3 {

    public static void main(String[] args) {
        int numero[] = new int[10];
        int ordenado[] = new int[10];
        int memoria[] = new int[10];
        int contador = 0;
        int posiciones = 0;

        for (int i = 0; i < 10; i++) {
            numero[i] = (int) (Math.random() * 101);
        }
        System.out.print("Array numero =   ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numero[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            posiciones = (int) (Math.random() * 10);
            memoria[i] = posiciones;
            System.out.println("Valor de memoria " + i + " = " + memoria[i]);
        }
        for (int i = 0; i < 10; i++) {
            if (memoria[i] == posiciones) {
                posiciones = (int) (Math.random() * 10);
            } else {
                memoria[i] = posiciones;
            }
            memoria[i] = posiciones;
        }
        for (int j = 0; j < 10; j++) {
            if (memoria[j] == posiciones) {
                posiciones = (int) (Math.random() * 10);
            } else {

            }
        }
//                ordenado[i] = numero[posiciones];            

        System.out.println("");
        System.out.print("Array ordenado =   ");
        for (int i = 0; i < 10; i++) {
            System.out.print(ordenado[i] + " ");
        }
    }
}
