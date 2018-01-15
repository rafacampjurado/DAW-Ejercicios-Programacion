/**
 * Funciones matemáticas
 *
 * @author Rafael Campos Jurado
 */
package funciones;

public class matematicas {

    /**
     * Voltea el número indicado.
     *
     * @param numero valor que almacena el número original
     * @return numero volteado
     */
    public static int voltea(int numero) {
        int volteado = 0;
        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero = numero / 10;
        }
        return volteado;
    }

    /**
     * Comprueba si el número es capicua (es el mismo número a pesar de invertir
     * el orden).
     *
     * @param numero valor que almacena el número original
     * @return valor booleano sobre el número
     */
    public static boolean esCapicua(int numero) {
        if (numero == voltea(numero)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Comprueba si el número es primo
     *
     * @param numero contiene el valor del número que se desea comprobar.
     * @return valor booleano sobre si el número es primo o no.
     */
    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if ((numero % i) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Comprueba la cantidad de dígitos que tiene un número
     *
     * @param numero contiene el valor del número que se desea comprobar
     * @param digitos contiene el valor con la cantidad de dígitos de dicho
     * número
     * @return valor numérico.
     */
    public static int digitos(int numero, int digitos) {
        for (int contador = 1; numero > 0; contador++) {
            numero = numero / 10;
            digitos = contador;
        }
        return digitos;
    }

    /**
     * Devuelve el dígito de la posición indicada.
     *
     * @param numero contiene el número inicial.
     * @param posicion contiene la posición del dígito
     * @return valor numérico en esa posición
     */
    public static int digitoN(int numero, int posicion) {
        int num = 0;
        int volteado = 0;
        int contador = 0;
        int digito = 0;
        num = voltea(numero);

        while (contador <= posicion) {
            digito = num % 10;
            volteado = (volteado * 10) + (num % 10);
            num = num / 10;
            contador++;
        }
        return digito;
    }

    /**
     * Devuelve el siguiente número primo
     */
    public static int siguientePrimo(int numero) {
        boolean primo = false;
        
        while (!primo) {
                  for (int i = 2; i < numero; i++) {
            if ((numero % i) == 0) {
                primo = false;
                numero++;
            } else {
                primo = true;
            }
        }  
        }
        return numero;


    }
}
