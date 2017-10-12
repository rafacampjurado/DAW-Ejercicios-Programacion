/*
 * actv12.java
 * 
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 * 
 * 
 */


public class actv12 {
	
	public static void main (String args[]) {
	//~ Introduce la nota del primer examen: 7
	//~ ¿Qué nota quieres sacar en el trimestre? 8.5
	//~ Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
	String primerExamen;
	System.out.print("Introduce la nota del primer examen: ");
	primerExamen = System.console().readLine();
	double primerValor = Double.parseDouble(primerExamen);
	
	String segundoExamen;
	System.out.print("Introduce la nota que esperas al final del trimestre: ");
	segundoExamen = System.console().readLine();
	double segundoValor = Double.parseDouble(segundoExamen);
	double notaFinal = ((segundoValor * 100) - (primerValor * 40)) / 60;
	System.out.println("La nota final será "+ segundoValor + " si sacas un "+ notaFinal + " en el siguiente examen"); 
	//~ System.out.println(segundoValor);
	
	
	
	
	}
	
}

