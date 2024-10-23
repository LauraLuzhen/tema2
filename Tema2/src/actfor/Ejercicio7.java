package actfor;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int num;
		// Variable que guarda el resto de la división
		int resto;
		// Variable que cuenta los divisores del número
		int divisores = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que sólo permite un número positivo entero
		do {
			System.out.println("Introduce un número entero: ");
			num = reader.nextInt();
		} while (num < 0);

		// Creamos un for que vaya calculando el resto por cada número y cuenta cuántos
		// divisores tiene
		for (int i = 1; i <= num; i++) {
			resto = num % i;
			if (resto == 0) {
				divisores++;
			}
		}

		// Creamos un if-else que indica según el contador del resto si el número es
		// primo o no
		if (divisores == 2) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
