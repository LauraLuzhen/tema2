package dowhile;

//Importamos el Random
import java.util.Random;
//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda un número random
		int numRandom;
		// Variable que guarda la respuesta del usuario
		String respuesta;
		// Variable que guarda el mínimo del rango
		int min = 1;
		// Variable que guarda el máximo del rango
		int max = 101;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un objeto de tipo random
		Random rand = new Random();

		// Creamos un do-while que se sale del bucle cuando el usuario introduce igual
		do {
			// Generamos un número random
			numRandom = rand.nextInt(min, max);
			System.out.println(numRandom);

			// Le preguntamos al usuario
			System.out.println("¿Es menor, mayor o igual? ");
			respuesta = reader.next();

			// Creamos un if que cambie el valor del máximo si el nº que hay que adivinar es
			// menor que el random
			if (respuesta.equalsIgnoreCase("menor")) {
				max = numRandom + 1;
			}
			// Creamos un if que cambie el valor del mínimo si el nº que hay que adivinar es
			// mayor que e random
			if (respuesta.equalsIgnoreCase("mayor")) {
				min = numRandom;
			}
		} while (!respuesta.equalsIgnoreCase("igual"));

		// Imprimimos que hemos terminado el juego
		System.out.println("fin");

		// Cerramos el Scanner
		reader.close();
	}
}
