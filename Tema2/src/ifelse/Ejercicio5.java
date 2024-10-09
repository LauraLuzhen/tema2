package ifelse;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variable que guarda un número dado por el usuario
		int num1;
		// Variable que guarda otro número dado por el usuario
		int num2;
		// Variable que guarda otro nº dado por el usuario
		int num3;

		// Le pedimos tres números al usuario
		System.out.println("Dime tres números enteros: ");
		num1 = reader.nextInt();
		num2 = reader.nextInt();
		num3 = reader.nextInt();

		// Creamos un if-else para ordenar de menor a mayor los 3 nº e imprimirlo por
		// pantalla
		if (num1 < num2 && num1 < num3) {
			if (num2 < num3) {
				System.out.println(num3 + " > " + num2 + " > " + num1);
			} else {
				System.out.println(num2 + " > " + num3 + " > " + num1);
			}
		} else if (num2 < num1 && num2 < num3) {
			if (num1 < num3) {
				System.out.println(num3 + " > " + num1 + " > " + num2);
			} else {
				System.out.println(num1 + " > " + num3 + " > " + num2);
			}
		} else if (num1 < num2) {
			System.out.println(num2 + " < " + num1 + " < " + num3);
		} else {
			System.out.println(num1 + " < " + num2 + " < " + num3);
		}

		// Cerramos el Scanner
		reader.close();
	}
}
