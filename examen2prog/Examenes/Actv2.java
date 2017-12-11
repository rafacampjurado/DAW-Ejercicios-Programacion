//Realiza un programa que pinte por pantalla un plano inclinado construido con ladrillos (carácter #) y que tiene la
//caída de izquierda a derecha. Sobre este plano inclinado rueda una bolita (la letra O). El dibujo será como una
//fotografía de la bolita rodando. La bolita se colocará de forma aleatoria sobre una de las posibles posiciones que
//puede ocupar en el plano inclinado desde lo alto hasta tocar el suelo. La altura del plano inclinado será indicada
//por el usuario y deberá ser mayor o igual a 3.
//@Author Rafael Campos Jurado
package Examen;

import java.util.Scanner;

public class Actv2 {

    public static void main(String[] args) {
        int ladrillos = 1;
        int bolita = 0;
        int alto = 0;
        int probabilidad = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la altura de la escalera (mínimo 3) : ");
        alto = s.nextInt();
        bolita = ((int) (Math.random() * alto) + 1);
        System.out.println("Valor de bolita = " + bolita);

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ladrillos; j++) {
                System.out.print("# ");
            }
            if (ladrillos == bolita) {
                System.out.print("O");
                 System.out.println(" ");
                 ladrillos++;
            } else {
                System.out.println(" ");
                ladrillos++;
            }

        }

    }
}
