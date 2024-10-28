package bucles;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducimos un 0, debe de salirse del bucle. Imprime 1 total y 0
		 * fallos, es correcto.
		 * 
		 * Prueba 2: introducimos 4, 3, 5, 6, 0, debe contar 5 números. Imprime 5
		 * números totales, da fallo en el 3, hay 1 fallo y se sale del bucle en 0, es
		 * correcto.
		 */

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int num;
		// Variable que guarda el último número introducido válido
		int ultimoNum;
		// Variable que guarda el número total introducido por el usuario, lo
		// inicializamos a 1 ya que siempre le pregunta como mínimo una vez
		int numTotal = 1;
		// Variable que guarda el número de fallos cometidos, inicializamos a 0
		int numFallos = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario un número inicial
		System.out.println("Introduce un número inicial: ");
		num = reader.nextInt();

		// Guardamos el número dado en último número introducido
		ultimoNum = num;

		// Creamos un while que se sale del bucle cuando es igual a 0
		while (num != 0) {

			// Creamos un if que si el número introducido es menor que el último válido
			// imprime un fallo
			if (num < ultimoNum) {
				System.out.println("Fallo es menor");
				// Contamos el número de fallos
				numFallos++;
			}

			// Guardamos el número dado en el último número introducido
			ultimoNum = num;

			// Le volvemos a pedir un número al usuario
			System.out.println("Introduce un número: ");
			num = reader.nextInt();

			// Aumentamos uno al número total introducidos
			numTotal++;
		}

		// Imprimimos los resultados tanto el nº total como el nº de fallos
		System.out.println("Total de números introducidos: " + numTotal);
		System.out.println("Números fallados: " + numFallos);

		// Cerramos el Scanner
		reader.close();
	}
}
