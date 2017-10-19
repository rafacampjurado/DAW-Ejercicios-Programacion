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
		//~ Primera pregunta
		System.out.println("Las variables pueden almacenar valores enteros, números decimales, caracteres,cadenas de caracteres (palabras o frases).");
		System.out.print("Responde con Si o No: ");
		String respuesta = System.console().readLine().toLowerCase();
		int puntuacion;
		puntuacion = 0;
		if (respuesta.equals("si")) {
		System.out.println("La respuesta es correcta");
		puntuacion++; 
		} else {
			System.out.print("La respuesta no es correcta");
		}
		//~ Segunda pregunta
		System.out.println("¿Es conocido el lenguaje máquina por utilizar únicamente 0s y 1s?");
		System.out.print("Responde con Si o No: ");
		respuesta = System.console().readLine().toLowerCase();
		//~ int puntuacion;
		//~ puntuacion = 0;
		if (respuesta.equals("si")) {
		System.out.println("La respuesta es correcta");
		puntuacion++; 
		} else {
			System.out.print("La respuesta no es correcta");
		}
		//~ Tercera pregunta
		System.out.println("¿Es el software es el conjunto de programas informáticos que actúan sobre el hardware para ejecutar lo que el usuario desee?");
		System.out.print("Responde con Si o No: ");
		respuesta = System.console().readLine().toLowerCase();
		//~ int puntuacion;
		//~ puntuacion = 0;
		if (respuesta.equals("si")) {
		System.out.println("La respuesta es correcta");
		puntuacion++; 
		} else {
			System.out.print("La respuesta no es correcta");
		}
		//~ Cuarta pregunta
		System.out.println("¿Es utilizada la sentencia if para la introducción de datos?");
		System.out.print("Responde con Si o No: ");
		respuesta = System.console().readLine().toLowerCase();
		//~ int puntuacion;
		//~ puntuacion = 0;
		if (respuesta.equals("no")) {
		System.out.println("La respuesta es correcta");
		puntuacion++; 
		} else {
			System.out.print("La respuesta no es correcta");
		}
		//~ Quinta pregunta
		System.out.println("¿Para la compilación en Java es necesario que el equipo posea lo denominado JVM?");
		System.out.print("Responde con Si o No: ");
		respuesta = System.console().readLine().toLowerCase();
		//~ int puntuacion;
		//~ puntuacion = 0;
		if (respuesta.equals("si")) {
		System.out.println("La respuesta es correcta");
		puntuacion++; 
		} else {
			System.out.print("La respuesta no es correcta");
		}
		//~ Sexta pregunta
		System.out.println("¿Es el software es el conjunto de programas informáticos que actúan sobre el hardware para ejecutar lo que el usuario desee?");
		System.out.print("Responde con Si o No: ");
		respuesta = System.console().readLine().toLowerCase();
		//~ int puntuacion;
		//~ puntuacion = 0;
		if (respuesta.equals("si")) {
		System.out.println("La respuesta es correcta");
		puntuacion++; 
		} else {
			System.out.print("La respuesta no es correcta");
		}
		//~ Séptima pregunta
		System.out.println("¿En los años 50 ya se utilizaba el Lenguaje de Alto Nivel?");
		System.out.print("Responde con Si o No: ");
		respuesta = System.console().readLine().toLowerCase();
		//~ int puntuacion;
		//~ puntuacion = 0;
		if (respuesta.equals("no")) {
		System.out.println("La respuesta es correcta");
		puntuacion++; 
		} else {
			System.out.print("La respuesta no es correcta");
		}
		//~ Octava pregunta
		System.out.println("¿Es cierto que la CPU solo acepta instrucciones en lenguaje máquina?");
		System.out.print("Responde con Si o No: ");
		respuesta = System.console().readLine().toLowerCase();
		//~ int puntuacion;
		//~ puntuacion = 0;
		if (respuesta.equals("si")) {
		System.out.println("La respuesta es correcta");
		puntuacion++; 
		} else {
			System.out.print("La respuesta no es correcta");
		}
		//~ Novena pregunta
		System.out.println("¿El operador == es utilizado para indicar que un valor es igual al otro?");
		System.out.print("Responde con Si o No: ");
		respuesta = System.console().readLine().toLowerCase();
		//~ int puntuacion;
		//~ puntuacion = 0;
		if (respuesta.equals("si")) {
		System.out.println("La respuesta es correcta");
		puntuacion++; 
		} else {
			System.out.print("La respuesta no es correcta");
		}
		//~ Décima pregunta
		System.out.println("¿Las variables definidas con Int almacenan caracteres?");
		System.out.print("Responde con Si o No: ");
		respuesta = System.console().readLine().toLowerCase();
		//~ int puntuacion;
		//~ puntuacion = 0;
		if (respuesta.equals("no")) {
		System.out.println("La respuesta es correcta");
		puntuacion++; 
		} else {
			System.out.print("La respuesta no es correcta");
		}
		System.out.println("Felicidades, has terminado."+"Tu puntuación es la siguiente: " +puntuacion);
	}
}

