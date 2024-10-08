package if_else;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variable que guarda el primer nº dado por el usuario
		int num1;
		// Variable que guarda el segundo nº dado por el usuario
		int num2;
		// Variable que guarda el tercer nº dado por el usuario
		int num3;

		// Le pedimos el primer nº
		System.out.println("Dime le primer número entero: ");
		num1 = reader.nextInt();

		// Le pedimos el segundo nº
		System.out.println("Dime el segundo número entero: ");
		num2 = reader.nextInt();

		// Le pedimos el tercer nº
		System.out.println("Dime el tercer número entero: ");
		num3 = reader.nextInt();

		// Creamos un if-else que imprima por pantalla si la suma de dos de ellos den el
		// otro nº
		if (num1 + num2 == num3) {
			System.out.println("La suma de ambos números dan el otro");
		} else if (num1 + num3 == num2) {
			System.out.println("La suma de ambos números dan el otro");
		} else if (num2 + num3 == num1) {
			System.out.println("La suma de ambos números dan el otro");
		} else {
			System.out.println("La suma de ambos números dan otro número diferente al otro");
		}
		
		//Cerramos el Scanner
		reader.close();
	}
}
