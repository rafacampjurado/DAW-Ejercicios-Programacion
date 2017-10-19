/*
 * actv9.java
 * 
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax 2 + bx + c = 0).
 * 
 * 
 */


public class actv9 {
	
	public static void main (String args[]) {
		System.out.print("Introduce el valor de A: ");
		String valorA;
		valorA = System.console().readLine();
		int A = Integer.parseInt(valorA);
		System.out.print("Introduce el valor de B: ");
		String valorB;
		valorB = System.console().readLine();
		int B = Integer.parseInt(valorB);
		System.out.print("Introduce el valor de C: ");
		String valorC;
		valorC = System.console().readLine();
		int C = Integer.parseInt(valorC);
		double discriminante = (B*B)-(4*A*C);
		if (discriminante < 0) {
			System.out.println("La ecuación tiene infinitas soluciones");
		} else if ((A == 0)&&(B == 0)&&(C == 0)){
			System.out.print("Es valor es 0");
		} else if ((A != 0)&&(B !=0)&&(C !=0)) {
		System.out.println("x1 = "+ (-B + Math.sqrt(discriminante)/(4*A*C)));
		System.out.println("x1 = "+ (-B - Math.sqrt(discriminante)/(4*A*C)));
		}
	}
}

