package basics;

public class L_Arrays {

	 
		/*
		 * 
		 * /* Java Arrays Arrays are used to store multiple values in a single variable,
		 * instead of declaring separate variables for each value.
		 * 
		 * To declare an array, define the variable type with square brackets: String[]
		 * cars;
		 */

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

		int[] myNum = { 10, 20, 30, 40 };

		// You can access an array element by referring to the index number.

		String[] carrs = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println(carrs[0]);

		// To change the value of a specific element, refer to the index number:

		// cars[0] = "Opel";

		String[] carss = { "Volvo", "BMW", "Ford", "Mazda" };
		carss[0] = "Opel";
		System.out.println(carss[0]);

		// To find out how many elements an array has, use the length property:

		String[] cares = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println(cares.length);
		// Outputs 4

		/*
		 * Loop Through an Array You can loop through the array elements with the for
		 * loop, and use the length property to specify how many times the loop should
		 * run.
		 * 
		 * The following example outputs all elements in the cars array:
		 */

		System.out.println("****using for loop**");
		String[] carz = { "TOYOTA", "TATA", "OPEL", "BENZ" };
		for (int i = 0; i < carz.length; i++) {
			System.out.println(carz[i]);
		}

		System.out.println("****using for each loop**");
		for (String j : carz) {
			System.out.println(j);
		}

		/*
		 * Multidimensional Arrays A multidimensional array is an array of arrays.
		 * 
		 * To create a two-dimensional array, add each array within its own set of curly
		 * braces:
		 */
		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

		// To access an element of an array:

		int[][] myNumbrs = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

		int x = myNumbrs[1][2];
		int y = myNumbrs[0][3];
		System.out.println(x); // Outputs 7
		System.out.println(y);

//			We can also use a for loop inside another for loop to get the elements of a two-dimensional array 
//			(we still have to point to the two indexes):
		System.out.println("*multi dimensional arrays****");
		int[][] myNums = { { 2, 3, 4, 5, }, { 5, 10, 15 }, { 10, 20, 30, 40 } };

		myNums[0][0] = 100;

		for (int i = 0; i < myNums.length; i++) {
			for (int j = 0; j < myNums[i].length; j++) {

				System.out.print(myNums[i][j]);
				// System.out.println(myNums.length);
			}
			System.out.println();
		}

		
		
		// To find the length of this array :

		int[][] myNam = { { 2, 3, 4, 5, }, { 5, 10, 15 }, { 10, 20, 30, 40 } };

		System.out.println(myNums.length);
	}

}
