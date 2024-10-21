package dowhile;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el primer nº del usuario
		int num1;
		// Variable que guarda el segundo nº del usuario
		int num2;
		// Variable que guarda la elección del usuario
		String eleccion;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario los dos números
		System.out.println("Introduce un número entero: ");
		num1 = reader.nextInt();
		System.out.println("Introduce otro número enter: ");
		num2 = reader.nextInt();
		// Imprimimos por pantalla el índice y la consola espera por una respuesta
		System.out.println(
				"Introduce A, B, C o D según tu elección: \nA. SUMAR LOS NÚMEROS\nB. RESTAR LOS NÚMEROS\nC. MULTIPLICAR LOS NÚMEROS\nD. DIVIDIR LOS NÚMEROS\nE. SALIR");
		eleccion = reader.next();

		do {
			// Creamos un switch que según la elección del usuario realiza una operación u
			// otra
			switch (eleccion) {
			case "A" -> System.out.println(num1 + num2);
			case "B" -> System.out.println(num1 - num2);
			case "C" -> System.out.println(num1 * num2);
			case "D" -> System.out.println(num1 / num2);
			}
		} while (!eleccion.equals("E"));
		
		//Imprimimos que ha salido del programa
		System.out.println("FIN");

		// Cerramos el Scanner
		reader.close();
	}
}
