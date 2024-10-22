package actfor;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaración de variables
		int num;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos un número entero al usuario
		System.out.println("Introduce un número entero: ");
		num = reader.nextInt();

		// Creamos un for
		for (int i = 1; i*3 <= num; i++) {
			System.out.println(i*3);
		}

		// Cerramos el Scanner
		reader.close();
	}
}
