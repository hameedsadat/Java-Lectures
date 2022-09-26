package basics;

import java.util.Scanner;

public class K_Scanner {

	public static void main(String[] args) {

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * String fName = scan.next(); String lName = scan.next();
		 * 
		 * System.out.println(fName + lName);
		 */	
		
		Scanner input = new Scanner (System.in);
	    System.out.print("Input your first name: ");
	    String fname = input.next();
	    System.out.print("Input your last name: ");
	    String lname = input.next();
	    System.out.println();
	    System.out.println("Hello \n"+fname+" "+lname);
	    
	    
	    Scanner input2 = new Scanner (System.in);
	    System.out.print("Input the first number: ");
	    int num1 = input2.nextInt();
	    System.out.print("Input the second number: ");
	    int num2 = input2.nextInt();
	    int sum = num1 + num2;
	    System.out.println();
	    System.out.println("Sum: "+sum);
	  }
	  }
	


 
