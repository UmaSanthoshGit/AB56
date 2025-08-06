package Assignments;

import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args) {
		
		//circumference of a circle :  Formula: 2πr
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double radius = scanner.nextDouble();
		
		double area = 2*Math.PI*radius;
		System.out.println("circumference of a circle : "+area);
		scanner.close();
	}

}
