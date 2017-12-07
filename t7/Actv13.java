//Escribe un programa que rellene un array de 100 elementos con números enteros
//aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
//el programa mostrará el array y preguntará si el usuario quiere destacar el
//máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
//el número destacado entre dobles asteriscos.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;

public class Actv13 {

    public static void main(String[] args) {
        int numero[] = new int[100];
        Scanner s = new Scanner(System.in);
        int pregunta = 0;
        int numeroMin = 0;
        int numeroMax = 0;
        String rojo = "\033[31m";
        String blanco = "\033[37m";
        int probabilidad = 0;

//        GENERA LOS NÚMEROS ALEATORIOS
        for (int i = 0; i < 100; i++) {
            numero[i] = ((int) (Math.random() * 500) + 1);
            if (numero[i] == 1) {
                for (int y = 0; y < 1; y++) {
                    probabilidad = ((int) (Math.random() * 2));
                    if (probabilidad == 1) {
                        numero[i] = 1;
                    } else {
                        numero[i] = 0;
                    }
                }
            }
        }
//        FIN GENERAR NÚMEROS ALEATORIOS
//MUESTRA POR PANTALLA EL CONTENIDO DEL ARRAY
        for (int i = 0; i < 100; i++) {
            if (i == 49) {
                System.out.println("");
            } else {
                System.out.print(" " + numero[i]);
            }
        }
        System.out.println("");

//        FIN MOSTRAR CONTENIDO
        System.out.print("¿Quieres destacar el valor máximo (0) o el mínimo (1) ? ");
        pregunta = s.nextInt();

        for (int i = 0; i < 100; i++) {
            if (numero[i] > numeroMax) {
                numeroMax = numero[i];
            }
        }

        numeroMin = numeroMax;

        for (int i = 0; i < 100; i++) {
            if (numero[i] < numeroMin) {
                numeroMin = numero[i];
            }
        }

        if (pregunta == 0) {
            for (int i = 0; i < 100; i++) {
                if (numero[i] == numeroMax) {
                    System.out.print(" "+rojo + numero[i] + blanco);
                }
                if (i == 49) {
                    System.out.println("");
                } else {
                    System.out.print(" " + numero[i]);
                }
            }
            System.out.println("");
        }

        if (pregunta == 1) {
            for (int i = 0; i < 100; i++) {
                if (numero[i] == numeroMin) {
                    System.out.print(" "+rojo + numero[i] + blanco);
                } else {
                    if (i == 49) {
                        System.out.println("");
                    } else {
                        System.out.print(" " + numero[i]);
                    }
                }

            }
            System.out.println("");
        }

        System.out.println(numeroMax);
        System.out.println(numeroMin);
    }
}
