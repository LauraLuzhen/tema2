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
		// Variable número más grande
		int numMayor;
		// Variable número más pequeño
		int numMenor;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos dos números enteros al usuario y que no sean negativos ni iguales
		do {
			System.out.println("Introduce el número A: ");
			numA = reader.nextInt();
			System.out.println("Introduce el número B: ");
			numB = reader.nextInt();
		} while (numA < 0 || numB < 0 || numA == numB);

		// Creamos un if-else que comprube cuál es el número más grande entre A y B
		if (numA < numB) {
			numMenor = numA;
			numMayor = numB;
		} else {
			numMenor = numB;
			numMayor = numA;
		}

		// Creamos un for que imprima del número menor al mayor uno por uno
		for (int i = numMenor; i <= numMayor; i++) {
			System.out.println(i);
		}

		// Cerramos el Scanner
		reader.close();
	}
}
