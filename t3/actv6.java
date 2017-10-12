/*
 * actv6.java
 * Escribe un programa que calcule el área de un triángulo.
 * 
 */


public class actv6 {
	
	public static void main (String args[]) {
	String aAltura;
	String aBase;
	System.out.print("Introduzca la altura del triángulo: ");
	aAltura = System.console().readLine();
	System.out.print("Introduzca la base del triángulo: ");
	aBase = System.console().readLine();
	
	
	int Altura = Integer.parseInt( aAltura );
	int Base = Integer.parseInt( aBase );
	
	int multiArea = Base * Altura;
	int diviArea = multiArea / 2;
	System.out.println("El área del triángulo es: "+ diviArea);
	
	}
}

