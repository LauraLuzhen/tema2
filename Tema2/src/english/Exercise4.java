package english;

import java.util.Random;
//Import Scanner
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		// Variable declararion
		int num;
		int numUser;

		// Create Scanner
		Scanner reader = new Scanner(System.in);

		// Ask to the user for a number
		System.out.println("Enter a number: ");
		numUser = reader.nextInt();

		Random rand = new Random();
		num = rand.nextInt(1, 101);

		//
		while (numUser != -1 && numUser != num) {
			System.out.println(numUser < num ? "The number is less than the number to guess"
					: "The number is greater than the number to guess");

			// Ask to the user for a number again
			System.out.println("Enter a number: ");
			numUser = reader.nextInt();
		}

		System.out.println("The number is correct");

		reader.close();
	}
}
