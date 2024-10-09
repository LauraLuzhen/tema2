package ifelse;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos el Scanner llamado reader
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variable que almacena el nº dado por el usuario
		double num;

		// Pedimos al usuario un número decimal
		System.out.println("Dime un número: ");
		num = reader.nextDouble();

		// Creamos un if-else para saber si el nº del usuario es un nº casi-cero e
		// imprimirlo por pantalla
		if (num > -1 && num < 1 && num != 0) {
			System.out.println("El número " + num + " es un número casi-cero.");
		} else {
			System.out.println("El número " + num + " no es un número casi-cero");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
