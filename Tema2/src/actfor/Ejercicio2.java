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

		// Creamos un for que imprima los múltiplos de 3
		for (int i = 0; i <= num; i+=3) {
			System.out.println(i);
		}

		// Cerramos el Scanner
		reader.close();
	}
}
