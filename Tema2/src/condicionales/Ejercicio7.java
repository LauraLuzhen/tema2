package condicionales;

//Importamos el Scanner
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS MÍNIMAS
		 * 
		 * Prueba 1: introducimos una distancia y días que no cuente con descuento,
		 * debemos obtener le precio normal del viaje. Por ejmeplo, 7km y 5 días son
		 * 17.5 el precio.
		 * 
		 * Prueba 2: introducimos una distancia y días que cuente con el descuento,
		 * debemos obtener el precio con el decuento del 30%. Por ejemplo, 801km y 8
		 * días son 1401.75 el precio con descuento.
		 */

		// Declaración de variables
		// Variable que guarda la distandi dada por el usuario
		int distancia;
		// Variable que guarda los días dados por el usuario
		int dias;
		// Variable que guarda la constante del descuento
		final double DESCUENTO = 0.7;
		// Variable que guarda la constante del precio por km
		final double PRECIO_KM = 2.5;
		// Variable que guarda el precio total del viaje
		double precio;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le preguntamos al usuario la distancia recorrida y los días
		System.out.println("Introduce la distancia recorrida (km): ");
		distancia = reader.nextInt();
		System.out.println("Introduce el número de días del viaje: ");
		dias = reader.nextInt();

		// Creamos un if-else que aplica el descuento si el viaje dura más de 7 días y
		// recorre más de 800km
		if (distancia > 800 && dias > 7) {
			precio = distancia * PRECIO_KM * DESCUENTO;
		} else {
			precio = distancia * PRECIO_KM;
		}

		// Imprimimos el precio final
		System.out.println(precio);

		// Cerramos el Scanner
		reader.close();
	}
}
