/*
 * actv10.java
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento
 * 
 * 
 */


public class actv10 {
	
	public static void main (String args[]) {
		System.out.print("Introduce tu día: ");
		String preguntaDia;
		preguntaDia = System.console().readLine();
		System.out.print("Introduce mes de nacimiento: ");
		String preguntaMes;
		preguntaMes = System.console().readLine();
		int dia = Integer.parseInt(preguntaDia);
		int mes = Integer.parseInt(preguntaMes);
		String signoMes = " ";
		
		switch (mes) {
		case 1:
		if (dia < 21) {
			signoMes = "Capricornio";
		} else {
		signoMes = "Acuario";
		}
		break;
		case 2:
		if (dia < 20) {
		signoMes = "Acuario";
		} else {
		signoMes = "Piscis";
		}
		break;
		case 3:
		if (dia < 21) {
		signoMes = "Piscis";
		} else {
		signoMes = "Aries";
		}
		break;
		case 4:
		if (dia < 21) {
		signoMes = "Aries";
		} else {
			signoMes = "Tauro";
		}
		break;
		case 5:
		if (dia < 21) {
			signoMes = "Tauro";
			} else {
			signoMes = "Géminis";
		}
		break;
		case 6:
        if (dia < 22) {
          signoMes = "géminis";
        } else {
          signoMes = "cáncer";
        }
        break;
      case 7:
        if (dia < 22) {
          signoMes = "cáncer";
        } else {
          signoMes = "Leo";
        }
        break;
      case 8:
        if (dia < 24) {
          signoMes = "leo";
        } else {
          signoMes = "virgo";
        }
        break;
      case 9:
        if (dia < 23) {
          signoMes = "virgo";
        } else {
          signoMes = "libra";
        }
        break;
      case 10:
        if (dia < 23) {
          signoMes = "libra";
        } else {
          signoMes = "escorpio";
        }
        break;
      case 11:
        if (dia < 23) {
          signoMes = "escorpio";
        } else {
          signoMes = "sagitario";
        }
        break;
      case 12:
        if (dia < 21) {
          signoMes = "sagitario";
        } else {
          signoMes = "capricornio";
        }
        break;
      default:
		{
		System.out.print("Tu signo es "+ signoMes);
		}
		}
	}
}

