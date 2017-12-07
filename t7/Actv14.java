//Escribe un programa que pida 8 palabras y las almacene en un array. A
//continuación, las palabras correspondientes a colores se deben almacenar al
//comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
//auxiliares como quieras. Los colores que conoce el programa deben estar en
//otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
//blanco y morado.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;

public class Actv14 {

    public static void main(String[] args) {
        String palabras[] = new String[8];
        String colores[] = new String[8];
        Scanner s = new Scanner(System.in);
        int posicionesColores = 0;

//METE DATOS EN EL ARRAY
        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce una palabra (" + (i + 1) + " de 8) : ");
            palabras[i] = s.nextLine();
        }
// FIN METER DATOS EN EL ARRAY
//COMPRUEBA SI EL DATO ES UNO DE LOS COLORES Y LOS METE EN EL ARRAY "COLORES"
        for (int i = 0; i < 8; i++) {
            if (palabras[i].equals("verde") || (palabras[i].equals("rojo") || (palabras[i].equals("azul")
                    || (palabras[i].equals("amarillo") || (palabras[i].equals("naranja") || (palabras[i].equals("rosa")
                    || (palabras[i].equals("negro") || (palabras[i].equals("blanco") || (palabras[i].equals("morado")))))))))) {
                colores[posicionesColores] = palabras[i];
                posicionesColores++;
            } else {

            }
        }
//  FIN COMPROBAR DATOS
// VUELVE A COMPROBAR SI LOS DATOS DEL ARRAY SON COLORES Y SI NO LO SON LOS COLOCA EN LAS 
// POSICIONES SOBRANTES EN EL ARRAY "COLORES"
        for (int i = 0; i < 8; i++) {
            if (posicionesColores < 8) {
                if (palabras[i].equals("verde") || (palabras[i].equals("rojo") || (palabras[i].equals("azul")
                        || (palabras[i].equals("amarillo") || (palabras[i].equals("naranja") || (palabras[i].equals("rosa")
                        || (palabras[i].equals("negro") || (palabras[i].equals("blanco") || (palabras[i].equals("morado")))))))))) {

                } else {
                    colores[posicionesColores] = palabras[i];
                    posicionesColores++;
                }
            }
        }
//TERMINA DE METER DATOS EN EL ARRAY
//MUESTRA POR PANTALLA EL CONTENIDO
        for (int i = 0; i < 8; i++) {
            System.out.print(" " + colores[i]);

        }
    }
}
