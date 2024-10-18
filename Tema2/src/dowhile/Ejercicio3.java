package dowhile;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int num = 1;
		int suma = 0;
		int numUsario;
		
		//Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		//Le pedimos al usuario
		System.out.println("Introduce un número entero: ");
		numUsario = reader.nextInt();
		
		//Creamos un do-while
		do {
			suma += num;
			System.out.println(suma);
			num++;
		} while (num <= numUsario);
		
		//Cerramos el Scanner
		reader.close();
	}
}
