/*
 * Actv11.java
 * 
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 * 
 * 
 */


public class Actv11 {
public static void main (String args[]) {
	System.out.print("Introduce la hora: " );
	int hora = Integer.parseInt(System.console().readLine());
	System.out.print("Introduce los minutos: ");
	int minutos = Integer.parseInt(System.console().readLine());
	if ((hora < 24) || (minutos < 60)) {
	int segundosPorDia = 86400;
	int segundosDelUsuario = (hora * 60 * 60);
	System.out.print(segundosPorDia - segundosDelUsuario);
	}
	else {
		System.out.print("Error");
	}
	//~ preguntaHora = System.console().readLine();
	//~ double hora = Double.parseDouble(preguntaHora);
	//~ double calculoHora = (23.59 - hora)* 3600;
	//~ System.out.print("Quedan "+ calculoHora +" segundos para la Media Noche");
	
	}
}

