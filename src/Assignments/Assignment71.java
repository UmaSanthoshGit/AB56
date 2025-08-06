package Assignments;

//WAP on Compile time polymorphism (Method overloading)
//WAP on Run time polymorphism (Method overriding)

public class Assignment71 {
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	public float add(float a, float b) {
		float c = a+b;
		return c;
	}
	public int add(int a, int b, int c) {
		int d = a+b+c;
		return d;
	}

	public static void main(String[] args) {
		
		Assignment71 a = new Assignment71();
		int c = a.add(12, 12);
		float d = a.add(10.5f, 20.3f);
		System.out.println(c);
		System.out.println(d);
		System.out.println(a.add(1, 2, 5));
	}
	

}

