package bucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//
		String cadena = "";
		int num;
		
		Scanner reader = new Scanner (System.in);
		
		do {
			System.out.println("Introduce un número positivo: ");
			num = reader.nextInt();
		} while (num<=0);
		
		for (int i=1; i<=num; i++) {
			
			for (int j=0; j<num-i; j++) {
				cadena += " ";
			}
			
			for (int k=0; k<i; k++) {
				cadena += "* ";
			}
			
			System.out.println(cadena);
			cadena = "";
		}
		
		reader.close();
	}
}
