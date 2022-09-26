package basics;

public class D_Operators {

	public static void main(String[] args) {
//		•	Arithmetic operators
//		•	Assignment operators
//		•	Comparison operators
//		•	Logical operators
//		•	Bitwise operators

		// Arithmetic
		/*
		 * int a = 30; int b = 10;
		 * 
		 * int c = a + b;
		 * 
		 * System.out.println(c);
		 * 
		 * System.out.println(a-b);
		 * 
		 * System.out.println(30 * 2);
		 * 
		 * System.out.println(a/b);
		 * 
		 * System.out.println(a%3);
		 */

		// Increment operator (++) and decrement (--)
		// pre-increment (++a) and pre-decrement(--a)
		// post-decrement(a++) and post-decrement(a++)
//
//		int counter = 0;
//
//		System.out.println(counter); // 0
//		System.out.println(++counter); // 1
//		System.out.println(counter); // 1
//		System.out.println(counter++); // 1
//
//		System.out.println(counter); // 2
//		System.out.println(--counter); // 1
//		System.out.println(counter); // 1
//		System.out.println(counter--); // 1
//
//		System.out.println(counter); // 0

		// Assignment Operators

//		int x = 9; // here (=) is the assignment operator

		// the following operations does not compile due to ...
//
//		int a = 3.0;
//		short r = 1921222;
//		int z = 5f;
//		long t = 9223372036854775807;// the character(L) is missing at the end of the value

         

		// Solution: cast them : Casting primitive values
//		int ab = (int) 3.0;
//		short rr = (short) 1921222;
//		int zz = (int) 5f;
//		long tt = 9223372036854775807L;
//		
//		System.out.println(rr);
//		
		// Compound Assignment Operators: 
		int x = 5;
		
	    System.out.println(x);
	   
	    x += 3;
	    System.out.println(x);  
	    
	    x -= 3;
	    System.out.println(x);
	    
	    x *= 3;
	    System.out.println(x);
	    
	    x /= 3;
	    System.out.println(x);
	    
	    x %= 3;
	    System.out.println(x);
	    
	    
		
		
		// Comparison Operator : 
		int n = 5;
	    int y = 3;
	    System.out.println(n == y); // returns false because 5 is not equal to 3
	    
	    System.out.println(n != y); // returns true because 5 is not equal to 3
	    
	    System.out.println(n > y); // returns true because 5 is greater than 3
	    
	    System.out.println(n < y); // returns false because 5 is not less than 3
	    
	    System.out.println(n >= y); // returns true because 5 is greater, or equal, to 3
	    
	    System.out.println(n <= y); // returns false because 5 is neither less than or equal to 3

	    //Java Logical Operators
	   // Logical operators are used to determine the logic between variables or values:
	
	    int xx = 5;
	    System.out.println(xx > 3 && xx < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
	
	    System.out.println(x > 3 || x < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
	   
	    System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
	
	}
	

}
