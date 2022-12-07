package LogicalPrograms;

public class swap_two_numbers_using_third_variable {

	public static void main(String[] args) {
		int a = 50;
		int b = 60;
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println(a);// 60
		System.out.println(b);// 50

	}
}
