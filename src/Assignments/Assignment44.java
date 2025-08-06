package Assignments;

public class Assignment44 {
	//within package all the access specifier method  is accessible except private & protected
	
		public void test() {
		System.out.println("Within Public");
	}
		private void add() {
			System.out.println("Within Private ");
		}
		protected void sub() {
			System.out.println("Within protected ");
		}
		void div() {
			System.out.println("Default");
		}
		
	public static void main(String[] args) {
	
		Assignment44 obj = new Assignment44();
		obj.test();
		obj.add();
		obj.sub();
		obj.div();
	}
}
