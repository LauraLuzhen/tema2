package ifelse;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variable que guarda el número que dice el usuario
		int num;

		// Le pedimos al usuario un nº entre [0-99999]
		System.out.println("Dime un número entero entre el 0 y el 99999: ");
		num = reader.nextInt();

		// Creamos un if-else que compruebe que sea un número entre el rango definido
		if (0 <= num && num <= 99999) {
			// Creamos un if-else que diga las cifras que tenga el número
			if (num <= 9) {
				System.out.println("El número introducido tiene 1 cifra.");
			} else if (num >= 10 && num <= 99) {
				System.out.println("El número introducido tiene 2 cifras.");
			} else if (num >= 100 && num <= 999) {
				System.out.println("El número introducido tiene 3 cifras.");
			} else if (num >= 1000 && num <= 9999) {
				System.out.println("El número introducido tiene 4 cifras.");
			} else {
				System.out.println("El número introducido tiene 5 cifras.");
			}
		} else {
			System.out.println("El número introducido no está en el rango establecido.");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
