package actswitch;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variable que guarda la nota del usuario
		int nota;

		// Le pedimos la nota al usuario
		System.out.println("Dime tu nota: ");
		nota = reader.nextInt();

		// Creamos un switch para imprimir por pantalla el resultado según el valor de
		// nota
		switch (nota) {
		case 0, 1, 2, 3, 4 -> System.out.println("INSUFICIENTE");
		case 5 -> System.out.println("SUFICIENTE");
		case 6 -> System.out.println("BIEN");
		case 7, 8 -> System.out.println("NOTABLE");
		case 9, 10 -> System.out.println("SOBRESALIENTE");
		default -> System.out.println("Introduce una nota del 0 al 10.");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
