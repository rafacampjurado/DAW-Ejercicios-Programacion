/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author Rafa
 */
public class funcionesArray {

    /**
     *
     * @param tamaño
     * @param min
     * @param max
     * @return
     */
    public static int[] generaArrayInt(int tamaño, int min, int max) {
        int[] resultado = new int[tamaño];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = (int) (Math.random() * (max - min)) + min;
        }
        return resultado;
    }

    /**
     *
     * @param x
     * @return
     */
    public static int minimoArrayInt(int x[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;

    }

    /**
     *
     * @param x
     * @return
     */
    public static int maximoArrayInt(int x[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }

    /**
     *
     * @param x
     * @return
     */
    public static int mediaArrayInt(int x[]) {
        long numero = 0;
        int contador = 0;

        for (int i = 0; i < x.length; i++) {
            numero = numero + x[i];
            contador++;
        }
        int media = ((int) numero / contador);
        return media;
    }

    /**
     *
     * @param x
     * @param numero
     * @return
     */
    public static boolean estaEnArrayInt(int x[], int numero) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == numero) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param x
     * @param numero
     * @return
     */
    public static int posicionEnArray(int x[], int numero) {
        int lugarEnArray = 0;

        for (int i = 0; i < x.length; i++) {
            if (lugarEnArray == 0) {
                if (x[i] == numero) {
                    lugarEnArray = i;
                }
            }
        }

        return lugarEnArray;
    }

    /**
     *
     * @param x
     * @return
     */
    public static int[] volteaArrayInt(int x[]) {
        int contador = 0;
       
        int[] volteado = new int[x.length];
         contador = x.length - 1;

        for (int i = 0; i < x.length; i++) {
            volteado[i] = x[contador];
            contador--;
        }
        return volteado;
    }

    /**
     *
     * @param x
     */
    public static void muestraArray(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
    
    public static int [] rotaDerechaArrayInt (int x [], int rotarPosiciones) {
        int [] arrayAux = new int [x.length];
        int posicion = 0;
        
        for (int i = 0; i < x.length; i++) {
            if(i + rotarPosiciones > (x.length - 1)) {
                
            }
            arrayAux [i] = x[i];
        }
        
    }
}
