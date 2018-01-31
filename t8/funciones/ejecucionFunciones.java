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
      int [] prueba = new int [40];

        for (int i = 0; i < prueba.length; i++) {
            prueba [i] = (int)(Math.random()*31)+1;
        }
        for (int i = 0; i < prueba.length; i++) {
            System.out.print(prueba [i] + " ");
        }
        System.out.println("");
        System.out.println("MIN "+ funcionesArray.minimoArrayInt(prueba));
        System.out.println("MAX "+ funcionesArray.maximoArrayInt(prueba));
    }
}
