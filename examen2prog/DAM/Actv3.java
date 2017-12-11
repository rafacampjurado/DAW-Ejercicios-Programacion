/*Escribe un programa que rellene un array de 15 elementos con números enteros comprendidos entre
0 y 500 (ambos incluidos). A continuación, se mostrará el array “cincuerizado”, según el siguiente
criterio: si el número que hay en una posición del array es múltiplo de 5, se deja igual, y si no, se
cambia por el siguiente múltiplo de 5 que exista a partir de él. Utiliza dos arrays, uno para contener los
números originales y otro para guardar el resultado.

@Author Rafael Campos Jurado
 */
package DAM_Examen;

import java.util.Scanner;

public class Actv3 {

    public static void main(String[] args) {
        int numeros[] = new int[15];
        int probabilidad = 0;

        for (int i = 0; i < 15; i++) {
            numeros[i] = ((int) (Math.random() * 500) + 1);
            if (numeros[i] == 1) {
                probabilidad = (int) (Math.random() * 2);
                if (probabilidad == 1) {
                    numeros[i] = 1;
                } else {
                    numeros[i] = 0;
                }
            }
        }
        for (int i = 0; i < 15; i++) {
                while (numeros[i] % 5 != 0 ) {
                    numeros [i] += 1;
                }
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("números = "+ numeros[i]);
        }
        
    }
}
