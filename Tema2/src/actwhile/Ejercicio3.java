package actwhile;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaracón de variables
		// Variable que guarda el número introducido por el usuario
		int num;
		// Variable que guarda el número de números introducidos por el usuario
		int contador = 0;
		// Variable que guarda la suma de los números introducidos por el usuario
		int suma = 0;
		// Variable que calcula la media
		double media;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos un número entero al usuario
		System.out.println("Introduce un número entero: ");
		num = reader.nextInt();

		// Creamos un while que vaya sumando los valores de los números y vaya contando
		// la cantidad
		// Salimos del while cuando el número introducido por el usuario sea negativo
		while (num >= 0) {
			suma += num;
			contador += 1;

			System.out.println("Introduce un número entero: ");
			num = reader.nextInt();
		}

		// Creamos if-else que si el usuario no introduce ningún número positivo no se
		// hace la media
		if (contador != 0) {
			media = suma / contador;
			System.out.println("La media es de: " + media);
		} else {
			System.out.println("Introduce algún número que sea positivo o cero.");
		}

		// Cerramos el Scanner
		reader.close();
	}
}