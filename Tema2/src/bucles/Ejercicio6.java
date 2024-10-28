package bucles;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducir un valor no válido (Ej. -2), debe de preguntarle otra
		 * vez al usuario por un número.
		 * 
		 * Prueba 2: introducir un valor válido con un tamaño impar (Ej. 5), debe
		 * imprimir un triángulo con * con igual base y altura. Imprime un triángulo de
		 * 5 de base y 5 de altura.
		 * 
		 * Prueba 3: introducir un valor válido con un tamaño par (Ej. 4), debe imprimir
		 * un triángulo con * con igual base y altura. Imprime un triángulo de 4 de base
		 * y 5 de altura.
		 */

		// Declaración de variables
		// Variable que guarda una cadena vacía
		String cadena = "";
		// Variable que guarda el número del usuario
		int num;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que sale del bucle cuando el número es positivo entero
		do {
			// Le pedimos el tamaño del triángulo
			System.out.println("Introduce un número positivo: ");
			num = reader.nextInt();
		} while (num <= 0);

		// Creamos un for que imprima la cadena tantas veces como tamaño ha introducido
		// el usuario
		for (int i = 1; i <= num; i++) {

			// Creamos un for que añada a la cadena un número de espacios
			for (int j = 0; j < num - i; j++) {
				cadena += " ";
			}

			// Creamos un for que añada a la cadena los * necesarios según la línea
			// empezando por 1 y terminando con N
			for (int k = 0; k < i; k++) {
				cadena += "* ";
			}

			// Imprimimos la cadena
			System.out.println(cadena);

			// Vaciamos la cadena para imprimir la próxima línea
			cadena = "";
		}

		// Cerramos el Scanner
		reader.close();
	}
}
