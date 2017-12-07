//Un restaurante nos ha encargado una aplicación para colocar a los clientes en
//sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
//(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
//el programa no está preparado para colocar a grupos mayores a 4, por tanto,
//si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
//mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
//personas como máximo e intente de nuevo”. Para el grupo que llega,
//se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
//libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
//grupo es de dos personas, se podrá colocar donde haya una o dos personas.
//Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
//vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
//Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
//funcionamiento del programa se ilustra a continuación:
//@author Rafael Campos Jurado
package array;

import java.util.Scanner;

public class Actv15 {

    public static void main(String[] args) {
        int sitios[] = new int[10];
        Scanner s = new Scanner(System.in);
        int preguntaOcupantes = 0;
        int probabilidad = 0;
        boolean asiento = true;
        boolean todosOcupados = false;
//        int contadorOcupados = 0;

        for (int i = 0; i < 10; i++) {
            sitios[i] = ((int) (Math.random() * 4) + 1);
            if (sitios[i] == 1) {
                for (int y = 0; y < 1; y++) {
                    probabilidad = ((int) (Math.random() * 2));
                    if (probabilidad == 1) {
                        sitios[i] = 1;
                    } else {
                        sitios[i] = 0;
                    }
                }
            }
        }
        // MESAS DISPONIBLES
        System.out.print("Mesas :          ");
        for (int i = 0; i < 10; i++) {
            System.out.print(+(i + 1) + " ");
        }
        System.out.println("");
        System.out.print("Ocupantes : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(sitios[i] + " ");
        }
        /////////////////////////////////////////////////
        while (!todosOcupados) {
            int contadorOcupados = 0;

            System.out.println("");
            System.out.print("¿Cuántos sois ? : ");
            preguntaOcupantes = s.nextInt();
            int contadorSitio = 0;

            if (preguntaOcupantes > 4) {
                System.out.println("Lo siento pero no tenemos suficiente sitio para un grupo tan grande");
            } else {
//                COMRPUEBA SI HAY UN 0
                for (int i = 0; i < 10; i++) {
                    if (sitios[i] == 0) {
                        contadorSitio++;
                    }
                }
                ////////////////////////////////
                for (int i = 0; i < 10; i++) {
                    if (asiento) {
                        if (sitios[i] == 0) {
                            sitios[i] = sitios[i] + preguntaOcupantes;
                            asiento = false;
                            System.out.println("Siéntese en la mesa número " + i);
                        } else if ((sitios[i] + preguntaOcupantes) <= 4) {
                            sitios[i] = sitios[i] + preguntaOcupantes;
                            asiento = false;
                            System.out.println("Siéntese en la mesa número " + i);
                        }
                    }
                }
            }

//                for (int i = 0; i < 10; i++) {
//                    if (asiento) {
//                        if ( (sitios[i] + preguntaOcupantes) <= 4) {
//                            sitios[i] = sitios[i] + preguntaOcupantes;
//                            asiento = false;
//                            System.out.println("Siéntese en la mesa número "+ i);
//                        }
//                    }
//                }
            System.out.println("");
            asiento = true;
//                 MESAS DISPONIBLES
            System.out.print("Mesas :          ");
            for (int i = 0; i < 10; i++) {
                System.out.print(+(i + 1) + " ");
            }
            System.out.println("");
            System.out.print("Ocupantes : ");
            for (int i = 0; i < 10; i++) {
                System.out.print(sitios[i] + " ");
            }
            /////////////////////////////////////////////////
            for (int i = 0; i < 10; i++) {
                if (sitios[i] == 4) {
                    contadorOcupados++;
                } else {

                }
                if (contadorOcupados == 10) {
                    todosOcupados = true;
                }
            }

        }

    }
}
