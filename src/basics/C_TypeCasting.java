package basics;

public class C_TypeCasting {

	public static void main(String[] args) {
		
		
		
		// Widening casting (automatically) :byte->short->char->long->float->double 
	    //  Narrowing casting(manually): double -> float -> long -> int ->char -> short -> byte
		
		int myInt = 9;
		
		double myDouble = myInt;
		System.out.println(myDouble);
		System.out.println(myInt);
		
		// Narrowing casting:
		
		double myDouble1 = 3.3;
		int myInt1 = (int) myDouble1;
		
		System.out.println(myDouble1);
		System.out.println(myInt1);
		
		double myD = 2.2;
		
		int myInt2 = 2;
		
		int myInt3 =(int) myD;
		System.out.println(myInt3);
		System.out.println(myInt2);
		System.out.println(myD);
		
		
		
	}

}
