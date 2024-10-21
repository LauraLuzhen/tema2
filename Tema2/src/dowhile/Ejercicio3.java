package dowhile;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda va aumnetado 1 cuando suma
		int aumento = 1;
		// Variable que va sumando cada aumento
		int suma = 0;
		// Variable que guarda el número del usuario
		int numUsario;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un do-while que sale del bucle cuando el número introducido es igual
		// o mayor que 0
		do {
			System.out.println("Introduce un número entero: ");
			numUsario = reader.nextInt();
		} while (numUsario < 0);

		// Creamos un while que va sumando a la var. suma el aumento y va aumentado 1 a
		// la var. aumento siempre que aumento sea menor o igual al numUsuario
		while (aumento <= numUsario) {
			suma += aumento;
			++aumento;
		}

		// Imprimimos la suma
		System.out.println(suma);

		// Cerramos el Scanner
		reader.close();
	}
}
