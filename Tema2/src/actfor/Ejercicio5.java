package actfor;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int num;
		// Variable que va calculando el factorial del número
		int factorial = 1;

		// Creamos un Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos un número entero al usuario
		System.out.println("Introduce un número entero: ");
		num = reader.nextInt();

		// Creamos un for que vaya calculando el factorial del número introducido
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}

		// Imprimimos el factorial
		System.out.println("El factorial de " + num + " es: " + factorial);

		// Cerramos el Scanner
		reader.close();
	}
}
