/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Rafa
 */
import funciones.matematicas;

public class prueba {

    public static void main(String[] args) {
//        int numeroIntroducido = 0;
//        int numero = 0;
//        int posicion = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Introduce un número : ");
//        numeroIntroducido = s.nextInt();
//        numero = numeroIntroducido;
//        System.out.print("Introduce la posición del dígito : ");
//        posicion = s.nextInt();
//        int volteado = 0;
//        int contadorPosicion = 0;
//        int digito = 0;
//
//        while (numero > 0) {
//            volteado = (volteado * 10) + (numero % 10);
//            numero = numero / 10;
//        }
//
//        while (volteado > 0) {
//            digito = volteado % 10;
//            if (contadorPosicion == posicion) {
//                System.out.print("El dígito es : " + digito);
//                volteado = 0;
//            } else {
//                contadorPosicion++;
//                numero = (numero * 10) + (volteado % 10);
//                volteado = volteado / 10;
//
//            }
//        }
System.out.println(matematicas.siguientePrimo(3));
    }
}
