package actwhile;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int num;
		// Variable que guarda el número de veces que introduce un número el usuario
		int contador = 0;
		// Variable que guarda la suma de los números positivos
		int sumaPositivos = 0;
		// Variable que guarda la cantidad de ceros introducidos
		int contadorCeros = 0;
		// Variable que guarda la suma de números negativos
		int sumaNegativos = 0;
		// Variable que guarda la cantidad de números negativos introducidos
		int contadorNegativos = 0;
		// Variable que calcula la media de los números en negativo
		int mediaNegativos;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario un número entero
		System.out.println("Introduce un número entero: ");
		num = reader.nextInt();

		// Creamos un while que sólo acepta 10 números introducidos por el usuario
		while (contador < 10) {
			contador += 1;

			// Creamos un if si el número es positivos que vaya calculando su suma
			if (num > 0) {
				sumaPositivos += num;
			}

			// Creamos un if si el número es cero que los vaya contando
			if (num == 0) {
				contadorCeros += 1;
			}

			// Creamos un if si el número es negativo que los vaya sumando y contando para
			// después calcular su media
			if (num < 0) {
				sumaNegativos += num;
				contadorNegativos += 1;
			}

			System.out.println("Introduce un número entero: ");
			num = reader.nextInt();
		}

		// Imprimimos la suma de positivos
		System.out.println("La suma de números positivos es: " + sumaPositivos);

		// Creamos un if si no hay números negativos que no imprima la media
		if (contadorNegativos != 0) {
			// Calculamos la media de los números negativos
			mediaNegativos = sumaNegativos / contadorNegativos;
			System.out.println("La media de los números negativos es: " + mediaNegativos);
		}

		// Imprimimos la cantidad de ceros que ha introducido el usuario
		System.out.println("Cantidad de ceros introducidos: " + contadorCeros);

		// Cerramos el Scanner
		reader.close();
	}
}
