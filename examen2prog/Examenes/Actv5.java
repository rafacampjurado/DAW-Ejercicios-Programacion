//Realiza un programa que pida 10 números enteros por teclado. A continuación el programa nos tiene
//que decir cuál es el número que más se repite y cuántas veces se repite. Si hay varios números
//repetidos las mismas veces, se da por bueno cualquiera de ellos.
//@Author Rafael Campos Jurado
package Examen;

import java.util.Scanner;

public class Actv5 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int numero [] = new int [10];
        int aux = 0;
        int contador = 0;
        int repite = 0;
        int numRepe = 0;
        System.out.println("Introduce un número:  ");
        for (int i = 0; i < 10; i++) {
            System.out.print("("+ (i + 1) +" de 10) : ");
            numero [i] = s.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(numero [i] + " ");
        }
        
        for (int i = 0; i < 10; i++) {
            aux = numero [contador];
            if (numero [i] == aux) {
                repite++;
                numRepe = aux;
            } else {
                contador++;
            }
        }
//        System.out.println("repetidos = "+ repite + " ");
        System.out.println("El número "+ numRepe + " se repite "+ repite + " veces ");
        
    }
}
