package english;

//Import Scanner
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		// Variable declaration
		// Variable to store the high
		double high;
		// Variable to store the max high
		double highMax;
		// Variable to store the min high
		double highMin;

		// Create Scanner
		Scanner reader = new Scanner(System.in);

		// Ask to the user for an integer
		System.out.println("Enter a high: ");
		high = reader.nextDouble();

		// Max and min highs are the initial high
		highMax = high;
		highMin = high;

		// Create a while loop that starts with any value except 0
		while (high != 0) {
			// If high of the user is most highest than max we change the value
			if (highMax <= high) {
				highMax = high;
			}
			// If high of the user is most lowest than min we change the value
			if (highMin >= high) {
				highMin = high;
			}

			// Ask to the user for an integer again
			System.out.println("Enter a high: ");
			high = reader.nextDouble();
		}

		// Print the highest high
		System.out.println("The highest: " + highMax);
		// Print the lowest high
		System.out.println("The lowest: " + highMin);
		// Print end of the program
		System.out.println("End of the program");

		// Close Scanner
		reader.close();
	}
}
