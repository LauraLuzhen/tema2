package if_else;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Declaración de variables
		// Varibales que guardan los coeficientes
		int a;
		int b;
		int c;
		// Variable que guarda el valor dentro de la raiz
		double dentroRaiz;
		// Variable que guarda la raiz en la operación de la ec. de segundo grado
		double raizCuadrada;
		// Variable que guarda los cálculos para obtener las soluciones de la ecuación
		// Variable para solución positiva
		double operacionPositivo;
		// Variable para solucón negativa
		double operacionNegativo;

		// Le pedimos al usuario el coeficiente a
		System.out.println("Dime el coeficiente a en una ecuación de segundo grado: ");
		a = reader.nextInt();

		// Le pedimos al usuario el coefibiente b
		System.out.println("Dime el coeficiente b en una ecuación de segundo grado: ");
		b = reader.nextInt();

		// Le pedimos al usuario el coeficiente c
		System.out.println("Dime el coeficiente c en uan ecuación de segundo grado: ");
		c = reader.nextInt();

		// Calculamos el contenido dentro de la raíz cuadrada
		dentroRaiz = (b * b) - (4 * a * c);

		// Creamos un if-else para calcular las posibles soluciones de la ecuación de
		// segundo grado e indicar si no exite solución
		if (dentroRaiz < 0) {
			// Al ser el contenido dentro de la raiz un número negativo no existe solución
			System.out.println("La ecuación planteada no tiene solución.");
		} else {
			// Si no es un nº negativo calculamos la raíz cuadrada y las dos posibles
			// soluciones de la ecuación de segundo grado
			raizCuadrada = Math.sqrt((b * b) - (4 * a * c));
			operacionPositivo = (-b + raizCuadrada) / (2 * a);
			operacionNegativo = (-b - raizCuadrada) / (2 * a);
			System.out.println("Las soluciones de la ecuación son: " + operacionPositivo + " y " + operacionNegativo);
		}

		// Cerramos el Scanner
		reader.close();
	}
}
