package actwhile;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la edad de cada alumno
		int edad;
		// Variable que guarda el número de alumnos que hay
		int numAlumnos = 0;
		// Variable que guarda la suma de todas las edades
		int sumaEdad = 0;
		// Variable que calcula la media de las edades
		double media;
		// Variable que guarda la constante para que un alumno sea mayor de edad
		final int MAYOR_EDAD = 18;
		// Variable que guarda el número de alumnos que son mayores de edad
		int numMayorEdad = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario la edad de un alumno
		System.out.println("Introduce tu edad: ");
		edad = reader.nextInt();

		// Creamos un while que acepte números positivos
		while (edad >= 0) {
			// Sumamos 1 al contador de número de alumnos
			numAlumnos++;
			// Vamos sumando las edades introducidas
			sumaEdad += edad;

			// Creamos un if-else que verifique si el alumno es mayor de edad y si lo es que
			// lo vaya contando
			if (edad >= 18) {
				numMayorEdad++;
			}

			// Le volvemos a preguntar al usuario por la edad
			System.out.println("Introduce tu edad: ");
			edad = reader.nextInt();
		}

		// Calculamos la media de las edades
		media = (double) sumaEdad / numAlumnos;

		// Imprimimos la suma de las edades
		System.out.println("La suma de las edades es: " + sumaEdad);
		// Imprimimos la media de las edades
		System.out.println("La media de las edades es: " + media);
		// Imprimimos el número de alumnos
		System.out.println("El número total de alumnos es: " + numAlumnos);
		// Imprimimos el número de alumnos que son mayores de edad
		System.out.println("El número de alumnos mayores de edad es: " + numMayorEdad);

		// Cerramos el Scanner
		reader.close();
	}
}
