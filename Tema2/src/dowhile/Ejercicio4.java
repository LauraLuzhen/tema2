package dowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que va a aumentar del 1 al 10 para multiplicarlo con el nº del
		// usuario
		int num = 1;
		// Variable que guarda el número introducido por el usuario
		int numUsuario;
		// Varibale que gurda la multiplicación entre el número y el del usuario
		int multiplicacion;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario un número entero
		System.out.println("Introduce un número entero: ");
		numUsuario = reader.nextInt();

		// Creamos un do-while que multiplique el número del usuario del 1-10 y lo
		// imprima. Sale del bucle cuando llega a 10
		do {
			multiplicacion = numUsuario * num;
			System.out.println(numUsuario + " x " + num + " = " + multiplicacion);
			++num;
		} while (num <= 10);

		// Cerramos el Scanner
		reader.close();
	}
}
