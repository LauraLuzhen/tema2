package ifelse;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		//Declaración de variables
		//Variable que guarda la nota introducida por el usuario
		double notaUsuario;
		
		//Le pedimos la nota al usuario
		System.out.println("Dime tu nota: ");
		notaUsuario = reader.nextDouble();
		
		//Cramos un if-else para imprimir por pantalla un texto según la nota que haya sacado el usuario
		if (notaUsuario >= 0 && notaUsuario < 5) {
			System.out.println("INSUFICIENTE");
		} else if (notaUsuario >= 5 && notaUsuario < 6) {
			System.out.println("SUFICIENTE");
		} else if (notaUsuario >= 6 && notaUsuario < 7){
			System.out.println("BIEN");
		} else if (notaUsuario >= 7 && notaUsuario < 9) {
			System.out.println("NOTABLE");
		} else if (notaUsuario >= 9 && notaUsuario <= 10) {
			System.out.println("SOBRESALIENTE");
		} else {
			System.out.println("La nota debe estar entre el 0 y el 10.");
		}
		
		//Cerramos el Scanner
		reader.close();
	}
}
