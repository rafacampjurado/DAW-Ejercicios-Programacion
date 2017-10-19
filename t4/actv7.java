/*
 * actv7.java
 * 
 * Realiza un programa que calcule la media de tres notas.
 * 
 * 
 */


public class actv7 {
	
	public static void main (String args[]) {
		String primeraNota;
		System.out.print("Introduce la primera nota: ");
		primeraNota = System.console().readLine();
		String segundaNota;
		System.out.print("Introduce la segunda nota: ");
		segundaNota = System.console().readLine();
		String terceraNota;
		System.out.print("Introduce la tercera nota: ");
		terceraNota = System.console().readLine();
		double nota1 = Double.parseDouble(primeraNota);
		double nota2 = Double.parseDouble(segundaNota);
		double nota3 = Double.parseDouble(terceraNota);
		double media = (nota1 + nota2 + nota3)/3;
		System.out.println("Tu nota media es "+media);
	}
}

