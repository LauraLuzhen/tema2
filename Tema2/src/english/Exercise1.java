package english;

//Import Scanner
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		// Variable declaration
		// Variable to store the number entered by the user
		int num;

		// Create Scanner
		Scanner reader = new Scanner(System.in);

		// Ask to the user for an integer
		System.out.println("Enter an integer: ");
		num = reader.nextInt();

		// Create a while loop that starts when the number is not negative.
		while (num >= 0) {
			// Create an if-else that prints whether the entered number is even or odd
			if (num % 2 == 0) {
				System.out.println("The number is even.");
			} else {
				System.out.println("The number is odd");
			}

			// We ask the user for an integer again
			System.out.println("Introduce un número entero: ");
			num = reader.nextInt();
		}

		// Print end of the program
		System.out.println("End of the program");

		// Close Scanner
		reader.close();
	}
}
