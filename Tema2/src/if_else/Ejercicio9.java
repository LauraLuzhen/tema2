package if_else;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Variable que guarda la jugada del jugador 1
		String jugador1;
		// Variable que guarda la jugada del jugador 2
		String jugador2;
		// Variable que guarda un posible resultado
		final String PIEDRA = "PIEDRA";
		// Variable que guarda un posible resultado
		final String TIJERAS = "TIJERAS";
		// Variable que guarda un posible resultado
		final String PAPEL = "PAPEL";

		// Le pedimos al jugador 1 la jugada que va a hacer
		System.out.println("Hola jugador 1, escriba 'PIEDRA' 'PAPEL' ' TIJERAS': ");
		jugador1 = reader.nextLine();

		// Le pedimos al jugador 2 la jugada que va a hacer
		System.out.println("Hola jugador 2, escriba 'PIEDRA' 'PAPEL' 'TIJERAS");
		jugador2 = reader.nextLine();

		// Creamos un if-else que compare ambos resultados e imprima quién ha ganado
		if (jugador1.equals(jugador2)) {
			System.out.println("EMPATE");
		} else if ((jugador1.equals(PIEDRA) && jugador2.equals(TIJERAS)) || (jugador1.equals(PAPEL) && jugador2.equals(PIEDRA))
				|| (jugador1.equals(TIJERAS) && jugador2.equals(PAPEL))) {
			System.out.println("El jugador 1 ha ganado");
		} else if ((jugador2.equals(PIEDRA) && jugador1.equals(TIJERAS)) | (jugador2.equals(PAPEL) && jugador1.equals(PIEDRA))
				|| (jugador2.equals(TIJERAS) && jugador1.equals(PAPEL))) {
			System.out.println("El jugador 2 ha ganado");
		} else {
			System.out.println("Introduce un valor permitido");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
