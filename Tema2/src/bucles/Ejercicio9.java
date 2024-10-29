package bucles;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducimos un número negativo (Ej. -3), esperamos que el número
		 * tenga una cifra y que haga los cálculo aunque sea negativo. Imprime 1 cifra.
		 * 
		 * Prueba 2: introducimos un número (Ej. 123), esperamos que entre en el bucle y
		 * vaya calculando las cifras. Imprime 3 cifras.
		 */

		// Declaración de variables
		// Variable que guarda el número del usuario
		int num;
		// Variable que guarda el número cuando le quitamos cifras
		int numCifra;
		// Variable que guarda la cantidad de cifras del número siempre la cifra va a
		// tener mínimo una cifra (inicializamos a 1)
		int cifra = 1;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario un número entero
		System.out.println("Introduce un número entero: ");
		num = reader.nextInt();

		// Le damos el valor del número introducido a número por cifra para hacer los
		// cálculos
		numCifra = num;

		// Creamos un if que si el número es negativo lo convierte en positivo
		if (numCifra < 0) {
			numCifra *= -1;
		}

		// Creamos el while que si el número es mayor que 9 entonces tiene más de una
		// cifra
		while (numCifra > 9) {

			// Le vamos quitando cifra por cifra al número
			numCifra /= 10;

			// Aumentamos la cantidad de cifras
			cifra++;
		}

		// Imprimimos el resultado
		System.out.println("El número de cifras de " + num + " es " + cifra);

		// Cerramos el Scanner
		reader.close();
	}
}
