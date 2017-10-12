/*
 * actv10.java
 * Realiza un conversor de Mb a Kb. 
 *
 */


public class actv10 {
	
	public static void main (String args[]) {
	String pregunta;
	System.out.print("Cantidad de Megabytes que se desean convertir: ");
	pregunta = System.console().readLine();
	int megaBytes = Integer.parseInt(pregunta);
	//~ System.out.print(megaBytes);
	double resultado = megaBytes * 1.024;
	System.out.print(+ megaBytes + " MB "+"son "+ resultado +" KB");
	}
}

