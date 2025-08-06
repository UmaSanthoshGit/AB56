package Assignments;

import java.util.Scanner;

public class Assignment29 {
	// WAP to check if the string is a palindrome
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the inputString: ");
		String inputString = scan.nextLine();
		String reverseString="";
		
		for(int i=inputString.length()-1;i>=0;i--) {
			reverseString += inputString.charAt(i);
		}
		
		if(inputString.equalsIgnoreCase(reverseString)) {
			System.out.println("The given string "+inputString+" is palindrome ");
		}
		else {
			System.out.println("The given string "+inputString+" is not an pandlidrome ");
		}
		scan.close();
		
	}

}
