/*
 * PruebaExamen01.java
 * 
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros
 * positivos introducidos por teclado. 
 * 
 * El programa terminará cuando el usuario introduzca un número primo. 
 * Este último número no se tendrá en cuenta en los cálculos. 
 * 
 * El programa debe indicar también cuántos números ha introducido 
 * el usuario (sin contar el primo que sirve para salir).
 * 
 * 
 */


public class PruebaExamen01 {
 
 public static void main (String args[]) {
        int numMaximo = 0;
        int numMinimo = Integer.MAX_VALUE;
        //~ int aux2 = 0;
        int media = 0;
        int contador = 0;
        boolean esPrimo;
        boolean salir=false;
        do {
            System.out.print("Introduce un número: ");
            int numero = Integer.parseInt(System.console().readLine());
            esPrimo = true;
            for (int i = 2; i < numero; i++) {
                if ((numero % i) == 0) {
                    esPrimo = false; 
                }
              
            }
            
            if(esPrimo) { 
              salir=true;
            }
            if (!esPrimo) {
                if (numero > numMaximo) {
                    numMaximo = numero;
                }

                if (numero < numMinimo) {
                    numMinimo = numero;
                }
                if (numero > 0) {
                    media += numero;
                }
                contador++;
                esPrimo=true;
            }
        } while (!salir);
        

        System.out.println("Numero máximo = " + numMaximo);
        System.out.println("Numero mínimo = " + numMinimo);
        System.out.println("Media= "+( media / contador));
 }
}
//~ int aux1 = 0;
   //~ int aux2 = 0;
   //~ int aux3 = 0;
   //~ int numero = 1;
   //~ int contador = 0;
   //~ boolean esPrimo = true;
   //~ boolean noPrimo = true;
   //~ do {
   //~ System.out.print("Introduce un número entero positivo: ");
   //~ numero = Integer.parseInt(System.console().readLine());
   //~ aux2 = numero;
   //~ if (numero > aux1){
     //~ aux1 = numero;
    //~ }
    
    //~ if (numero < aux2){
      //~ aux2 = numero;
    //~ } 
    //~ if (numero >0){
    //~ aux3 += numero;
    //~ }
    //~ contador++;
    //~ } while (numero >=0);
        //~ System.out.println("Numero máximo = "+aux1);
        //~ System.out.println("Numero mínimo = "+aux2);
        //~ System.out.println("Media= "+( aux3 / contador));











