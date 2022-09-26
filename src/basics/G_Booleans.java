package basics;

public class G_Booleans {

	public static void main(String[] args) {
		/*
		 * Java Booleans Very often, in programming, you will need a data type that can
		 * only have one of two values, like: YES / NO ON / OFF TRUE / FALSE For this,
		 * Java has a boolean data type, which can take the values true or false.
		 * 
		 * A boolean type is declared with the boolean keyword and can only take the values true or false:
		 */
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);   // Outputs false
		
		
		int x = 10;
		int y = 9;
		System.out.println(x > y); // returns true, because 10 is higher than 9
		
		int h = 10;
		System.out.println(h == 10); // returns true, because the value of x is equal to 10
		
		System.out.println(10 == 15); // returns false, because 10 is not equal to 15
	}

}
