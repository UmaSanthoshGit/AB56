package InterviewQuestions;

public class UppercasetoLowercase_JavaProgram {

		 public static void main(String[] args) {
			 
			 String str = "HexAwarE hEXaWARe";
			StringBuilder br = new StringBuilder();
			 
			 for(char ch : str.toCharArray()) {
				 
				 if(Character.isUpperCase(ch)) {
					 br.append(Character.toLowerCase(ch));
				 }
				 
				 else if(Character.isLowerCase(ch)) {
					 br.append(Character.toUpperCase(ch));
				 }
				 else
					 br.append(ch);
			 }
			 
			
			 System.out.println("After: "+br);
			 
			 
			 
			 System.out.println("--------Direct upper to lower-----");
			 String one = "HexAwarE";
			 System.out.println( "All upper case "  +one.toUpperCase());
			 System.out.println( "All Lower case "  +one.toLowerCase());
			 
			 
			 
		 }
}




		