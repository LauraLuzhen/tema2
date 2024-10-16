package actwhile;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la altura del árbol que introduce el usuario
		int alturaArbol;
		// Variable que guarda la altura del árbol más alto
		int arbolAlto;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario la altura del árbol
		System.out.println("Introduce la altura del árbol (cm): ");
		alturaArbol = reader.nextInt();

		// Inicializamos el árbol más alto como la altura del primer árbol introducido
		arbolAlto = alturaArbol;

		// Creamos un while que inicie siempre cuando sea diferenta a -1
		while (alturaArbol != -1) {
			// Creamos un if-else que si hay un árbol que supere al más alto cambie el valor
			// del árbol más alto
			if (arbolAlto <= alturaArbol) {
				arbolAlto = alturaArbol;
			}

			// Le volvemos a pedir al usuario una altura
			System.out.println("Introduce la altura del árbol (cm): ");
			alturaArbol = reader.nextInt();
		}

		// Imprimimos la altura del árbol más alto si es -1 no se considera un valor
		// correcto
		System.out.println(arbolAlto != 1 ? arbolAlto : "Introduce un valor válido.");

		// Cerramos el Scanner
		reader.close();
	}
}
