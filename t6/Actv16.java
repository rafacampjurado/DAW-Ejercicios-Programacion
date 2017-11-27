//Realiza un simulador de máquina tragaperras simplificada que cumpla los
//siguientes requisitos:
//a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
//figuras posibles: corazón, diamante, herradura, campana y limón.
//b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
//ha perdido”.
//c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
//ha recuperado su moneda”.
//d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
//10 monedas”.
//
//@author Rafael Campos Jurado

package actividades;
public class Actv16 {
  public static void main(String[] args) { 
    int tirada1 = 0;
    String figura = "";
    String figuraA = "";
    String figuraB = "";
    String figuraC = "";
    
    for (int contador = 0; contador <= 3; contador++) {
      tirada1 = ((int)(Math.random ()*5)+1);
      switch (tirada1) {
        case 1:
          figura = "corazón";
        break;
        case 2:
          figura = "diamante";
        break;
        case 3: 
          figura = "herradura";
        break;
        case 4:
          figura = "campana";
        break;
        case 5:
          figura = "limón";
        break;
        default:
        break;
      }
      if (contador == 1) {
        figuraA = figura;
      }
      if (contador == 2) {
        figuraB = figura;
      }
      if (contador == 3) {
        figuraC = figura;
      }
      
      }
    if ((figuraA == figuraB)&&(figuraC == figuraB)) {
      System.out.println(figuraA+" | "+figuraB+" | "+figuraC);
      System.out.print("¡Enhorabuena, ha ganado 10 monedas!\n");
    } else {
        if ((figuraA == figuraB)||(figuraA == figuraC)||(figuraB == figuraC)) {
          System.out.println(figuraA+" | "+figuraB+" | "+figuraC);
          System.out.print("Bien,ha recuperado su moneda\n");
        } else {
          System.out.println(figuraA+" | "+figuraB+" | "+figuraC);
          System.out.print("Lo siento, ha perdido   \n");
        }
    }
     
     
//       System.out.print("| "+figura+"   " );       
  }
}