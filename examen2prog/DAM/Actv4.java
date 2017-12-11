//El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los Reyes Magos le han
//traído un caballito de mar ($) y una caracola (@) para que le hagan compañía al pez. Realiza un
//programa que pinte por pantalla la pecera con los tres animalitos acuáticos colocados dentro en
//posiciones aleatorias. Por una cuestión de física elemental, ninguno de los animales puede
//coincidir en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera, que como
//mínimo serán de 4 unidades.
//@Author Rafael Campos Jurado
package DAM_Examen;

import java.util.Scanner;

public class Actv4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int alto = 0;
        int ancho = 0;
        int contadorEspacios = 0;

        System.out.print("introduce el ancho de la pecera (mínimo 4): ");
        ancho = s.nextInt();
        System.out.print("introduce el alto de la pecera (mínimo 4): ");
        alto = s.nextInt();
        int numEspacios = (ancho - 2) * 2;
        int posicionPezUno = 0;
        int posicionPezDos = 0;
        int posicionPezTres = 0;
        while (((posicionPezUno == posicionPezDos) && (posicionPezDos == posicionPezTres) && (posicionPezTres == posicionPezUno))) {
            posicionPezUno = ((int) (Math.random() * (alto - 2) * (ancho - 2)));
            posicionPezDos = ((int) (Math.random() * (alto - 2) * (ancho - 2)));
            posicionPezTres = ((int) (Math.random() * (alto - 2) * (ancho - 2)));
        }

        int posicion = 0;
        boolean pez = true;
        System.out.println(numEspacios);
        System.out.println(posicionPezUno);
        System.out.println(posicionPezDos);
        System.out.println(posicionPezTres);

        // Línea superior ////////////////////////////////////////////////////////
        for (int i = 1; i <= ancho; i++) {
            System.out.print("* ");
        }

        // Parte intermedia //////////////////////////////////////////////////////
        for (int i = 2; i < alto; i++) {
            System.out.print("\n* ");
            for (int espacios = 2; espacios < ancho; espacios++) {
                if (posicion == posicionPezUno) {
                    System.out.print("&");
//                pez = false;
                } else {
                    System.out.print("  ");

                }
                if (posicion == posicionPezDos) {
                    System.out.print("$");
//                pez = false;
                } else {
                    System.out.print("  ");

                }
                if (posicion == posicionPezTres) {
                    System.out.print("@>");
//                pez = false;
                } else {
                    System.out.print("  ");

                }

                posicion++;
            }
            System.out.print("* ");
        }
        System.out.println();

        // Línea inferior ////////////////////////////////////////////////////////
        for (int i = 1; i <= ancho; i++) {
            System.out.print("* ");
        }
        System.out.print("\n" + contadorEspacios);
    }
}
