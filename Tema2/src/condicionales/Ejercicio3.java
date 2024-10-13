package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

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

			}
			};
		} else {
			System.out.println("El número introducido no corresponde a los de un DNI.");
		}
	}
}
