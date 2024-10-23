package actfor;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número A
		int numA;
		// Variable que guarda el número B
		int numB;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos dos números enteros al usuario
		System.out.println("Introduce el número A: ");
		numA = reader.nextInt();
		System.out.println("Introduce el número B: ");
		numB = reader.nextInt();

		// Creamos un if-else que comprube cuál es el número más grande entre A y B
		if (numA < numB) {
			// Si B es mayor que A imprme los números de A a B
			for (int i = numA; i <= numB; i++) {
				System.out.println(i);
			}
		} else if (numA > numB) {
			// Si A es mayor que B imprime los números de B a A
			for (int i = numB; i <= numA; i++) {
				System.out.println(i);
			}
		} else {
			// Si ambos números son iguales indicarlo
			System.out.println("Introduce dos números diferentes");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
