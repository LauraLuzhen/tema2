package condicionales;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducir un número diferente a la suma, debe imprimir el mensaje
		 * de error. Por ejemplo, 5+5 ponemos 1 e imprime "La suma es errónea".
		 * 
		 * Prueba 2: introducir la suma correcta, debe decirle al usuario que la suma es
		 * correcta. Por ejemplo, 5+5 ponemos 10, imprime "La suma es correcta".
		 */

		// Declaración de variables
		// Variable que guarda el primer número random
		int numRandom1;
		// Variable que guarda el segundo número random
		int numRandom2;
		// Variable que guarda la suma realizada por el usuario
		int sumaUsuario;
		// Variable que guarda la suma entre ambos números
		int suma;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Generamos dos números enteros random del 1-99
		numRandom1 = (int) (Math.random() * 99) + 1 ;
		numRandom2 = (int) (Math.random() * 99) + 1;

		// Imprimimos los dos números randoms por pantalla para que el usuario los sume
		System.out.println("Suma los siguientes números: " + numRandom1 + "+" + numRandom2 + " = ");
		sumaUsuario = reader.nextInt();

		// Sumamos ambos números
		suma = numRandom1 + numRandom2;

		// Creamos un if-else para comprobar si la suma del usuario es correcta
		if (sumaUsuario == suma) {
			System.out.println("La suma es correcta.");
		} else {
			System.out.println("La suma es errónea.");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
