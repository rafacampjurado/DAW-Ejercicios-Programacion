/*
 * actividad6.java
 * Escribe un programa que calcule el total de una factura a partir de 
 * la base imponible (precio sin IVA). La base imponible estará 
 * almacenada en una variable.
 * 
 */


public class actividad6 {
	
	public static void main (String args[]) {
		double precioSinIva = 0.21;
		double iva = precioSinIva * 0.21;
		double totalFactura = precioSinIva + iva;
		
		System.out.println("Precio sin IVA: " + precioSinIva);
		System.out.println("IVA: " + iva + "€");
		System.out.println("Total de esta factura es " + totalFactura);
		
		
	}
}

