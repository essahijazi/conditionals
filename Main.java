
public class Main {

	public static void main(String[] args) {
		/*RELATIONAL OPERATORS*/
		
		//>, >=, <, <=, !=, ==
		
		/*IF-ELSE STATEMENTS*/
		
		int v1  = 10;
		int v2 = 4;
		
		if(v1 > v2) {
			//will only execute if v1 > v2 is true
			System.out.println("v1 is bigger than v2");
		}else if (v1 < v2) {
			//will only execute if v1  <2v is true
			System.out.println("v1 is NOT bigger than v2");
		}else {
			//will only execute of all other conditions are not true
			System.out.println("v1 and v2 are equal");
		}
		
		/*CONDITIONAL OPERATOR*/
		
		//if the condition v1 < v2 is true, then maxValue gets assigned
		//v2's value, else it will get assigned v1's value
		int maxValue = v1 < v2 ? v2 : v1;
		
		System.out.println(maxValue);
		
		/*BLOCK STATEMENTS*/
		
		int diff;

		if (v1 > v2) {
			diff = v1 - v2;
			System.out.println("v1 is bigger");
			System.out.println(diff);
		}else if (v2 > v1) {
			diff = v2 - v1;
			System.out.println("v2 is bigger");
			System.out.println(diff);
		}else {
			System.out.println("v1 and v2 are equal");
		}
		
		float students = 30.0f;
		float rooms = 4.0f;

		if (rooms > 0.0) {
			System.out.println(students);
			System.out.println(rooms);
			float avg = students / rooms;
		}
			//this will throw a compilation error as
			//avg does not exist outside the block
			//System.out.println(avg);
		
	}

}
