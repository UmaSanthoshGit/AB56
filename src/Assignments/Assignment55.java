package Assignments;

public class Assignment55 {

	public static void main(String[] args) {

		String str = "This, is, Java, Program";
		String defaultsp[] = str.split(" ");
		for (String e : defaultsp) {
			System.out.println(e);
		}
		
		System.out.println("---------------");
		String[] limit = str.split(" ", 2);
		for (String e : limit) {
			System.out.println(e);
		}
		
		System.out.println("---------------");
		String[] delimiter = str.splitWithDelimiters(",", 3);
		for (String e : delimiter) {
			System.out.println(e);
		}
	}

}
