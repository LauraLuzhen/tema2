package condicionales;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducimos 59s 1min 2h, imprime 2h 2min 0s con horas, minutos y
		 * segundos.
		 * 
		 * Prueba 2: introducimos 100 en s, min y h, imprime 4 dias 5h 41 min 41s, esta
		 * vez imprime los días.
		 */

		// Declaración de variables
		// Variable que guarda el valor de los segundos
		int segundos;
		// Variable que guarda el valor de los minutos
		int minutos;
		// Variable que guarda el valor de las horas
		int horas;
		// Variable que guarda el valor de los días
		int dias = 0;
		// Variable que guarda el resultado en cadena
		String resultado;
		// Variable que guarda el cálculo de los minutos a partir de los segundos
		int calculoMinutos;
		// Variable que guarda el cálculo de las horas a partir de los minutos
		int calculoHoras;
		// Variable que guarda el cálculo de los días a partir de las horas
		int calculoDias;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario los segundos, minutos y horas
		System.out.println("Introduce los segundos: ");
		segundos = reader.nextInt();
		System.out.println("Introduce los minutos: ");
		minutos = reader.nextInt();
		System.out.println("Introduce las horas: ");
		horas = reader.nextInt();

		// Aumentamos un segundo a los segundos
		++segundos;

		// Creamos un if-else que aumenta los minutos si los segundos son mayor o igual
		// a 60
		if (segundos >= 60) {
			calculoMinutos = segundos / 60;
			segundos %= 60;
			minutos += calculoMinutos;
		}
		// Creamos un if-else que aumenta las horas si los minutos son mayor o igual a
		// 60
		if (minutos >= 60) {
			calculoHoras = minutos / 60;
			minutos %= 60;
			horas += calculoHoras;
		}
		// Creamos un if-else que aumenta los días si las horas son mayor o igual a 60
		if (horas >= 24) {
			calculoDias = horas / 24;
			horas %= 24;
			dias += calculoDias;
		}

		// Creamos un ternario para imprimir en cadena los días si aparecen
		resultado = dias == 0 ? horas + " horas, " + minutos + " minutos, " + segundos + " segundos"
				: dias + " dias, " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos";

		// Imprimimos el resultado
		System.out.println(resultado);

		// Cerramos el Scanner
		reader.close();
	}
}
