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
    public static int minimoArrayInt(int x [ ]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x [i] < min) {
                min = x [i];
            }
        }
        return min;
    }

    public static int maximoArrayInt(int x [ ]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length;i++){
            if ( x [i] > max) {
                max = x [i];
            }
        }
        return max;
    }
}
