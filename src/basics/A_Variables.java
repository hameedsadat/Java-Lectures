package basics;

public class A_Variables {

	public static void main(String[] args) {
		
		String a;
		int b;
		float f;
		double d;
		char c;
		boolean fals;
		
		// Declaring( creating ) variables
		
		// type variableName = value;
		
		String name = "Sayed";
		
		int num = 20;
		// change value from  20 to 30 
		num = 30 ;
		
		// Final Variables
		
		final int myNumb = 12;
		
		String race = "black";
		race = "white";
		System.out.println(race);
		
		final String race1 = "african";
		
		
		float myfloat = 90.3f;
		double myDouble = 90.4;
		
		
		char myGrade = 'A';
		
		boolean myBool = false;
		
		String name2 = "Sadat";
		System.out.println("Hello " + name + name2);
		
		
		// use + character to add a variable to another var
		
		String fName = "Sayed ";
		String lName = "Sadat";
		String fullName = fName+lName;
		System.out.println(fullName);
		
		
		// use + character to add numbers 
		
		int x = 4;
		int y = 5;
		
		System.out.println(x + y);
		
		System.out.println(4+5);
		
		
		// Declare many variables 
		
		int j = 4;
		int v = 3;
		int ff = 9;
		
		System.out.println(j + v + ff);
		
		int all = j + v + ff;
		
		System.out.println(all);
		
		// simply write like below: 
		
		int m = 4, s = 3, k = 9;
		System.out.println(m + s - k);
		
		// one value to multiple variables
		
		int h,l, o;
		h = l = o = 10;
		
		System.out.println(h +l + o); // 30 
		System.out.println(o);
		
	}

}
