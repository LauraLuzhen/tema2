package if_else;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos el Scanner llamado reader
		Scanner reader = new Scanner(System.in);

		// Declaración de varibales
		// Variables que almacena un número del usuario
		int num1;
		// Variable que almacena otro nº del usuario
		int num2;

		// Pedimos al usuario dos números enteros
		System.out.println("Dime dos números enteros: ");

		// La consola espera por dos nº dados por el usuario
		num1 = reader.nextInt();
		num2 = reader.nextInt();

		// Creamos un if-else para comprobar si los dos nº dados por el usuario son
		// iguales o no y mostrarlo por pantalla
		if (num1 == num2) {
			System.out.println("Los números dados por el ususario son iguales.");
		} else {
			System.out.println("Los números dados por el usuario son distintos.");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
