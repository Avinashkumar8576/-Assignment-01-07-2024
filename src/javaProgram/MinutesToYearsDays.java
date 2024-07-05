package javaProgram;

import java.util.Scanner;

public class MinutesToYearsDays {
	
  public static void main(String[] args) {
	  
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number of minutes: ");
    long minutes = scanner.nextLong();

    long years = minutes / 525940;
    long days = (minutes % 525940) / 1440;

    System.out.printf("%d minutes is equal to %d years and %d days%n", minutes, years, days);
  }
}