//Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
//separados por espacios. Muestra también el máximo, el mínimo y la media
//de esos números.
// @author Rafael Campos Jurado
// 
package actividades;


public class Actv5 {

    public static void main(String[] args) {
      int valor = 0;
      int posibilidad = 0;
      int suma = 0;
      int min = 199;
      int max = 0;
//      int esMax = 0;
//      Bucle para mostrar los números
      for (int i = 0; i < 50; i++) {
        valor = ((int)((Math.random()*100)+100));
//        Comprueba si el número es 101
         if (valor == 101) {
//           Posibilidadades de ser 100 o 101
          for (int y = 0; y < 1; y++) {
            posibilidad = ((int)(Math.random()* 2));
              if (posibilidad == 1) {
                valor = 100;
              } else {
                valor = 101;
              }
           }
         }
          if (valor == 198) {
//           Posibilidadades de ser 198 o 199
          for (int y = 0; y < 1; y++) {
            posibilidad = ((int)(Math.random()* 2));
              if (posibilidad == 1) {
                valor = 199;
              } else {
                valor = 198;
              }
           }
         }
          suma += valor;
          if (valor < min) {
            min = valor;
          }
          if (valor > max) {
            max = valor;
          }
       System.out.println(valor);
      }
       System.out.println("La media  de todos los números = "+ (suma / 50 ));
       System.out.println("El número máximo es  = "+ max);
       System.out.println("El número mínimo es = "+ min);
       
    }
}