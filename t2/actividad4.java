/*
 * actividad4.java
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se 
 * quiere convertir deberá estar almacenada en una variable.
 
 * 
 */


public class actividad4{
	
	public static void main (String args[]) {
	/* double euro = 100;
	double pesetas = 166;
	System.out.println("Si tenemos"+ euro +"€" );
	System.out.println("En pesetas equivaldría a: ");
	System.out.println(euro * pesetas);
	*/
		double euros = 15.55;
		int pesetas = (int) (euros * 166.386);
		
		System.out.print(euros + "euros = " + pesetas + "ptas");
	}
}

