package dowhile;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que inicializa con el valor 0
		int num = 0;

		// Creamos un do-while que vaya aumentado de 2 en 2 y lo imprima. Se sale del
		// bucle cuando llega a 200
		do {
			num += 2;
			System.out.println(num);
		} while (num < 200);
	}
}
