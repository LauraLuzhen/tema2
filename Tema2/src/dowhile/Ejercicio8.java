package dowhile;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la primera tirada
		int tirada1;
		// Variable que guarda la segunda tirada
		int tirada2;
		// Variable que guarda la respuesta del usuario
		String respuesta1;
		// Variable que guarda la respuesta del usuario
		String respuesta2;
		// Variable que guarda la suma de ambas tiradas
		int suma;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que se sale del bucle siempre que el nº introducido este
		// en mayúsuclas sea del 1-6
		do {
			// Le preguntamos al uruaio cuánto ha sacado en la primera tirada
			System.out.println(
					"¿Cuánto has sacado en la primera tirada? (Indicar el número con letras y en mayúsucalas): ");
			respuesta1 = reader.next();
		} while (!respuesta1.equals("UNO") && !respuesta1.equals("DOS") && !respuesta1.equals("TRES")
				&& !respuesta1.equals("CUATRO") && !respuesta1.equals("CINCO") && !respuesta1.equals("SEIS"));

		// Creamos un do-while que se sale del bucle siempre que el nº introducido este
		// en mayúsuclas sea del 1-6
		do {
			// Le preguntamos al uruaio cuánto ha sacado en la segunda tirada
			System.out.println(
					"¿Cuánto has sacado en la segunda tirada? (Indicar el número con letras y en mayúsculas): ");
			respuesta2 = reader.next();
		} while (!respuesta2.equals("UNO") && !respuesta2.equals("DOS") && !respuesta2.equals("TRES")
				&& !respuesta2.equals("CUATRO") && !respuesta2.equals("CINCO") && !respuesta2.equals("SEIS"));

		// Creamos un switch para guardar el valor del dado en la primera tirada
		tirada1 = switch (respuesta1) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + respuesta1);
		};

		// Creamos un switch para guardar el valor del dado en la primera tirada
		tirada2 = switch (respuesta2) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + respuesta2);
		};

		// Sumamos el resultado de ambas tiradas
		suma = tirada1 + tirada2;

		// Imprimimos la suma de ambas tiradas por pantalla
		System.out.println("La suma entre las dos tiradas es: " + suma);

		// Cerramos el Scanner
		reader.close();

	}
}
