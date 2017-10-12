/*
 * actv2.java
 * 
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se
 * quiere convertir debe ser introducida por teclado.
 * 
 */


public class actv2 {
	
	public static void main (String args[]) {
		String numeroEnEuros;
	System.out.print("Cantidad en euros que quieres cambiar a pesetas: ");
	numeroEnEuros = System.console().readLine();
	int euros = Integer.parseInt(numeroEnEuros);
    double pesetas = (euros * 166.386);
    System.out.print(+ euros + "€ "+"\tson\t" + pesetas + "\tpesetas");
    
    //~ System.out.println(pesetas + " pesetas son " + euros + " euros.");
    // Para mostrar dos decimales se puede usar "printf"
    // en lugar de "print" o "println"
    //~ System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
	}
}

