package javaProgram;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
	 
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the base of the triangle:");
	double base = scanner.nextDouble();
	
	System.out.println("Enter the heigth of the triangle:");
	double height = scanner.nextDouble();
	
	double area = (base *height)/2;
	
	System.out.printf("Area: %2f%n",area);
	
	}

}
