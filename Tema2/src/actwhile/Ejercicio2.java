package actwhile;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int num;
		// Variable que va a ir guardando la cantidad de números introducidos por el
		// usuario
		// La inicializamos a 0 porque el usuario no ha introducido ningún número
		int contador = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario un número entero
		System.out.println("Introduce un número entero: ");
		num = reader.nextInt();

		// Creamos un while que vaya aumentando el contador de números introducidos
		// mientras que el usuario vaya introduciendo números positivo
		while (num >= 0) {
			contador += 1;

			// Le volvemos a pedir un número al usuario
			System.out.println("Introduce un número entero: ");
			num = reader.nextInt();
		}

		// Imprimimos el contator final de números positivos que ha introducido el
		// usuario
		System.out.println(contador);

		// Ceramos el Scanner
		reader.close();
	}
}
