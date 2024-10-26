package bucles;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducimos un número menor que 1 (Ej. -2), debe volverle a pedir
		 * al usuario que introduzca otra vez un número.
		 * 
		 * Prueba 2: introducimos un valor válido (Ej. 10), debe devolver la cantidad de
		 * números primos que hay entre 1 y 10. Imprime 4, es correcto.
		 */

		// Declaración de variables
		// Variable que guarda el número dado por el usuario
		int num;
		// Variable que guarda el número de divisores que tiene i
		int divisores = 0;
		// Variable que guarda el resultado del resto de una división
		int resto;
		// Variable que cuenta cúantos números primos hay
		int primo = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que sólo permite números positivos enteros
		do {
			System.out.println("Introduce un número: ");
			num = reader.nextInt();
		} while (num <= 1);

		// Creamos un for que vaya de 1 hasta el número introducido
		for (int i = 1; i <= num; i++) {
			// Creamos un for que vaya de 1 hasta i
			for (int j = 1; j <= i; j++) {
				// Calculamos el resto y si da 0 es que j es un divisor de i
				resto = i % j;
				if (resto == 0) {
					divisores++;
				}
			}

			// Creamos un if que si el número de divisores de i es 2 es un número primo
			if (divisores == 2) {
				primo++;
			}

			// Inicializamos divisores otra vez a 0 para que vuelva a contarlos
			divisores = 0;
		}

		// Imprimimos el resultado
		System.out.println("El número de primos son: " + primo);

		// Cerramos el Scanner
		reader.close();
	}
}
