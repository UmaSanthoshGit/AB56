package Assignments;

import java.util.Scanner;

public class Assignment24 {

	public static void main(String[] args) {
		
		//circumference of a square  :  Formula: Formula: 4 × side
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side:");
		double side = scanner.nextDouble();
		
		
		double area = 2*side;
		System.out.println("circumference of a square  : "+area);
		scanner.close();
	}

}
