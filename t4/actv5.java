/*
 * actv5.java
 * 
 * Realiza un programa que resuelva una ecuación de primer grado
 *  (del tipo Ax+B = 0).
 * 
 */


public class actv5 {
	
	public static void main (String args[]) {
		System.out.print("Introduce el valor de a: ");
		String valorA;
		valorA = System.console().readLine();
		System.out.print("Introduce el valor de b: ");
		String valorB;
		valorB = System.console().readLine();
		int A = Integer.parseInt(valorA);
		int B = Integer.parseInt(valorB);
		double X = ((B*-1)/ A);
		System.out.print("Valor X= "+X);
	}
}

