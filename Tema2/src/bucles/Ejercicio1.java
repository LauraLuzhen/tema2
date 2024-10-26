package bucles;

// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducimos algún valor no válido (Ej. -2), debe volver a
		 * preguntarle al usuario.
		 * 
		 * Prueba 2: introducimos valores válidos (Ej. 2h 2min 45s a incrementar 20s),
		 * debe imrpimir cada segundo que incrementa como un reloj. Imprime 2:2:46 ...
		 * 2:3:5
		 * 
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

		// Creamos un for que vaya aumentando segundo a segundo hasta llegar a los
		// segundos incrementados por el usuario
		for (int i = 0; i < segundoIncremento; i++) {
			// Le sumamos a segundo 1 por cada iteración del bucleF
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

			if (hora >= 24) {
				hora %= 24;
			}

			// Imprimimos el resultado final
			System.out.println(hora + ":" + minuto + ":" + segundo);
		}

		// Cerramos el Scanner
		reader.close();
	}
}
