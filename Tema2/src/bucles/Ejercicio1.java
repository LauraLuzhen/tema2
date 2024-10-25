package bucles;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducir un número negativo (Ejemplo: -1), debe preguntar de
		 * nuevo al usuario. Resultado: se repite el bucle haciendo otra vez la
		 * pregunta.
		 * 
		 * Prueba 2: introducimos los datos correctos (Ejemplo: 2h 55min 43s y 30s a
		 * incrementar), debe modificar todos los datos menos las horas. Resultado:
		 * 02:56:13
		 */

		// Declaración de variables
		// Variable que guarda el número de horas
		int hora;
		// Variable que guarda el número de minuros
		int minuto;
		// Variable que guarda el número de segundos
		int segundo;
		// Variable que guarda el número de segundos incrementados
		int segundoIncremento;
		// Variable que guarda el cálculo de los minutos totales
		int calculoMinuto;
		// Variable que guarda el cálculo de las horas totales
		int calculoHora;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que sólo permita valores en las variables de números
		// enteros positivos (hora, minuto, segundo y segundoIncremento)
		// Si no se cumple le volverá a preguntar al usuario
		do {
			System.out.println("Introduce las horas: ");
			hora = reader.nextInt();
		} while (hora < 0);

		do {
			System.out.println("Introduce los minutos: ");
			minuto = reader.nextInt();
		} while (minuto < 0);

		do {
			System.out.println("Introduce los segundos: ");
			segundo = reader.nextInt();
		} while (segundo < 0);

		do {
			System.out.println("Introduce los segundos a incrementar: ");
			segundoIncremento = reader.nextInt();
		} while (segundoIncremento < 0);


		for (int i=0; i<segundoIncremento; i++) {
			segundo += 1;
			
			// Creamos un if que si los segundos son mayores de 60 los guarde en el cálculo
			// de minutos
			if (segundo >= 60) {
				calculoMinuto = segundo / 60;
				segundo %= 60;
				minuto += calculoMinuto;
			}

			// Creamos un if que si los minutos son mayores de 60 los guarde en el cálculo
			// de horas
			if (minuto >= 60) {
				calculoHora = minuto / 60;
				minuto %= 60;
				hora += calculoHora;
			}
			
			if (hora>=24) {
				hora %= 24;
			}

			// Imprimimos el resultado final
			System.out.println(hora + ":" + minuto + ":" + segundo);
		}

		
		// Cerramos el Scanner
		reader.close();
	}
}
