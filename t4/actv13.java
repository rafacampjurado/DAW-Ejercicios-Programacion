/*
 * actv13.java
 * 
 *Escribe un programa que ordene tres números enteros introducidos por
 * teclado.
 * 
 * 
 */


public class actv13 {
	
	public static void main (String args[]) {
		System.out.print("Introduce el primer número: ");
		String primerNumero;
		primerNumero = System.console().readLine();
		int A = Integer.parseInt(primerNumero);
		
		System.out.print("Introduce el segundo número: ");
		String segundoNumero;
		segundoNumero = System.console().readLine();
		int B = Integer.parseInt(segundoNumero);
		
		System.out.print("Introduce el tercer número: ");
		String tercerNumero;
		tercerNumero = System.console().readLine();
		int C = Integer.parseInt(tercerNumero);
		int contenedor;
		
		if (A > B) {
			contenedor = A;
			A = B;
			B = contenedor;
		}
		if (B > C) {
			contenedor = B;
			B = C;
			C = contenedor;
		}
		if (A > B) {
			contenedor = A;
			A = B;
			B = contenedor;
		}
		System.out.printf("%d %d %d", A,B,C);	
			
		//~ if ((A < B) && (A < C)) {
			//~ System.out.printf("%d %d %d",A,B,C);
		//~ }
		//~ else if ((B < C) && (B > A)){
			//~ System.out.printf("%d %d %d",A,B,C);
		//~ } 
		//~ else if ((C > A) && (C > B)){
			//~ System.out.printf("%d %d %d",A,B,C);
		//~ }
		 //~ else {
			//~ System.out.println("nada");	
				
	}
}

