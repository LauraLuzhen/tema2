package english;

//Import Scanner
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		// Variable declaration
		// Variable to store the number entered by the user
		int num;
		// Variable to store the amount of numbers entered by the user
		int cont = 0;

		// Create Scanner
		Scanner reader = new Scanner(System.in);

		// Ask to the user for an integer
		System.out.println("Enter an integer: ");
		num = reader.nextInt();

		// Create a while loop that starts until it reaches 10
		while (cont < 10) {
			// Increase the counter 1
			cont++;
			// Print the multiplication
			System.out.println(num * cont);
		}

		// Print end of the program
		System.out.println("End of the program");

		// Close Scanner
		reader.close();
	}
}
