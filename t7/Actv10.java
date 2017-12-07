//Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
//y que los almacene en un array. El programa debe ser capaz de pasar todos
//los números pares a las primeras posiciones del array (del 0 en adelante) y
//todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
//es necesario.
//@author Rafael Campos Jurado
package array;

public class Actv10 {

    public static void main(String[] args) {
        int numero[] = new int[20];
        int probabilidad = 0;
        int orden[] = new int[20];
        int posiciones = 0;
        int contador = 0;
//GENERA LOS NÚMEROS ALEATORIOS
        for (int i = 0; i < 20; i++) {
            numero[i] = ((int) (Math.random() * 10) + 1);
            if (numero[i] == 1) {
                for (int y = 0; y < 1; y++) {
                    probabilidad = ((int) (Math.random() * 2));
                    if (probabilidad == 1) {
                        numero[i] = 1;
                    } else {
                        numero[i] = 0;
                    }
                }
            }
            System.out.print(numero[i] + " ");
        }
        System.out.println();
//FIN GENERAR LOS NÚMEROS ALEATORIOS
//INICIO - METE LOS  PARES EN LAS PRIMERAS POSICIONES
        for (int i = 0; i < 20; i++) {
            if (numero[i] % 2 == 0) {
                orden[posiciones] = numero[i];
                posiciones++;
            } else {
                contador++;
            }
        }
        posiciones = 20 - contador;
//FIN - METER LOS PARES EN LAS PRIMERAS POSICIONES
//INICIO - METER LOS IMPARES EN LAS ÚLTIMAS POSICIONES
        for (int i = 0; i < 20; i++) {
            if (posiciones < 20) {
                if (numero[i] % 2 == 1) {
                    orden[posiciones] = numero[i];
                    posiciones++;
                }
            }
        }
//FIN - METER LOS IMPARES EN LAS ÚLTIMAS POSICIONES
//MUESTRA EL RESULTADO
        for (int i = 0; i < 20; i++) {
            System.out.print(orden[i] + " ");
        }

    }
}
