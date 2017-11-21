//Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
//de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
//@author Rafael Campos Jurado
// 
package actividades;


public class Actv3 {

    public static void main(String[] args) {
      int paloCarta = 0;
      String nombrePalo = "a";
      int cartaPalo = 0;
      String nombreCarta = "a";
      boolean laCarta = false;
      
        for (int i = 1; i <= 4; i++)  {
           paloCarta = ((int)(Math.random()* 6) + 1 );
           switch (paloCarta) {
             case 1:
               nombrePalo = "picas";
               break;
             case 2:
               nombrePalo = "corazones";
               break;
             case 3:
               nombrePalo = "diamantes";
               break;
             case 4:
               nombrePalo = "tréboles";
               break;
             default:
               break;
           }
           for (int y = 1; y <= 10; y++) {
             cartaPalo = (int) ((Math.random() * 10) + 1);
             
             if ((cartaPalo >=2)||(cartaPalo <=7)) {
             nombreCarta = String.valueOf(cartaPalo);
             laCarta = false;
           } 
              switch (cartaPalo) {
                case 1:
                  nombreCarta = "As";
                  laCarta = true;
                  break;
                case 8:
                  laCarta = true;
                  nombreCarta = "sota";
                  
                  break;
                case 9:
                  nombreCarta = "caballo";
                  laCarta = false;
                  break;
                case 10:
                  nombreCarta = "rey";
                  laCarta = true;
                  break;
                default:
                  break;
              }
           
         }
  
//                 System.out.println("nombre palo = "+ nombrePalo);
//                 System.out.println("nombre carta = "+ cartaPalo);

      
        }
//        System.out.println("nombre palo FINAL= "+ nombrePalo);
        if (laCarta) {
          System.out.println("Tu carta es la "+ nombreCarta +" de "+ nombrePalo);
        } else {
        System.out.println("Tu carta es el "+ nombreCarta +" de "+ nombrePalo);
        }
    }
}