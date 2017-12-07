//Escribe un programa que muestre por pantalla un array de 10 números enteros
//generados al azar entre 0 y 100. A continuación, el programa debe pedir
//un número al usuario. Se debe comprobar que el número introducido por
//teclado se encuentra dentro del array, en caso contrario se mostrará un
//mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
//introduzca uno correctamente. A continuación, el programa rotará el array
//hacia la derecha las veces que haga falta hasta que el número introducido
//quede situado en la posición 0 del array. Por último, se mostrará el array rotado
//por pantalla.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;

public class Actv17 {

    public static void main(String[] args) {
        int numero[] = new int[10];
        int preguntaNumero = 0;
        Scanner s = new Scanner(System.in);
        boolean salirBucle = true;
        int numeroOrdenado[] = new int[10];

        for (int i = 0; i < 10; i++) {
            numero[i] = (int) (Math.random() * 101);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(numero[i] + " ");
        }
//INICIO BUCLE WHILE 
        while (salirBucle) {
            System.out.print("Introduce un número : ");
            preguntaNumero = s.nextInt();

            for (int i = 0; i < 10; i++) {
                if (numero[i] == preguntaNumero) {
                    salirBucle = false;
                } else {
                }
            }
            if (salirBucle) {
                System.out.println("¡El número no  está dentro del Array!");
            }
        }
//FIN BUCLE WHILE
        System.out.println("¡El número está dentro del Array!");
        int posicionOrdenado = 0;
//METE EL NÚMERO ELEGIDO EN LA PRIMERA POSICIÓN
        if (posicionOrdenado < 10) {
            for (int i = 0; i < 10; i++) {
                if (numero[i] == preguntaNumero) {
                    numeroOrdenado[posicionOrdenado] = numero[i];
                    posicionOrdenado++;
                } else {

                }
            }
//FIN
////METE LOS NÚMEROS RESTANTES EN EL NUEVO ARRAY
            if (posicionOrdenado < 10) {
                for (int i = 0; i < 10; i++) {
                    if (numero[i] == preguntaNumero) {
                    } else {
                        numeroOrdenado[posicionOrdenado] = numero[i];
                        posicionOrdenado++;
                    }
                }
            }
        }
//FIN 
        for (int i = 0; i < 10; i++) {
            System.out.print(numeroOrdenado[i] + " ");
        }
    }
}
