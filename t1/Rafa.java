/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 *
 * @author Luis J. Sánchez
 */

public class Rafa { // Clase principal
  public static void main(String[] args) {
    System.out.println("¡Hola, soy Rafa! \nDirección: blablablablabla\nTeléfono: 111111");
    System.out.println("\nInglés\t \t Español \n \nAcross \t \t Sobre \nWater \t\t Agua \nSword \t\t Espada \nChain \t\t Cadena \nGuard \t\t Guardián \nPerhaps\t\t Quizás \nSometime\tAlguna vez \nCapacitor \t Condensador \nReel \t\t Bobina \nMachine \t Máquina");
	 
	String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    String celeste = "\033[36m";
	System.out.println("\nLunes \t Martes \t Miércoles \t Jueves \t Viernes");
	System.out.println(rojo + "\nSINF" + azul + "\t PRO"+ rojo +"\t\t SINF"+ azul + "\t\t PRO"+ azul + "\t\t PRO");
	System.out.println(rojo + "\nSINF"+ azul + "\t PRO"+ rojo +" \t\t SINF"+ azul + "\t\t PRO"+ azul + "\t\t PRO"); 
	System.out.println(rojo + "\nSINF"+ azul + "\t PRO"+ rojo + "\t\t SINF"+ azul + "\t\t PRO"+ verde +" \t\t ED"); 
	System.out.println(celeste + "\nFOL"+ morado + "\t BBDD"+ verde + "\t\t ED"+ morado + "\t\t BBDD"+ naranja + "\t\t LM"); 
	System.out.println(celeste + "\nFOL"+ morado + "\t BBDD"+ verde + "\t\t ED"+ morado + "\t\t BBDD"+ naranja + "\t\t LM");
	System.out.println(celeste + "\nFOL"+ morado + "\t BBDD"+ naranja + "\t\t LM"+ morado + "\t\t BBDD"+ naranja + "\t\t LM");
  }
 
}
