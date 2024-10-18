package dowhile;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que inicia con el valor 1
		int num = 1;

		// Creamos un do-while que va a ir imprimiendo el valor de num y lo aumenta. Se
		// sale del bucle cuando llega a 20
		do {
			System.out.println(num);
			++num;
		} while (num <= 20);
	}
}
