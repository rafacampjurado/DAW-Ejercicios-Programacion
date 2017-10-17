/*
 * actv1.java
 * 
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 * 
 */


public class actv1 {
	public static void main (String args[]) {
		System.out.print("Introduce el día de la semana: ");
		String pregunta;
		pregunta = System.console().readLine().toLowerCase();
		String asignatura;
		switch (pregunta) {
			case "lunes":
				asignatura = "Sistemas";
				break;
			case "martes":
				asignatura = "Programación";
				break;
			case "miércoles":
				asignatura = "Sistemas";
				break;
			case "jueves":
				asignatura = "Programación";
				break;
			case "viernes":
				asignatura = "Programación";
				break;
			default :
					asignatura = "nada";
				break;
		}
		System.out.println("Los "+ pregunta + " toca a primera hora "+ asignatura);
	}
}

