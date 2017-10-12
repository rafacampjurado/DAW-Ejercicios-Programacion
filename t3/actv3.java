/*
 *actv3.java
 * 
 * Realiza un conversor de euros a pesetas. 
 * La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * 
 */


public class actv3 {
	
	public static void main (String args[]) {
		
			//~ String pesetas;
			//~ System.out.print("Cantidad en pesetas que quieres cambiar: ");
			//~ pesetas = System.console().readLine();
			//~ int numPesetas = Integer.parseInt(pesetas);
			//~ System.out.print("Número de pesetas: "+ numPesetas);
			
			//~ double euros = (double)(numPesetas * 0.006);
			
			//~ System.out.print(numPesetas);
			//~ System.out.print("pesetas son " + euros);
	String numeroEnPesetas;
	System.out.print("Cantidad en pesetas que quieres cambiar a euros: ");
	numeroEnPesetas = System.console().readLine();
	int pesetas = Integer.parseInt(numeroEnPesetas);
    double euros = pesetas / 166.386;
    
    System.out.println(pesetas + " pesetas son " + euros + " euros.");
    //~ // Para mostrar dos decimales se puede usar "printf"
    //~ // en lugar de "print" o "println"
    System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
  
			
	}
}

