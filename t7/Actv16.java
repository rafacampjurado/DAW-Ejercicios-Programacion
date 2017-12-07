//Escribe un programa que rellene un array de 20 elementos con números enteros
//aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
//el programa mostrará el array y preguntará si el usuario quiere resaltar los
//múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
//array escribiendo los números que se quieren resaltar entre corchetes.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;

public class Actv16 {

    public static void main(String[] args) {
        int numero[] = new int[20];
        String rojo = "\033[31m";
        String blanco = "\033[37m";
        int pregunta = 0;
        Scanner s = new Scanner(System.in);


        for (int i = 0; i < 20; i++) {
            numero[i] = ((int) (Math.random() * 401));
        }
        System.out.print("¿Desea resaltar los múltiplos de 5 (escriba 5) o los múltiplos de 7 (escriba 7) ? : ");
        pregunta = s.nextInt();

        if (pregunta == 5) {
            for (int i = 0; i < 20; i++) {
                if (numero[i] % 5 == 0) {
                    System.out.print(rojo +"["+ numero[i] +"]" + blanco + " ");
                } else {
                    System.out.print(numero[i] + " ");
                }
            }
        }

        if (pregunta == 7) {
            for (int i = 0; i < 20; i++) {
                if (numero[i] % 7 == 0) {
                    System.out.print(rojo +"["+ numero[i] +"]" + blanco + " ");
                } else {
                    System.out.print(numero[i] + " ");
                }
            }
        }

    }
}
