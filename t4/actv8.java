/*
 * actv8.java
 * 
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * 
 * 
 */


public class actv8 {
	
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
		
		if (media == 5.00) {
			System.out.print("Tu nota es suficiente");
		}
		else if (media <= 4.00) {
			System.out.print("Tu nota es insuficiente");
		}
		else if ((media >= 6.00)&&(media < 7.00)) {
			System.out.print("Tu nota es buena");
		}
		else if ((media >= 7.00) && (media <= 8.00)) {
			System.out.print("Tu nota es notable");
		}
		else if (media >= 9.00) {
			System.out.print("Tu nota es sobresaliente");
		} else {
		}
	}
}

