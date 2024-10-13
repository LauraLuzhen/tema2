package condicionales;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducimos un número entero positivo, esperamos el mismo número,
		 * obtenemos el mismo número ya que es su absoluto. Por ejemplo, 9 su absoluto
		 * es 9.
		 * 
		 * Prueba 2: introducimos un número entero negativo, esperamos su número
		 * absoluto, obtenemos el mismo número pero en positivo ya que es su absoluto.
		 * Por ejemplo, -1 su absoluto es 1.
		 */

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variable que guarda el número que introduce el usuario
		int num;
		// Variable que guarda el número en valor absoluto
		int numAbsoluto;

		// Le pedimos al usuario un número entero
		System.out.println("Introduce un número entero (positivo o negativo): ");
		num = reader.nextInt();

		// Creamos un ternario
		numAbsoluto = num < 0 ? -num : num;

		// Imprimimos por pantalla el resultado
		System.out.println("El número " + num + " en valor absoluto es: " + numAbsoluto);

		// Cerramos el Scanner
		reader.close();
	}
}
