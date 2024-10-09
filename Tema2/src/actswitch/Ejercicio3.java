package actswitch;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		//Declaración de variables
		//Variable que guarda el primer número del usuario
		int num1;
		//Variable que guarda el segundo número del usuario
		int num2;
		//Variable que guarda la elección del usuario
		String eleccion;
		
		//Le pedimos al usuario los dos números
		System.out.println("Introduce un número entero: ");
		num1 = reader.nextInt();
		System.out.println("Introduce otro número enter: ");
		num2 = reader.nextInt();
		//Imprimimos por pantalla el índice y la consola espera por una respuesta
		System.out.println("Introduce A, B, C o D según tu elección: \nA. SUMAR LOS NÚMEROS\nB. RESTAR LOS NÚMEROS\nC.MULTIPLICAR LOS NÚMEROS\nD. DIVIDIR LOS NÚMEROS");
		eleccion = reader.next();
		
		//Creamos un switch que según la elección del usuario realiza una operación u otra
		switch (eleccion) {
		case "A" -> System.out.println(num1 + num2);
		case "B" -> System.out.println(num1 - num2);
		case "C" -> System.out.println(num1 * num2);
		case "D" -> System.out.println(num1 / num2);
		default -> System.out.println("Los datos introducidos son incorrectos.");
		}
		//Cerramos el Scanner
		reader.close();
	}
}
