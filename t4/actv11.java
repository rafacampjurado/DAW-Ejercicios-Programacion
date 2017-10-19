/*
 * actv11.java
 * 
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 * 
 * 
 */


public class actv11 {
	
	public static void main (String args[]) {
		System.out.print("Introduce la hora y los minutos, separados con un punto: " );
		String preguntaHora;
		preguntaHora = System.console().readLine();
		double hora = Double.parseDouble(preguntaHora);
		double calculoHora = (23.59 - hora)* 3600;
		System.out.print("Quedan "+ calculoHora +" segundos para la Media Noche");
		
		
	}
}

