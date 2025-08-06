package Assignments;

import java.util.Scanner;

public class Assignment25 {

	public static void main(String[] args) {
		
		//circumference of a triangle  :  Formula: sideA + sideB + sideC
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sideA:");
		double sideA = scanner.nextDouble();
		System.out.println("Enter the sideB:");
		double sideB = scanner.nextDouble();
		System.out.println("Enter the sideC:");
		double sideC = scanner.nextDouble();
		
		
		double area = sideA*sideB*sideC;
		System.out.println("circumference of a triangle  : "+area);
		scanner.close();
	}

}
