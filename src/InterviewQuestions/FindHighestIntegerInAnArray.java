package InterviewQuestions;

public class FindHighestIntegerInAnArray {

	
	public static void main(String[] args) {


		int [] data = {23,66,8,34,99,67,34,0};


		int maximum = data[0];


		for ( int e: data) {
			if(e>maximum) {
				maximum = e;
			}
		}
		System.out.println("Maximum integer is  "+maximum);
	}


}
