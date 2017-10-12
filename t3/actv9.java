/*
 * actv9.java
 * Escribe un programa que calcule el volumen de un cono según la fórmula
 * V = 1/2 3 πr h
 * 
 * 
 * 
 */


public class actv9 {
	
	public static void main (String args[]) {
	String pregunta;
	System.out.print("Indica el rádio del cono: ");
	pregunta = System.console().readLine();
	int radio = Integer.parseInt(pregunta);
	
	System.out.print("Indica la altura del cono: ");
	pregunta = System.console().readLine();
	int altura = Integer.parseInt(pregunta);
	double multRadioAltura = (radio * radio) * altura * 13.14;
	//~ System.out.print(multRadioAltura);
	double resultado = multRadioAltura / 3;
	System.out.print("El volumen del cono es : "+ resultado);
	}
}

