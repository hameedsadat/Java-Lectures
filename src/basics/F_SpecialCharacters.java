package basics;

public class F_SpecialCharacters {

	public static void main(String[] args) {
		//Special Characters
		//Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
		
//		String txt = "We are the so-called "Vikings" from the north.";
		
		//The solution to avoid this problem, is to use the backslash escape character.

		//The backslash (\) escape character turns special characters into string characters:

		//The sequence \"  inserts a double quote in a string:
		String txtt = "We are the so-called \"Vikings\" from the north.";
		
		String bookName = "here is the name of the book \"Quran\"  "; 
		
		
		System.out.println(bookName);
		
		System.out.println(txtt);
		
		
		//The sequence \'  inserts a single quote in a string:
		
		String txt = "It\'s alright.";
		System.out.println(txt);
		
		//The sequence \\  inserts a single backslash in a string:

			
			String txtf = "The character \\ is called backslash.";
			System.out.println(txtf);
		
		
		//  this character ( \n )inside the string creates new line
			
			 String txts = "Hello\nWorld!";
			    System.out.println(txts);
			    
			    
		// this character (\t) inside the string crerates a tab space
			    String txtq = "Hello\tWorld!";
			    System.out.println(txtq);
			    
	    // this character (\b) inside the string crerates a backspace
			    String txtw = "Hel\blo World!";
			    System.out.println(txtw);
	}

}
