package dowhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la respuesta del jugador 1
		String jugador1;
		// Variable que guarda la respuesta del jugador 2
		String jugador2;
		// Variable que guarda la respuesta si se vuelve o no a jugar
		String jugar;

		// Constantes
		// Constante que guarda el valor piedra
		final String PIEDRA = "PIEDRA";
		// Constante que guarda el valor tijeras
		final String TIJERAS = "TIJERAS";
		// Constante que guarda el valor papel
		final String PAPEL = "PAPEL";

		// Creamos un Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que vuelve al bucle si el usuario introduce S
		do {

			// Creamos un do-while que le pregunta la jugada al jugador 1
			do {
				System.out.println("Hola jugador 1: ¿PIEDRA, PAPEL O TIJERAS? ");
				jugador1 = reader.next();
			} while (!jugador1.equals(PIEDRA) && !jugador1.equals(PAPEL) && !jugador1.equals(TIJERAS));

			// Creamos un do-while que le pregunta la jugada al jugador 2
			do {
				System.out.println("Hola jugador 2: ¿PIEDRA, PAPEL O TIJERAS? ");
				jugador2 = reader.next();
			} while (!jugador2.equals(PIEDRA) && !jugador2.equals(PAPEL) && !jugador2.equals(TIJERAS));

			// Creamos un if-else que compara las respuestas de los dos jugadores e imprime
			// quién ha ganado o si han quedado empate
			if (jugador1.equals(jugador2)) {
				System.out.println("EMPATE");
			} else if ((jugador1.equals(PIEDRA) && jugador2.equals(TIJERAS))
					|| (jugador1.equals(PAPEL) && jugador2.equals(PIEDRA))
					|| (jugador1.equals(TIJERAS) && jugador2.equals(PAPEL))) {
				System.out.println("El jugador 1 ha ganado");
			} else if ((jugador2.equals(PIEDRA) && jugador1.equals(TIJERAS))
					| (jugador2.equals(PAPEL) && jugador1.equals(PIEDRA))
					|| (jugador2.equals(TIJERAS) && jugador1.equals(PAPEL))) {
				System.out.println("El jugador 2 ha ganado");
			}

			// Le preguntamos al usuario si quiere seguir jugando
			System.out.println("¿Continúas jugando? ");
			jugar = reader.next();
		} while (jugar.equalsIgnoreCase("S"));

		// Imprimimos que ha terminado el juego
		System.out.println("Fin del juego");

		// Cerramos el Scanner
		reader.close();
	}
}
