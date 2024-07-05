package javaProgram;

public class SwapVariables {
	
	public static void main(String[]args) {
		
		int x = 5;
		int y = 10;
		
		System.out.println("Before swapping: x="+x+" ,y="+y);
		
		//Swap x and y
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("After swapping: x="+x+",y="+y);
		
	}

}
