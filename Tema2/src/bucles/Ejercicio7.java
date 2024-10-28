package bucles;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducir un valor no válido (Ej. -2), debe volverle a preguntar
		 * al usuario por un número.
		 * 
		 * Prueba 2: introducir un valor válido (Ej. 3), debe imprimir un triángulo de 1
		 * a 3. Imprime 1, 121, 12321, es correcto.
		 */

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int num;

		// Importamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que sale del bucle cuando el número es positivo
		do {
			System.out.println("Introduce un número entero: ");
			num = reader.nextInt();
		} while (num <= 0);

		// Creamos un for que imprima N líneas
		for (int i = 1; i <= num; i++) {

			// Creamos un for que imprima los números de 1 a N fila por fila
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			// Creamos un for que imprima los números de N-1 hasta 1 por fila
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}

			// Realizamos un salto de línea
			System.out.println();
		}

		// Cerramos el Scanner
		reader.close();
	}
}
