package actwhile;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuaio
		int num;
		// Variable que va a ir guardando los números introducidos por el usuario y los
		// va a ir sumando
		int suma = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario un número entero
		System.out.println("Introduce un número entero: ");
		num = reader.nextInt();

		// Creamos un while que suma los números que introduce el usuario y para la suma
		// cuando el número introducido es negativo
		while (num >= 0) {
			suma += num;

			// Le volvemos a pedir un número al usuario
			System.out.println("Introduce un número entero: ");
			num = reader.nextInt();
		}

		// Imprimimos la suma final
		System.out.println(suma);

		// Cerramos el Scanner
		reader.close();
	}
}
