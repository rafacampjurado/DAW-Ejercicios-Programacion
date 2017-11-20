/*
 * actv4.java
 *Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 * @author: Rafael
 */


public class actv4 {
	
	public static void main (String args[]) {
	String numUno;
	//~ String numDos;
	
	System.out.print("Variable X = ");
	numUno = System.console().readLine();
	System.out.println("El valor X equivale a: "+ numUno);
	int primerNumero = Integer.parseInt(numUno);
	
	String numDos;
	System.out.print("Variable Y = ");
	numDos = System.console().readLine();
	System.out.println("El valor Y equivale a: "+ numDos);
	int segundoNumero = Integer.parseInt(numDos);
	
	int sum = primerNumero + segundoNumero;
	System.out.println("Suma de los valores X e Y = " + sum);
	double division;
	division = (double)primerNumero / (double)segundoNumero;
	System.out.println("División = " + division);
	int mul = primerNumero * segundoNumero;
	System.out.println("Multiplicación = " +mul);
	int resta = primerNumero - segundoNumero;
	System.out.println("Resta = " +resta);
		
	}
}

