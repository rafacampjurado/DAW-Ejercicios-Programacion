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

public class ejecucionFunciones {

    public static void main(String[] args) {
        int[] prueba = funcionesArray.generaArrayInt(10, 1, 3);
        int digito = prueba.length;


        for (int i = 0; i < prueba.length; i++) {
            System.out.print(prueba[i] + " ");
        }

        System.out.println("");
        System.out.println("MIN " + funcionesArray.minimoArrayInt(prueba));
        System.out.println("MAX " + funcionesArray.maximoArrayInt(prueba));
        System.out.println("MEDIA " + funcionesArray.mediaArrayInt(prueba));
        System.out.println("¿Numero en el array? " + funcionesArray.estaEnArrayInt(prueba, 1));
        System.out.println("¿Posición del número  en el array? " + funcionesArray.posicionEnArray(prueba, 1));
        funcionesArray.muestraArray(prueba);
        System.out.println("");
        
        funcionesArray.muestraArray((funcionesArray.volteaArrayInt(prueba)));
        System.out.println("");
        System.out.print("---------------------------------");
        System.out.println("");
        System.out.println("tamaño array = "+ digito);

    }
}
