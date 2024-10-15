package condicionales;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducir un número fuera del rango (1-99), debe imprimir el
		 * mensaje de error. Por ejemplo, si ponemos -1 imprime
		 * "El valor introducido es erróneo".
		 * 
		 * Prueba 2: introducir un número dentro del rango (1-99), debe imprimir el
		 * número pero en cadena. Por ejemplo, si ponemos 78 imprime "setenta y ocho".
		 */

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variable que guarda el número introducido por el usuario
		int num;
		// Variable que calcule las unidades
		int unidades;
		// Variable que calcule las decenas
		int decenas;
		// Variable que guarda el valor de la unidad
		String valorUnidades;
		// Variable que guarda el valor de la decena
		String valorDecenas;

		// Le pedimos un número al usuario
		System.out.println("Introduce un número entero entre el 1-99: ");
		num = reader.nextInt();

		// Creamos un if-else para comprobar que le número introducido está dentro del
		// rango establecido
		if (num <= 99 && num >= 1) {
			// Creamos un switch que según el valor lo imprima con letras por pantalla
			switch (num) {
			case 1 -> System.out.println("uno");
			case 2 -> System.out.println("dos");
			case 3 -> System.out.println("tres");
			case 4 -> System.out.println("cuatro");
			case 5 -> System.out.println("cinco");
			case 6 -> System.out.println("seis");
			case 7 -> System.out.println("siete");
			case 8 -> System.out.println("ocho");
			case 9 -> System.out.println("nueve");
			case 10 -> System.out.println("diez");
			case 11 -> System.out.println("once");
			case 12 -> System.out.println("doce");
			case 13 -> System.out.println("trece");
			case 14 -> System.out.println("catorce");
			case 15 -> System.out.println("quince");
			default -> {
				decenas = num / 10;
				unidades = num % 10;
				valorDecenas = switch (decenas) {
				case 1 -> {
					yield "dieci";
				}
				case 2 -> {
					if (unidades == 0) {
						yield "veinte";
					} else {
						yield "veinti";
					}
				}
				case 3 -> {
					if (unidades == 0) {
						yield "treinta";
					} else {
						yield "treinta y ";
					}
				}
				case 4 -> {
					if (unidades == 0) {
						yield "cuarenta";
					} else {
						yield "cuarenta y ";
					}
				}
				case 5 -> {
					if (unidades == 0) {
						yield "cincuenta";
					} else {
						yield "cincuenta y ";
					}
				}
				case 6 -> {
					if (unidades == 0) {
						yield "sesenta";
					} else {
						yield "sesenta y ";
					}
				}
				case 7 -> {
					if (unidades == 0) {
						yield "setenta";
					} else {
						yield "setenta y ";
					}
				}
				case 8 -> {
					if (unidades == 0) {
						yield "ochenta";
					} else {
						yield "ochenta y ";
					}
				}
				case 9 -> {
					if (unidades == 0) {
						yield "noventa";
					} else {
						yield "noventa y ";
					}
				}
				default -> {
					yield "El valor introducido es erróneo.";
				}
				};
				valorUnidades = switch (unidades) {
				case 1 -> {
					yield "uno";
				}
				case 2 -> {
					yield "dos";
				}
				case 3 -> {
					yield "tres";
				}
				case 4 -> {
					yield "cuatro";
				}
				case 5 -> {
					yield "cinco";
				}
				case 6 -> {
					yield "seis";
				}
				case 7 -> {
					yield "siete";
				}
				case 8 -> {
					yield "ocho";
				}
				case 9 -> {
					yield "nueve";
				}
				default -> {
					yield "El valor introducido es erróneo.";
				}
				};
				if (unidades == 0) {
					System.out.println(valorDecenas);
				} else {
					System.out.println(valorDecenas + valorUnidades);
				}
			}
			}
		} else {
			System.out.println("El valor introducido es erróneo.");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
