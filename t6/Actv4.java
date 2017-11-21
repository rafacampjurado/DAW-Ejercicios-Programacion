//Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
//por espacios.
//
// @author Rafael Campos Jurado
// 
package actividades;


public class Actv4 {

    public static void main(String[] args) {
      int esUno = 0;
      int valor = 0;
      
      for (int i = 0; i <= 20; i++) {
        valor = ((int)(Math.random()* 10)+1);
        
        if (valor == 1) {
          for (int y = 0; y < 1; y++) {
            esUno = ((int)(Math.random()* 2));
              if (esUno == 1) {
                valor = 1;
              } else {
                valor = 0;
              }
           }
         }
      System.out.print(" "+valor);
      }
        
//       System.out.println(" "+valor);
      
    
    }
}