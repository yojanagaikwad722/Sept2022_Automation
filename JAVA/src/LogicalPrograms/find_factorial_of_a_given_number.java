package LogicalPrograms;

public class find_factorial_of_a_given_number {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1;

		for (int i = num; i >= 1; i--) {
			fact = fact * i;//5*4*3*2*1
		}
		
		System.out.println(fact);//120
	}
}
