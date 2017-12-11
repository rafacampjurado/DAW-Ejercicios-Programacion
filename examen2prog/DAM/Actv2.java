/*Realiza un programa que muestre la previsión del tiempo para mañana en Málaga. Las temperaturas
máxima y mínima se deben generar de forma aleatoria entre los intervalos máximos y mínimos
absolutos medidos en las últimas décadas para cada estación. La probabilidad de que esté soleado o
nublado en cada estación se proporciona a continuación. Obviamente, la temperatura mínima deberá
ser menor o igual que la temperatura máxima.

@Author Rafael Campos Jurado
 */
package DAM_Examen;

import java.util.Scanner;

public class Actv2 {

    public static void main(String[] args) {
        String mes[] = new String[4];
        mes[0] = "Primavera";
        mes[1] = "Verano";
        mes[2] = "Otoño";
        mes[3] = "Invierno";
        Scanner s = new Scanner(System.in);
        int preguntaEstacion = 0;
        int temperaturaMaxima = 0;
        int temperaturaMinima = 0;
        int numNublado = 0;
        boolean resultadoNublado = false;
//    boolean nublado = true;

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + ". " + mes[i] + " ");
        }
        System.out.print("Seleccione la estación del año (1-4) : ");
        preguntaEstacion = s.nextInt();
        preguntaEstacion -= 1;

        if (preguntaEstacion == 0) {
            do {
                temperaturaMaxima = ((int) (Math.random() * 15) + 15);
                temperaturaMinima = ((int) (Math.random() * 15) + 15);
            } while (temperaturaMaxima < temperaturaMinima);

            numNublado = ((int) (Math.random() * 10) + 1);
            if (numNublado >= 5) {
                resultadoNublado = false;
            } else {
                resultadoNublado = true;
            }
        }

        if (preguntaEstacion == 1) {
            do {
                temperaturaMaxima = ((int) (Math.random() * 20) + 25);
                temperaturaMinima = ((int) (Math.random() * 20) + 25);
            } while (temperaturaMaxima < temperaturaMinima);

            numNublado = ((int) (Math.random() * 10) + 1);
            if (numNublado >= 3) {
                resultadoNublado = false;
            } else {
                resultadoNublado = true;
            }
        }

        if (preguntaEstacion == 2) {
            do {
                temperaturaMaxima = ((int) (Math.random() * 10) + 20);
                temperaturaMinima = ((int) (Math.random() * 10) + 20);
            } while (temperaturaMaxima < temperaturaMinima);

            numNublado = ((int) (Math.random() * 10) + 1);
            if (numNublado >= 5) {
                resultadoNublado = true;
            } else {
                resultadoNublado = false;
            }
        }
        
                if (preguntaEstacion == 3) {
            do {
                temperaturaMaxima = ((int) (Math.random() * 25)+1);
                temperaturaMinima = ((int) (Math.random() * 25)+1);
            } while (temperaturaMaxima < temperaturaMinima);

            numNublado = ((int) (Math.random() * 10) + 1);
            if (numNublado >= 9) {
                resultadoNublado = false;
            } else {
                resultadoNublado = true;
            }
        }
        System.out.println("Temperaturas máxima = " + temperaturaMaxima +"ºC");
        System.out.println("Temperaturas mínimas = " + temperaturaMinima +"ºC");
        if (resultadoNublado) {
            System.out.println("nublado");
        }

    }
}