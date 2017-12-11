//Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras
//correspondientes a nombres de fruta se deben almacenar al final (sin importar el orden) y las que no son
//nombres de fruta al principio. Puedes utilizar tantos arrays auxiliares como quieras. Las frutas que conoce
//el programa deben estar en otro array y son las siguientes: manzana, mandarina, mango, chirimoya y
//nectarina.
//@Author Rafael Campos Jurado
package Examen;

import java.util.Scanner;

public class Actv1 {

    public static void main(String[] args) {
        String palabras[] = new String[8];
        String ordenado[] = new String[8];
        Scanner s = new Scanner(System.in);
        int espacios = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce una palabra (" + (i + 1) + " de 8) : ");
            palabras[i] = s.nextLine();
        }
        System.out.print("Array palabras: ");
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            System.out.print(palabras[i] + " ");
        }

        for (int i = 0; i < 8; i++) {
            if ((palabras[i].equals("manzana")) || (palabras[i].equals("mandarina")) || (palabras[i].equals("mango"))
                    || (palabras[i].equals("chirimoya")) || (palabras[i].equals("nectarina"))) {
            } else {
                ordenado[espacios] = palabras[i];
                espacios++;
            }
        }
                for (int i = 0; i < 8; i++) {
            if ((palabras[i].equals("manzana")) || (palabras[i].equals("mandarina")) || (palabras[i].equals("mango"))
                    || (palabras[i].equals("chirimoya")) || (palabras[i].equals("nectarina"))) {
                ordenado [espacios] = palabras [i];
                espacios++;
            } else {
            }
        }
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            System.out.print(ordenado[i] + " ");
        }
    }
}
