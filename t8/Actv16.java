/*
Muestra los números capicúa que hay entre 1 y 99999.
@Author Rafael Campos Jurado
 */
package funciones;

import funciones.matematicas;

public class Actv16 {

    public static void main(String[] args) {
        int salto = 0;
        for (int i = 0; i < 100000; i++) {
            if(matematicas.esCapicua(i)) {
                System.out.print(i+" ");
                salto++;
            }
            if(salto == 50) {
                System.out.println("");
                salto = 0;
            }
        }
        System.out.println(" ");
    }
}
