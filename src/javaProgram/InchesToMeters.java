package javaProgram;

import java.util.Scanner;

public class InchesToMeters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a length in inches:");
		double inches = scanner.nextDouble();
		
		double meters = inches * 0.0254;
		
		System.out.printf("%2f inches is equal to %2f meters%n",inches,meters);
	}

}
