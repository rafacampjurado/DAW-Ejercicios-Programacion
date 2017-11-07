/*
 * Actv26.java
 * 
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * 
 * @author Rafael Campos Jurado
 */


public class Actv26 {
public static void main (String args[]) {
  System.out.print("Introduce un número: ");
  int numeroIntroducido = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduce un dígito que componga el número anterior: ");
  int digitoIntroducido = Integer.parseInt(System.console().readLine());
  int volteado = 0;
  int suma = 0;
  
  int contadorPosiciones = 0;
  
  //~ if (volteado == digitoIntroducido){
    //~ System.out.print("El número ocupa la posición "+contadorPosiciones);
  //~ } else {  
  //~ while (volteado > 0){
    //~ contadorPosiciones++;
    //~ volteado = numeroIntroducido % 10;
    //~ suma = (volteado * 10) + volteado;
    //~ }
  //~ }
  
  if ((numeroIntroducido % 10) == digitoIntroducido) {
    contadorPosiciones++;
    System.out.print("El dígito está en la posición "+contadorPosiciones);
  } else {
    //~ while (numeroIntroducido > 0 ){
    //~ numeroIntroducido = numeroIntroducido /10;
    //~ }
  }
  
      
  
       
  


}
    
 }
