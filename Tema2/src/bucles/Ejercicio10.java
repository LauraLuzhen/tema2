package bucles;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducir un valor no válido (Ej. Hola), debe de dar error.
		 * Imprime null y vuelve a preguntarle al usuario.
		 * 
		 * Pruba 2: introducir un valor no válido (Ej. -2), debe de dar error. Imprime
		 * error y el mensaje de las condiciones de cómo debe ser el número.
		 * 
		 * Prueba 3: introducir un número capicúa (Ej. 121), debe indicar que el número
		 * es capicúa. Imprime "El número es capicúa".
		 * 
		 * Prueba 4: introducir un número no capicúa (Ej. 123), debe indicar que el
		 * número no es capicúa. Imprime "El númmero no es capicúa".
		 */

		// Declaración de variables
		// Variable que guarda el número del usuairo
		int num = 0;
		// Variable que guarda el inverso del número
		int inverso = 0;
		// Variable que guarda el resto de la división
		int resto;
		// Variable que guarda el número final
		int numFinal;
		// Variable que indica si se produce un error o no
		boolean error = false;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos un número al usuario
		do {
			try {
				System.out.println("Introduce un número entero: ");
				num = reader.nextInt();
				assert (num > 0) : "El número debe ser mayor que 0";
				error = false;
			} catch (Exception ex) {
				System.err.println(ex.getMessage());
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);

		// Igualamos el número final con el valor introducido del número
		numFinal = num;

		// Creamos un while que si el valor es válido entra en el bucle
		while (numFinal > 0) {

			// Calculamos el resto
			resto = numFinal % 10;

			// Calculamos el inverso
			inverso = inverso * 10 - resto;

			// Dividimos el número final para quitar números
			numFinal /= 10;
		}

		// Creamos un if-else que imprime si el número es capicúa o no
		if (num == inverso) {
			System.out.println("El número es capicúa.");
		} else {
			System.out.println("El número no es capicúa.");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
