package actswitch;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variable que guarda el nº introducido por el usuario
		int numUsuario;
		// Variable que guarda el día de la semana
		String diaSemana;

		// Le pedimos un número al usuario
		System.out.println("Dime un número del 1 al 7: ");
		numUsuario = reader.nextInt();

		// Creamos un switch que guarda el día de la semana en una variable según del
		// valor numérico introducido por el usuario
		diaSemana = switch (numUsuario) {
		case 1 -> {
			yield "LUNES";
		}
		case 2 -> {
			yield "MARTES";
		}
		case 3 -> {
			yield "MIÉRCOLES";
		}
		case 4 -> {
			yield "JUEVES";
		}
		case 5 -> {
			yield "VIERNES";
		}
		case 6 -> {
			yield "SÁBADO";
		}
		case 7 -> {
			yield "DOMINGO";
		}
		default -> {
			yield "Introduce un número del 1 al 7";
		}
		};

		// Imprimimos el resultado
		System.out.println(diaSemana);

		// Cerramos el Scanner
		reader.close();
	}
}
