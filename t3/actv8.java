/*
 * actv8.java
 * Escribe un programa que calcule el salario semanal de un empleado en base
 * a las horas trabajadas, a razón de 12 euros la hora.
 */


public class actv8 {
	
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
	double horas = Integer.parseInt(horasTrabajadas);
	double dias = Integer.parseInt(diasTrabajados);
	double salario = (horas * dias) * 12;
	System.out.print("El salario semanal es: "+ salario +"€");
	
	}
}

