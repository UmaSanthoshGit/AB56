package Assignments;
interface shapes {
	abstract void square();
	abstract void triangle();
	public static void abstarcttest() {
		System.out.println("Inside interface class: concrete method");
	}
}

class subclas implements shapes {
	public void square() {
		System.out.println("Inside subclass: square method");
	}
	public void triangle() {
		System.out.println("Inside subclass: triangle method");
	}
}
class subclasstwo extends subclas implements shapes
{
	public void hexagon() {
		System.out.println("Inside multiple parents: hexagon method");
	}
}
public class Assignment40 {
	public static void main(String[] args) {
		subclasstwo obj = new subclasstwo();
		shapes.abstarcttest();
		obj.square();
		obj.triangle();
		obj.hexagon();

	}
}
