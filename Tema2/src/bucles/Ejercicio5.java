package bucles;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducir un número no válido (Ej. -3), debe preguntarle otra vez
		 * al usuario por un número.
		 * 
		 * Prueba 2: introducir un valor válido (Ej. 3), debe imprimir cada número del 1
		 * al 3 las veces del número. Imprime 1, 2 2, 3 3 3
		 */

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int num;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que sale del bucle cuando el número está entre 0-20
		do {
			System.out.println("Introduce un número entero del [0, 20]: ");
			num = reader.nextInt();
		} while (num < 0 || num > 20);

		// Creamos un for que i va aumentando 1 por cada iteración hasta valer el número
		for (int i = 1; i <= num; i++) {
			// Creamos un for que imprima sin salto de línea el valor de i y un espacio las
			// veces de i
			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}

			// Realizamos un salto de línea
			System.out.println();
		}

		// Cerramos el Scanner
		reader.close();
	}
}
