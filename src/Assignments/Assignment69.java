package Assignments;

public class Assignment69 {
	// WAP on Class Typecasting to achive Upcasting(in implicit and explicit way) and Downcasting

	public static void main(String[] args) {

		int a = 22;
		double c = a; // implict way (Widening)
		System.out.println(c);

		double ad = 10.54;
		int b = (int) ad;
		System.out.println(b); // Explict way (Narrowing)

		parentClass ph = new childClass();
		parentClass p = (parentClass) ph; // Downcasting
		p.method();
	}
}

class parentClass {
	public void method() {
		System.out.println("Inside parentclass");
	}
}

class childClass extends parentClass {
	public void print() {
		System.out.println("Inside childclass");
	}
}
