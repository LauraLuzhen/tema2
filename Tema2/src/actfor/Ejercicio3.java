package actfor;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int num;
		// Variable que guarda la suma de todos los números introducidos
		double suma = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un for que le pida 10 veces un número entero al usuario y los vaya
		// sumano
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un número entero: ");
			num = reader.nextInt();
			suma += num;
		}

		// Imprimimos la media de los 10 números introducidos
		System.out.println("La media de los 10 números es: " + (suma / 10));

		// Cerramos el Scanner
		reader.close();
	}
}
