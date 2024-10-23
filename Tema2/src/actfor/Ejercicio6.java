package actfor;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la nota de cada alumno
		double nota;
		// Variable que guarda el número de suspensos que hay
		int suspenso = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un for que le pida 5 notas al usuario y compruebe si es suspenso o no
		// y los vaya contando
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce la nota de un alumno: ");
			nota = reader.nextDouble();

			if (nota < 5) {
				suspenso++;
			}
		}

		// Imprimimos el número de suspensos
		System.out.println("Suspensos: " + suspenso);

		// Cerramos el Scanner
		reader.close();
	}
}
