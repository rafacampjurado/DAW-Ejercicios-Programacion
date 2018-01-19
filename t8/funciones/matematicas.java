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
  public static long voltea(long numero) {
    long volteado = 0;
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
   * @param digitos contiene el valor con la cantidad de dígitos de dicho número
   * @return valor numérico.
   */
  public static int digitos(long numero) {
    int digitos = 0;
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
  public static long digitoN(long numero, int posicion) {
    long num = 0;
    long volteado = 0;
    int contador = 0;
    long digito = 0;
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

  /**
   * Localiza el número indicado dentro de un número entero.
   *
   *
   */
  public static long posicionDeDigito(long numero, int digito) {
    long volteado = voltea(numero);
    int posicion = -1;
    long valorDigito = 0;
    numero = 0;
    while (volteado > 0) {
      valorDigito = volteado % 10;
      posicion++;
      if (valorDigito == digito) {
        volteado = 0;
      }
      numero = (numero * 10) + (volteado % 10);
      volteado = volteado / 10;
    }
    return posicion;
  }

  /**
   * Elimina numeros por detrás
   *
   * @param numero contiene el número entero
   * @param digitos indica de cuántos dígitos se desean eliminar del número
   * @return devuelve el número sin la cantidad de dígitos que se indicaba
   */
  public static long quitaPorDetras(long numero, long digitos) {
    int contador = 1;
    long volteado = 0;
    volteado = voltea(numero);
    numero = 0;

    while (volteado > 0) {
      if (contador <= digitos) {
        contador++;
      } else {
        numero = (numero * 10) + (volteado % 10);
      }

      volteado = volteado / 10;
    }
    voltea(numero);
    return numero;

  }

  /**
   * Elimina los dígitos por delante
   *
   * @param numero contiene el valor numérico con el que se desea operar.
   * @param digitos indica la cantidad de dígitos que se desean eliminar del
   * número original.
   * @return devuelve el valor numérico modificado-
   */
  public static long quitaPorDelante(long numero, int digitos) {
    int contador = 1;
    long volteado = voltea(numero);
    numero = 0;
    while (volteado > 0) {
      if (contador <= digitos) {
        contador++;
      } else {
        numero = (numero * 10) + (volteado % 10);
      }
      volteado = volteado / 10;
    }
    return numero;

  }

  /**
   * Devuelve el valor con la potencia indicada
   *
   * @param base número base con el que calcular la potencia
   * @param exponente número exponente con el que calcular la potencia de la
   * base.
   * @return devuelve la potencia del número base por el exponente.
   */
  public static int potencia(int base, int exponente) {
    int formula = 0;
    for (int contador = 1; contador <= exponente; contador++) {
      formula = base * contador;

    }
    return formula;
  }

  /**
   * Añade un número al número original por detrás.
   *
   * @param numero númer original
   * @param numeroAñadido número a añadir.
   * @return devuelve el número con el número ya añadido.
   */
  public static long pegaPorDetras(long numero, long numeroAñadido) {
    long volteado = 0;
    int contador = 0;
    while (numero > 0) {
      if (contador == 0) {
        volteado = (volteado * 10) + numeroAñadido;
        contador++;
      }
      volteado = (volteado * 10) + (numero % 10);
      numero = numero / 10;
    }
    volteado = voltea(volteado);
    return volteado;
  }

  /**
   * Añade un número a la cifra original por delante.
   *
   * @param numero contiene el valor numérico inicial
   * @param numeroAñadido contiene el valor numérico que se desea añadir.
   * @return devuelve el valor final con el número modificado
   */
  public static long pegaPorDelante(long numero, long numeroAñadido) {
    long volteado = 0;
    int contador = 0;
    numero = voltea(numero);
    while (numero > 0) {
      if (contador == 0) {
        volteado = (volteado * 10) + numeroAñadido;
        contador++;
      }
      volteado = (volteado * 10) + (numero % 10);
      numero = numero / 10;
    }
    return volteado;
  }

  /**
   * Corta un número en dos partes a partir de la posición que se indica.
   *
   */
  public static long trozoDeNumero(long x, int inicio, int fin) {
    long longitud = digitos(x);
//    longitud = longitud - fin;
//    longitud = longitud - 1;
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    
    return x;
  }
  
  /**
   * Junta dos números 
   * 
   */
  public static long juntaNumeros(long numeroUno, long numeroDos) {
    int digitosNumeroUno = 0;
    long numeroFinal = 0;
    digitosNumeroUno = digitos(numeroUno);
    for (int i = 0; i < digitosNumeroUno; i++) {
      numeroUno = numeroUno * 10;
    }
    numeroFinal = numeroUno + numeroDos;
    return numeroFinal;
  }
}
