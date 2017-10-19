/*
 * actv6.java
 * 
 * Realiza un programa que calcule el √ tiempo que tardará en caer un 
 * objeto desde 2 una altura h. 
 * Aplica la fórmula t = 2h  * g siendo g = 9.81m/s
 * 
 * 
 */


public class actv6 {
	
	public static void main (String args[]) {
		System.out.print("Introduce la altura: ");
		String altura;
		altura = System.console().readLine();
		double h = Double.parseDouble(altura);
		if (h > 0) {
				double g = 9.81;
		double tiempo = Math.sqrt(2*h/g);
		System.out.print("El objeto tardará "+tiempo+" segundos");
		} else {
		System.out.print("La altura debe ser mayor que 0");
		}
		
	}
}

