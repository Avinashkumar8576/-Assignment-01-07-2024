package javaProgram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a year:");
		int year = scanner.nextInt();
		
		boolean isLeapYear = isLeapYear(year);
		
		if(isLeapYear) {
			
			System.out.println(year +" is a laep  year");
		}
		else
		{
			System.out.println(year +" is not a laep  year");
		}	
      }
	      
		public static boolean isLeapYear(int year) {
			
			return (year % 4 == 0 && year % 100 !=0)|| year % 400 ==0;
		
		}
			
	}
	

