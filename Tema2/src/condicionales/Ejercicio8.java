package condicionales;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducimos un valor erróneo, debe saltar el error. Por ejemplo
		 * 200 mes y 200 año, imprime "Introduce un valor válido".
		 * 
		 * Prueba 2: introducimos un mes y un año no bisiesto, debe calcular los días
		 * del mes correspondiente. Por ejemplo, introducimos 1 mes y 2023 año e imprime
		 * 31 días.
		 * 
		 * Prueba 3: introducimos un mes y un año bisiesto, debe calcular los días del
		 * mes en un año bisiesto. Por ejemplo, introducimos 2 mes y 2024 año e imprime
		 * 29 días.
		 */

		// Declaración de variables
		// Variable que guarda el mes
		int mes;
		// Variable que guarda el año
		int año;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario el número del més y el año
		System.out.println("Dime el núemero del mes (1-12): ");
		mes = reader.nextInt();
		System.out.println("Dime el año: ");
		año = reader.nextInt();

		// Comprobamos que los datos introducidos son correctos con un if-else
		// El mes debe estar entre el 1-12 y el año debe ser positivo
		if (mes > 0 && mes < 13 && año > 0) {
			// Creamos un if-else que compruebe si el año es bisiesto (divisible por 4)
			if (año % 4 == 0) {
				if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
					System.out.println("El mes tiene 31 días.");
				} else if (mes == 2) {
					System.out.println("El mes tiene 29 días.");
				} else {
					System.out.println("El mes tiene 30 días.");
				}
			} else {
				if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
					System.out.println("El mes tiene 31 días.");
				} else if (mes == 2) {
					System.out.println("El mes tiene 28 días.");
				} else {
					System.out.println("El mes tiene 30 días.");
				}
			}
		} else {
			System.out.println("Introduce un valor válido.");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
