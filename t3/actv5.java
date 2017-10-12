/*
 * actv5.java
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 */


public class actv5 {
	
	public static void main (String args[]) {
	String aAltura;
	String aBase;
	System.out.print("Introduzca la altura del rectángulo: ");
	aAltura = System.console().readLine();
	System.out.print("Introduzca la base del rectángulo: ");
	aBase = System.console().readLine();
	
	
	int Altura = Integer.parseInt( aAltura );
	int Base = Integer.parseInt( aBase );
	
	int Area = Base * Altura;
	System.out.println("El área del rectángulo es: "+ Area);
	
	
	}
}

