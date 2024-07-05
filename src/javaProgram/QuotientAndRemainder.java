package javaProgram;

import java.util.Scanner;

public class QuotientAndRemainder {
	
  public static void main(String[] args) {
	  
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the dividend: ");
    int dividend = scanner.nextInt();

    System.out.print("Enter the divisor: ");
    int divisor = scanner.nextInt();

    int quotient = dividend / divisor;
    int remainder = dividend % divisor;

    System.out.printf("Quotient: %d%n", quotient);
    System.out.printf("Remainder: %d%n", remainder);
  }
}
