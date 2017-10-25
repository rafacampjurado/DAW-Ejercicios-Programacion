/*
 * Actv16.java
 * 
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
 * nos está siendo infiel. El programa irá haciendo preguntas que el usuario
 * contestará con verdadero o falso. Cada pregunta contestada como verdadero
 * sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utili-
 * za el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
 * del programa.
 * 
 */


public class Actv16 {
public static void main (String args[]) {
System.out.println("Bienvenido al test de fidelidad para parejas.");
String respuesta;
int puntuacion = 0;
System.out.print("1. ¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente?: " );
respuesta = System.console().readLine().toLowerCase();
if (respuesta.equals("verdadero")) {
puntuacion ++;puntuacion ++;puntuacion ++;
System.out.print(puntuacion);
} else {
  //~ System.out.print(puntuacion);
}
System.out.print("2. ¿Ha aumentado sus gastos de vestuario?: ");
respuesta = System.console().readLine().toLowerCase();
if (respuesta.equals("verdadero")) {
puntuacion ++;puntuacion ++;puntuacion ++;
} else {
  //~ System.out.print(puntuacion);
}

System.out.print("3. ¿Ha perdido el interés que mostraba anteriormente por ti?: ");
respuesta = System.console().readLine().toLowerCase();
if (respuesta.equals(puntuacion)) {
puntuacion ++;puntuacion ++;puntuacion ++;
} else {
  //~ System.out.print(puntuacion);
}

System.out.print("4. ¿Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?: ");
respuesta = System.console().readLine().toLowerCase();
if (respuesta.equals(puntuacion)) {
puntuacion ++;puntuacion ++;puntuacion ++;
} else {
  //~ System.out.print(puntuacion);
}


System.out.print("5. ¿No te deja que mires la agenda de su teléfono móvil?: ");
respuesta = System.console().readLine().toLowerCase();
if (respuesta.equals(puntuacion)) {
puntuacion ++;puntuacion ++;puntuacion ++;
} else {
  //~ System.out.print(puntuacion);
}
System.out.print("6. ¿A veces tiene llamadas que dice no querer contestar cuando estás tú delante?: ");
respuesta = System.console().readLine().toLowerCase();
if (respuesta.equals(puntuacion)) {
puntuacion ++;puntuacion ++;puntuacion ++;
} else {
  //~ System.out.print(puntuacion);
}

System.out.print("7. ¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?: ");
respuesta = System.console().readLine().toLowerCase();
if (respuesta.equals(puntuacion)) {
puntuacion ++;puntuacion ++;puntuacion ++;
} else {
  //~ System.out.print(puntuacion);
}

System.out.print("8. ¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?: ");
respuesta = System.console().readLine().toLowerCase();
if (respuesta.equals(puntuacion)) {
puntuacion ++;puntuacion ++;puntuacion ++;
} else {
  //~ System.out.print(puntuacion);
}

System.out.print("9. ¿Has notado que últimamente se perfuma más?: ");
respuesta = System.console().readLine().toLowerCase();
if (respuesta.equals(puntuacion)) {
puntuacion ++;puntuacion ++;puntuacion ++;
} else {
  //~ System.out.print(puntuacion);
}

System.out.print("10. ¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?: ");
respuesta = System.console().readLine().toLowerCase();
if (respuesta.equals(puntuacion)) {
puntuacion ++;puntuacion ++;puntuacion ++;
} else {
  //~ System.out.print(puntuacion);
}

if ((puntuacion <=0)&&(puntuacion ==10)) {
  System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
}
else if ((puntuacion >= 11 )&&(puntuacion <= 22)) {
  System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
}
else if ((puntuacion >= 22)&&(puntuacion <= 30)) {
  System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
}


//~ Puntuación entre 11 y 22:
//~ 

//~ Puntuación entre 22 y 30
//~ 
}
}

