package actswitch;

//Importamos el Scanner
import java.util.Scanner;

public class Ejericico5 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variable que guarda la letra del tipo de carnet
		String tipoCarnet;

		// Le preguntamos al usuario qué tipo de carnet tiene
		System.out.println("¿Qué tipo de carnet tiene? (E, D, C1-C5, A, B1-B2): ");
		tipoCarnet = reader.next();

		// Creamos un switch que imprima por pantalla el tipo de vehículo que puede
		// conducir según la letra del carnet que tenga el usuario
		switch (tipoCarnet) {
		case "E" -> System.out.println("Remolques");
		case "D" -> System.out.println("Autobuses");
		case "C1", "C2", "C3", "C4", "C5" -> System.out.println("Camiones");
		case "A" -> System.out.println("Motocicletas");
		case "B1", "B2" -> System.out.println("Automóviles");
		default -> System.out.println("Categoría no contemplada");
		}

		// Cerramos la consola
		reader.close();
	}
}
