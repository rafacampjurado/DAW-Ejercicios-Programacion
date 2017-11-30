//Escribe un programa que pida 10 números por teclado y que luego muestre
//los números introducidos junto con las palabras “máximo” y “mínimo” al lado
//del máximo y del mínimo respectivamente.
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;

public class Actv5 {

    public static void main(String[] args) {
        int[] numero = new int[10];
        Scanner s = new Scanner(System.in);
        int aux1 = 0;
        int aux2 = 1;

//    INICIO PEDIR DATOS
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce 10 números: ");
            numero[i] = s.nextInt();
        }
//    FIN PEDIR DATOS

        for (int i = 0; i < 10; i++) {
//            System.out.print(numero[i]+ " ");
            if (numero[i] > aux1) {
                aux1 = numero[i];
            }
            if (numero [i] <= aux2) {
                aux2 = numero [i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if (numero[i] == aux1) {
                System.out.print("MAX");
            } else{
                
            }
            if (numero [i] == aux2) {
                System.out.print("MIN");
            }else {
                
            }
            System.out.println(" "+numero[i]);
        }
//        System.out.println("");
//        System.out.println("MAX "+ aux1);
//        System.out.println("MIN "+ aux2);
    }
}
