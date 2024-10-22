package actfor;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int num;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos un número al usuario
		System.out.println("Introduce un número entero: ");
		num = reader.nextInt();

		// Creamos un for que imprima del 1 al número del usuario
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}

		// Cerramos el Scanner
		reader.close();
	}
}
