/*
 * actv7.java
 * 
 *Escribe un programa que calcule el total de una factura a partir de la base
 *imponible.
 * 
 * 
 */


public class actv7 {
	
	public static void main (String args[]) {
			//~ double precioSinIva = 0.21;
			String precioSinIva;
			System.out.print("Introduzca el precio sin IVA: ");
			precioSinIva = System.console().readLine();
			System.out.println(precioSinIva);
			
			double SinIva = Integer.parseInt( precioSinIva);
			
			double iva = SinIva * 0.21;
			double totalFactura = SinIva + iva;
		
			System.out.println("Precio sin IVA: " + SinIva);
			System.out.println("IVA: " + iva + "€");
			System.out.println("Total de esta factura es " + totalFactura);
		
		
	
	}
}

