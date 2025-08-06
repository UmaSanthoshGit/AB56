package Assignments;

public class stringtesting {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("testing builders");
		builder.append("test");
		System.out.println(builder);
		builder.replace(0, 8, "String");
		System.out.println(builder);
		builder.insert(7, "builder");
		System.out.println(builder);
		
		
	}
}
