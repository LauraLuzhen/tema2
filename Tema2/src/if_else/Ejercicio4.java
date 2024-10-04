package if_else;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variable que guarda un nº dado por el usuario
		int num1;
		// Variable que guarda otro nº dado por el usuario
		int num2;

		// Le pedimos al usuario dos números
		System.out.println("Dime dos números enteros: ");

		// La consola espera por dos números
		num1 = reader.nextInt();
		num2 = reader.nextInt();

		// Creamos un if-else que ordene los dos números de menor a mayor e imprimirlo
		if (num1 < num2) {
			System.out.println(num1 + " < " + num2);
		} else if (num2 < num1) {
			System.out.println(num2 + " < " + num1);
		} else {
			System.out.println(num1 + " = " + num2);
		}

		// Cerramos el Scanner
		reader.close();
	}
}
