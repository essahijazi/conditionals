
public class Main {

	public static void main(String[] args) {
		/*RELATIONAL OPERATORS*/
		
		//>, >=, <, <=, !=, ==
		
		/*IF-ELSE STATEMENTS*/
		
		int v1  = 10;
		int v2 = 15;
		
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

	}

}
