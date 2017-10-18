/*
 * actv4.java
 * 
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 * 
 * 
 */


public class actv4 {
	
	public static void main (String args[]) {
		String horasTrabajadas;
	System.out.print("Introduzca las horas que trabaja diariamente: ");
	horasTrabajadas = System.console().readLine();
	//~ System.out.println(horastrabajadas);
	String diasTrabajados;
	System.out.print("Introduzca la cantidad de días que trabaja a la semana: ");
	diasTrabajados = System.console().readLine();
	//~ System.out.println(horasTrabajadas);
	//~ System.out.println(diasTrabajados);
	int horas = Integer.parseInt(horasTrabajadas);
	//~ double salario;
	double dias = Integer.parseInt(diasTrabajados);
	double horasTotales = horas * dias;
	if (horasTotales > 40) {
		System.out.println("Las horas extras se pagan a 16€ la hora");
		double salario = (horas * dias) * 16;
		System.out.print("El salario semanal es: "+salario+"€");
	} else {
	double salario = (horas * dias) * 12;
	System.out.print("El salario semanal es: "+salario+"€");
	}
	//~ System.out.print("El salario semanal es: "+salario+"€");
	
	}
}

