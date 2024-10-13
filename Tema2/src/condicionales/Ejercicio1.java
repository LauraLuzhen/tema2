package condicionales;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: valor numérico entero menor a 0 y mayor a 9999, esperamos un valor
		 * erróneo y debe imprimir que el valor introducido es erróneo.
		 * 
		 * Prueba 2: valor numérico entero entre el 0-9, al ser de un dígito el nº
		 * siempre es capicúa, debe imprimir que es un nº capicúa.
		 * 
		 * Prueba 3: valor numérico entero entre el 10-99, imprime que es capicúa si
		 * ambos dígitos son iguales, por ejemplo 12 no es capicúa y 22 sí lo es.
		 * 
		 * Prueba 4: valor numérico entero entre el 100-999, imprime que es capicúa si
		 * el primer y tercer dígito son iguales, por ejemplo 123 no es capicúa y 121 sí
		 * lo es.
		 * 
		 * Prueba 5: valor numérico entero entre el 1000-9999, imprime que es capicúa si
		 * el primer y cuarto dígito son iguales y el segundo y tercero también, por
		 * ejemplo 1234 no es capicúa y 1221 sí lo es.
		 */
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int num;
		// Variables que guardan el valor de uno de los dígitos que componen el número
		int digito1;
		int digito2;
		int digito3;
		int digito4;

		// Le pedimos al usuario que introduzca un número entero
		System.out.println("Introduce un número entero entre 0-9999: ");
		num = reader.nextInt();

		// Creamos un if-else que compruebe cuántos dígitos tiene el nº y si está dentro
		// del rango establecido
		// Una vez que sabemos cuántos dígitos tiene el número comparamos con un if-else
		// cada dígito para saber si es o no capicúa
		if (num >= 0 && num <= 9) {
			System.out.println("El número " + num + " es capicúa.");
		} else if (num >= 10 && num <= 99) {
			digito1 = num / 10;
			digito2 = num % 10;
			if (digito1 == digito2) {
				System.out.println("El número " + num + " es capicúa.");
			} else {
				System.out.println("El número " + num + " no es caipúa.");
			}
		} else if (num >= 100 && num <= 999) {
			digito1 = num / 100;
			digito2 = (num % 100) % 10;
			if (digito1 == digito2) {
				System.out.println("El número " + num + " es capicúa.");
			} else {
				System.out.println("El número " + num + " no es capicúa.");
			}
		} else if (num >= 1000 && num <= 9999) {
			digito1 = num / 1000;
			digito2 = (num % 1000) / 100;
			digito3 = ((num % 1000) % 100) / 10;
			digito4 = ((num % 1000) % 100) % 10;
			if (digito1 == digito4 && digito2 == digito3) {
				System.out.println("El número " + num + " es capicúa.");
			} else {
				System.out.println("El número " + num + " no es capicúa.");
			}
		} else {
			System.out.println("El valor introducido es erróneo.");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
