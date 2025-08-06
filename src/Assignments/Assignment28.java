package Assignments;

public class Assignment28 {

	public static void main(String[] args) {
		//WAP to reverse a string using for loop
		
		String s1 = new String("Hello");
		System.out.println("Input String: "+s1);
		int lenth = s1.length();
		String reverse ="";
		for (int i=lenth-1;i>=0;i--) {
			reverse+= s1.charAt(i);
		}
		System.out.println("Reversed String: "+reverse);
	}

}
