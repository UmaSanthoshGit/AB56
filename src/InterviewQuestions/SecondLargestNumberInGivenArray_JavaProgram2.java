package InterviewQuestions;

public class SecondLargestNumberInGivenArray_JavaProgram2 {

	public static void main(String[] args) {

		int array[] = {90,90,90};

		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for(int a: array) {
			if(a>largest) {
				second = largest;
				largest = a;
			}
			else if (a>second && a!=largest) {
				second=a;

			}
					}
	
		System.out.println("Largest value is" +largest);
		System.out.println("Second largest is"+second);

	}
}




