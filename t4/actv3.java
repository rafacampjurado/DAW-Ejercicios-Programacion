/*
 * actv3.java
 * 
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 * diente nombre del día de la semana.
 * 
 */


public class actv3 {
	
	public static void main (String args[]) {
		System.out.print("Introduzca el número de la semana: ");
		String pregunta;
		pregunta = System.console().readLine();
		int numDia = Integer.parseInt(pregunta);
		String diaSemana;
		switch (numDia) {
			case 1:
			diaSemana = "Lunes";
			break;
			case 2:
			diaSemana = "Martes";
			break;
			case 3:
			diaSemana = "Martes";
			break;
			case 4:
			diaSemana = "Miércoles";
			break;
			case 5:
			diaSemana = "Jueves";
			break;
			case 6:
			diaSemana = "Viernes";
			break;
			case 7:
			diaSemana = "Sábado";
			break;
			case 8:
			diaSemana = "Domingo";
			break;
			default :
			diaSemana = "nada";
			break;
		}
		System.out.println(numDia +" es igual a "+ diaSemana);
	
			
		
	}
}

