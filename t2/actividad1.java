/*
 * actividad1.java
 * Escribe un programa en el que se declaren las variables enteras x e y . Asignales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 * 
 * @author: Rafael
 */


public class actividad1 {
	
	public static void main (String args[]) {
	int x = 144;
	int y = 999;
	System.out.println("Variable X = "+ x);
	System.out.println("Variable Y = "+ y);
	int sum = x + y;
	System.out.println("Suma de los valores X e Y = " + sum);
	double division;
	division = (double)y / (double)x;
	System.out.println("División = " + division);
	int mul = x * y;
	System.out.println("Multiplicación = " +mul);
	int resta = y - x;
	System.out.println("Resta = " +resta);
		
	}
}

