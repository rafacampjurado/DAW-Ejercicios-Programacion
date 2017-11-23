/*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.
 * @author Rafael Campos Jurado
 */
package actividades;

public class Actv11{
  public static void main(String[] args) {
    int nota = 0;
    String notaNombre = "";
    int contadorSuspensos = 0;
    int contadorSuficiente = 0;
    int contadorBien = 0;
    int contadorNotable = 0;
    int contadorSobresaliente = 0;
    for (int i = 0; i < 20; i++) {
      nota = ((int)(Math.random()*10)+1);
      if (nota < 5) {
        notaNombre = "suspenso";
        contadorSuspensos++;
      } else {
          switch (nota) {
            case 5:
              notaNombre = "suficiente";
              contadorSuficiente++;
            break;
            case 6:
              notaNombre = "bien";
              contadorBien++;
             break;
            case 7:
              notaNombre = "bien";
              contadorBien++;
             break;
            case 8:
              notaNombre = "notable";
              contadorNotable++;
             break;
            case 9:
              notaNombre = "sobresaliente";
              contadorSobresaliente++;
             break;
            case  10:
              notaNombre = "sobresaliente";
              contadorSobresaliente++;
             break;
            default:
              break;
          }
      }
      System.out.print("|"+notaNombre);
      }
      System.out.println();
     System.out.println("Número de suspensos = "+contadorSuspensos);
     System.out.println("Número de suficientes = "+contadorSuficiente);
     System.out.println("Número de bienes = "+contadorBien);
     System.out.println("Número de notables = "+contadorNotable);
     System.out.println("Número de sobresaliente = "+contadorSobresaliente);
     
    
    
  }
}
