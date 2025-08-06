package Assignments;



public class Assignment42 {
	//within class all the access specifier method  is accessible
	
		public void publict() {
		System.out.println("Within Public");
	}
		private void privatet() {
			System.out.println("Within Private ");
		}
		protected void protectedt() {
			System.out.println("Within protected ");
		}
		void defaultt() {
			System.out.println("Default");
		}
		
	public static void main(String[] args) {
	
		Assignment42 obj = new Assignment42();
		obj.publict();
		obj.privatet();
		obj.protectedt();
		obj.defaultt();
	}
}

