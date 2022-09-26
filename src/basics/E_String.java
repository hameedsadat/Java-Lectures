package basics;

public class E_String {

	public static void main(String[] args) {
	/*	
		//A String variable contains a collection of characters surrounded by double quotes:
		String greeting = "Hello";
		
		
		// String Length
		// A String in Java is actually an object, which contain methods that can perform certain operations on strings. 
		// For example, the length of a string can be found with the length() method:
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
		
		// There are many string methods available, for example toUpperCase() and toLowerCase():
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
		
		*/
		
		//Finding a Character in a String
		//The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
		String txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate")); // Outputs 7
		
		
		//String Concatenation
		//The + operator can be used between strings to combine them. This is called concatenation:
		
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		System.out.println(firstName + "         " + lastName);
		System.out.println(firstName + lastName);
		
		//You can also use the concat() method to concatenate two strings:
		
		String firstName1 = "John ";
		String lastName1 = "Doe";
		System.out.println(firstName1.concat(lastName1));
		
		System.out.println(lastName.concat("sayed"));
		
		//Java uses the + operator for both addition and concatenation.Numbers are added. Strings are concatenated.

		
		
		
		
		
		

	}

}
