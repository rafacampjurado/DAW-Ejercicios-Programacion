/*
 * actv12.java
 * 
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario
 * a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
 * mientos en las diferentes asignaturas del curso.
 * 
 * 
 */


public class actv12 {
	
	public static void main (String args[]) {
		System.out.println("Bienvenido al test");
		System.out.println("--------------------");
		//~ Listado de preguntas
		System.out.print("Las variables pueden almacenar valores enteros, números decimales, caracteres,cadenas de caracteres (palabras o frases)");
		String respuesta = System.console().readLine();
		if (respuesta.equals("Si")) {
		System.out.print("La respuesta es correcta")
		int puntuacion ++
		} else {
			System.out.print("La respuesta no es correcta");
		}
	}
}

