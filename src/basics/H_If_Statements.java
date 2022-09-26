package basics;

public class H_If_Statements {
	public static void main(String[] args) {
	/*
	  Java Conditions and If Statements Java supports the usual logical conditions
	  from mathematics:
	  
	  Less than: a < b 
	  Less than or equal to: a <= b 
	  Greater than: a > b 
	  Greater than or equal to: a >= b 
	  Equal to a == b 
	  Not Equal to: a != b 
	  You can use these conditions to perform different actions for different decisions.
	  
	  Java has the following conditional statements:
	  
	  Use (if) to specify a block of code to be executed, if a specified condition is true
      Use (else) to specify a block of code to be executed, if the same  condition is false
	  Use (else if) to specify a new condition to test, if the  first condition is false 
	  Use (switch) to specify many alternative blocks of code to be executed
*/
	//Use the if statement to specify a block of Java code to be executed if a condition is true.
	
	if (20 > 18) {
		  System.out.println("20 is greater than 18");
		}
	// We can also test variables:
	int x = 20;
	int y = 18;
	
	if (x > y) {
	  System.out.println("x is greater than y");
	
	}
	
//	Use the else statement to specify a block of code to be executed if the condition is false.
	
	int time = 20;
	if (time < 18) {
	  System.out.println("Good day.");
	  
	} else {
		
	  System.out.println("Good evening.");
	}
	// Outputs "Good evening."
	
	
	
	if (30 >time) {
		System.out.println("time is less than 30 ");
	} else { 
		System.out.println("time is more than 30");
	}
	
	
//	Use the else if statement to specify a new condition if the first condition is false.
	int times = 22;
	if (times < 10) {
	  System.out.println("Good morning.");
	} else if (time < 20) {
	  System.out.println("Good day.");
	} else {
	  System.out.println("Good evening.");
	}
	// Outputs "Good evening."
	
}
}