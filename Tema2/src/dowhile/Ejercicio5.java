package dowhile;

//Importamos el Random
import java.util.Random;
//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Declaración de variables
		//Variable que guarda el número introducido por el usuario
		int numUsuario;
		//Variable que guarda un número random generado en un rango
		int numRandom;
		//Variable que guarda la respuesta dada por el usuario
		String respuesta;
		
		//Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		//Creamos un Random 
		Random rand = new Random();
		
		//Creamos un do-while que le pida al usuario que introduzca un nº del 1-100 
		do {
			System.out.println("Introduce un número del 1-100: ");
			numUsuario = reader.nextInt();
		} while (numUsuario < 1 || numUsuario > 100);
		
		
		
	
	}
}
