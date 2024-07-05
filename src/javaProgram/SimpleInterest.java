package javaProgram;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the principal amount");
		double principal = scanner.nextDouble();
		
		System.out.println("Enter the rate of interest(in%)");
		double rate = scanner.nextDouble();
		
		System.out.println("Enter the time duration(in years)");
		double time = scanner.nextDouble();
		
		double interest = calculateSimpleInterest(principal,rate,time);
		
		System.out.printf("Simple Interest: "+interest);
		
		}
	
	public static double calculateSimpleInterest(double principal,double rate, double time) {
		
		return(principal*rate*time)/100;
	}

}
