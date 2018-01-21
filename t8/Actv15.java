/*
Muestra los números primos que hay entre 1 y 1000.
@Author Rafael Campos Jurado
 */
package funciones;

import funciones.matematicas;

public class Actv15 {

    public static void main(String[] args) {
        int salto = 0;
        for (int i = 0; i < 1000; i++) {
            if(matematicas.esPrimo(i)) {
                System.out.print(i+" ");
                salto++;
            }
            if(salto == 20) {
                System.out.println("");
                salto = 0;
            }
        }
        System.out.println(" ");
    }
}
