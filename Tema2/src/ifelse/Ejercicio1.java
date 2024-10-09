package ifelse;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos el Scanner llamado reader
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variables que almacena el número del usuario
		int num;

		// Pedimos al usuario un número
		System.out.println("Dime un número entero: ");
		num = reader.nextInt();

		// Creamos un if-else para comrobar si el nº es par o impar y que imprima el
		// resultado por pantalla
		if (num % 2 == 0) {
			System.out.println("El número " + num + " es par.");
		} else {
			System.out.println("El número " + num + " es impar.");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
