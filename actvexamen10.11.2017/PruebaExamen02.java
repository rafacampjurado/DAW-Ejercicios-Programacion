/*
 * PruebaExamen02.java
 * 
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos
 * ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio base de una
 * bandera es de un céntimo de euro el centímetro cuadrado. Si la queremos con un escudo bordado, el
 * precio se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío son 3.25 €. El
 * IVA ya está incluido en todas las tarifas.
 * Ejemplo:
 * Introduzca la altura de la bandera en cm: 20
 * Ahora introduzca la anchura: 35
 * ¿Quiere escudo bordado? (s/n): n
 * 
 * Gracias. Aquí tiene el desglose de su compra.
 * Bandera de 700 cm2:  7.00 €
 * Sin escudo:          0.00 €
 * Gastos de envío:     3.25 €
 * Total:               10.25 €
 * 
 * 
 */


public class PruebaExamen02 {
 
 public static void main (String args[]) {
   System.out.print("Introduce el alto de la bandera en cm = ");
   int altoBandera = Integer.parseInt(System.console().readLine());
   System.out.print("Introduce el ancho de la bandera en cm = ");
   int anchoBandera = Integer.parseInt(System.console().readLine());
   
   int multi = altoBandera * anchoBandera;
   
   double precioMulti = multi * 0.01;
   
   
   double total;
   double precioBordado = 0;
   double gastosEnvio = 3.25;
   
   System.out.print("¿Desea bordado? ");
   String preguntaBordado = System.console().readLine().toLowerCase();
   if (preguntaBordado.equals("si")) {
     precioBordado = 2.50;
   } else {
     precioBordado = 0.00;
   }
   total = gastosEnvio + precioMulti + precioBordado;
   System.out.println("Bandera de "+ multi +"cm : "+precioMulti);
   if (precioBordado >0){
     System.out.println("bordado = "+precioBordado);
    }
   System.out.println("gastos de envio = "+gastosEnvio);
   System.out.println("total  = "+total);
   
  }
}
   
   
