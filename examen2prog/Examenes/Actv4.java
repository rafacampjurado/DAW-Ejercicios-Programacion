//Pinta un árbol de Navidad mediante un programa. El follaje del árbol estará hecho con el carácter ^ y estará
//adornado con estrellas (asterisco) y bolas (letra O). En la cúspide del árbol siempre habrá una estrella y el
//relleno del árbol se pintará de forma aleatoria en función del siguiente patrón: la probabilidad de encontrar un
//adorno sobre el follaje es de 1 sobre 3. En caso de pintar un adorno, la probabilidad de que sea una bola es de
//2/3 y de que sea una estrella es de 1/3. La estrella de la cúspide se cuenta en la altura. Se debe verificar que
//ésta última es mayor o igual que 4.
//@Author Rafael Campos Jurado
package Examen;

import java.util.Scanner;

public class Actv4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int altura = 0;
        int probabilidadAdorno = 0;
        int probabilidadAparecer = 0;
        System.out.print("Introduce la altura del árbol : ");
        altura = s.nextInt();

        int hojas = 1;
        int espacios = altura - 1;

        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();

        do {
            for (int k = 0; k < espacios; k++) {
                System.out.print(" ");
            }

            for (int i = 0; i < hojas; i++) {
                probabilidadAparecer = (int) (Math.random() * 3);
                probabilidadAdorno = (int) (Math.random() * 3);
                switch (probabilidadAparecer) {
                    case 0:
                    case 1:
                        System.out.print("^");
                        break;
                    case 2:

                        switch (probabilidadAdorno) {
                            case 0:
                            case 1:
                                System.out.print("O");
                                break;
                            case 2:
                                System.out.print("*");
                        }
                        break;
                }

            }
            System.out.println();
            espacios--;
            hojas += 2;
            probabilidadAdorno = 0;
            probabilidadAparecer = 0;
        } while (espacios >= 1);

    }
}
