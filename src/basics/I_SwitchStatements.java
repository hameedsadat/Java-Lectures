package basics;

public class I_SwitchStatements {

	public static void main(String[] args) {

		// Use the switch statement to select one of many code blocks to be executed.

		int day = 1;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		// Outputs "Thursday" (day 4)

		String nameOftheMonth = "Feburay";

		switch (nameOftheMonth) {

		case "January":
			System.out.println("it is january");
			break;
		case "Feburay":
			System.out.println("it is Feb");
			break;
		case "March":
			System.out.println("it is March ");
			break;

		}
		
		
		//The default Keyword
		//The default keyword specifies some code to run if there is no case match:
		
		int days = 4;
		switch (days) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}
		// Outputs "Looking forward to the Weekend"
		//Note that if the default statement is used as the last statement in a switch block, it does not need a break.
		
	}
}
