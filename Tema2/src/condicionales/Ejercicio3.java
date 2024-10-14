package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducimos un nº mayor a 8 cifras o menor a 8 cifras, esperamos
		 * que imprima el mensaje de error. Por ejemplo, 12 debe imprimir el mensaje
		 * "El número introducido no corresponde a los de un DNI.".
		 * 
		 * Prueba 2: introducimos un número válido para un DNI (8 cifras), debe calcular
		 * la letra correspondiente e imprimirla por pantalla. Por ejemplo, introducimos
		 * 11111111 le corresponde la letra H.
		 */

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variable que guarda el dni
		int dni;
		// Variable que guarda la letra del DNI
		String letra;
		// Variable que calcula la letra del DNI
		int calculoLetra;
		// Variable que fija el valor para obetener la letra en el DNI
		final int numFijo = 23;

		// Le pedimos el DNI al usuario
		System.out.println("Introduce los números de su DNI: ");
		dni = reader.nextInt();

		// Creamos un if-else para saber si los números introducidos pertenecen a un DNI
		// Si el número puede ser un dni creamos un switch que calcule la letra que le
		// corresponde según el valor
		if (dni <= 99999999 && dni >= 10000000) {
			calculoLetra = dni % numFijo;
			letra = switch (calculoLetra) {
			case 0 -> {
				yield "T";
			}
			case 1 -> {
				yield "R";
			}
			case 2 -> {
				yield "W";
			}
			case 3 -> {
				yield "A";
			}
			case 4 -> {
				yield "G";
			}
			case 5 -> {
				yield "M";
			}
			case 6 -> {
				yield "Y";
			}
			case 7 -> {
				yield "F";
			}
			case 8 -> {
				yield "P";
			}
			case 9 -> {
				yield "D";
			}
			case 10 -> {
				yield "X";
			}
			case 11 -> {
				yield "B";
			}
			case 12 -> {
				yield "N";
			}
			case 13 -> {
				yield "J";
			}
			case 14 -> {
				yield "Z";
			}
			case 15 -> {
				yield "S";
			}
			case 16 -> {
				yield "Q";
			}
			case 17 -> {
				yield "V";
			}
			case 18 -> {
				yield "H";
			}
			case 19 -> {
				yield "L";
			}
			case 20 -> {
				yield "C";
			}
			case 21 -> {
				yield "K";
			}
			case 22 -> {
				yield "E";
			}
			default -> {
				yield "El número introducido no corresponde a los de un DNI";
			}
			};
			// Imprimimos la letra que le pertenece al DNI
			System.out.println("El DNI " + dni + " corresponde con la letra " + letra);
		} else {
			System.out.println("El número introducido no corresponde a los de un DNI.");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
