package Assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment68 {

	public static void main(String[] args) {
		// WAP on Exception Handling using TryCatch When we may get 2 exceptions in a
		// single scenario

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the value");

			int add = 100 / scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Caught InputMismatchException: Please enter a valid integer.");
		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: Division by zero is not allowed.");
		}finally{
			System.out.println("Default Execution");
		}

	}

}
