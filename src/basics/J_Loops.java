package basics;

public class J_Loops {

	public static void main(String[] args) {
		/*
		 * Loops 
		 * Loops can execute a block of code as long as a specified condition is
		 * reached.
		 * 
		 * Loops are handy because they save time, reduce errors, and they make code
		 * more readable.
		 * 
		 * Java While Loop
		 *  The while loop loops through a block of code as long as a
		 * specified condition is true:
		 * 
		        while (condition) {
                code block to be executed
                }
		 */
		
		//In the example below, the code in the loop will run, over and over again, as long as a variable (i) is less than 5:
		
		int i = 0;
		while (i < 4) {
		  System.out.println(i);
		  i++;  //Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!
		  
		}
		
		
		System.out.println(" *********Do/while**********");
		/*
		 * The Do/While Loop The do/while loop is a variant of the while loop. This loop
		 * will execute the code block once, before checking if the condition is true,
		 * then it will repeat the loop as long as the condition is true.
		 * 
		 * Syntax
		 *  do {
		 *   // code block to be executed 
		 *  } 
		 *  while (condition);
		 */
	
		
		int f = 0;
		do {
		  System.out.println(f);
		  f++;
		}
		while (f < 5);
		
	
		
		int b = 10;
		do {
			System.out.println(b);
			b--;
		} while (b>0);
	
		
		System.out.println("*********** For loop*************");
		/*Java For Loop
		When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
		Syntax
		for (statement 1; statement 2; statement 3) {
	 // code block to be executed
*/	
		
		for (int j = 0; j < 5; j++) {
			  System.out.println(" positive" + j);
			}
		
		for (int u = 10; u>0; u--) {
			System.out.println("negative " + u);
		}
		
		//This example will only print even values between 0 and 10:
		System.out.println("******* even values****");
		
		for (int x = 0; x <= 15; x = x + 3) { 
			  System.out.println(x);
			}
		
		System.out.println("******** break ******");
		
		for (int s = 0; s<6;s++) {
			if (s == 4) {
				break;
			}
			System.out.println(s);
		}
		
		System.out.println("******continue******");
		
		for (int z =0; z<10; z++) {
			if (z==7) {
				continue;
			}
			System.out.println(z);
		}
		
		System.out.println("*******for each loop******");
		/*
		 * For-Each Loop 
		 * There is also a "for-each" loop, which is used exclusively to
		 * loop through elements in an array:
		 * 
		 * Syntax 
		 * for (type variableName : arrayName) { 
		 * // code block to be executed }
		 */
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String y : cars) {
		  System.out.println(y);
		}
		
		int [] numbers = {10,20,30,40,50};
		for(int p : numbers) {
			System.out.println(p);
		}
	}
}
