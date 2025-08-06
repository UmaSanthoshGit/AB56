package Assignments;

import java.util.Scanner;

public class Assignment23 {

	public static void main(String[] args) {
		
		//circumference of a rectangle :  Formula: 2 * (length + width)
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length:");
		double length = scanner.nextDouble();
		System.out.println("Enter the width:");
		double width = scanner.nextDouble();
		
		double area = 2*(length*width);
		System.out.println("circumference of a rectangle : "+area);
		scanner.close();
	}

}
