/*
 * actv11.java
 * Realiza un conversor de Kb a Mb.
 */


public class actv11 {
	
	public static void main (String args[]) {
	String pregunta;
	System.out.print("Cantidad de Kilobytes que se desean convertir: ");
	pregunta = System.console().readLine();
	int kiloBytes = Integer.parseInt(pregunta);
	//~ System.out.print(megaBytes);
	double resultado = kiloBytes * 0.0009765625;
	System.out.print(+ kiloBytes + " KB "+"son "+ resultado +" MB");	
	}
}

