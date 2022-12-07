package LogicalPrograms;

public class Multiply_2_numbers_without_multi_operator {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 4;
		int sum = 0;

		for (int i = 1; i <= num2; i++) {// 1 2 3 4 5
			sum = sum + num1;// 5+5+5+5=20
		}

		System.out.println(sum);
	}
}
