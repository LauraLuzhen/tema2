package actfor;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que comienza con los números impares y los va guardando
		int numImpar = 1;
		// Variable que guarda la suma de los números primos
		int suma = 0;

		// Cremos un for que sume los 10 primero números impares
		for (int i = 0; i < 10; i++) {
			suma += numImpar;
			numImpar += 2;
		}

		// Imprimimos la suma
		System.out.println(suma);
	}
}
