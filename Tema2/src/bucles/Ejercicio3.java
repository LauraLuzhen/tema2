package bucles;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		/*
		 * PRUBEAS MÍNIMAS
		 * 
		 * Prueba 1: introducir algún valor erróneo (Ej. -2), debe de preguntarle otra
		 * vez al usuario.
		 * 
		 * Prueba 2: introducir valroes válidos (Ej. 36 y 24), debe mostrar el MCD de
		 * ambos. Imprime 12, es correcto.
		 */

		// Declaración de variables
		// Variable que guarda el número A del usuario
		int numA;
		// Variable que guarda el número B del usuario
		int numB;
		// Variable que guarda el resto de las divisiones por A
		int restoA;
		// Variable que guarda el resto de las divisiones por B
		int restoB;
		// Variable que guarda el mcd de A y B, lo inicializamos a 1
		int mcd = 1;
		// Variable que guarda el número más pequeño
		int numMin;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que sale del bucle cuando A y B no sean menores de 1 ni
		// iguales entre ellos
		do {
			System.out.println("Introduce el número A: ");
			numA = reader.nextInt();

			System.out.println("Introduce el número B: ");
			numB = reader.nextInt();
		} while (numA < 1 || numB < 1 || numA == numB);

		// Creamos un if-else que compare A y B y elija cuál es el número más pequeño
		if (numA < numB) {
			numMin = numA;
		} else {
			numMin = numB;
		}

		// Creamos un for que desde el número más pequeño vaya dividiendo por ese número
		// entre A y B que va a ir disminuyendo 1 por cada iteración
		for (int i = numMin; i >= 2; i--) {
			// Calculamos el resto de A y B
			restoA = numA % i;
			restoB = numB % i;

			// Creamos un if que si ambos restos son 0 es que i es divisor común de ambos
			if (restoA == 0 && restoB == 0) {
				// Creamos un if para quedarnos con el MCD
				if (i > mcd) {
					mcd = i;
				}
			}
		}

		// Imprimimos el resultado
		System.out.println("El MCD de " + numA + " y " + numB + " es: " + mcd);

		// Cerramos el Scanner
		reader.close();
	}
}
