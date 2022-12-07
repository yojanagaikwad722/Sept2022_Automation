package LogicalPrograms;

import java.util.Arrays;

public class sum_of_array {

	public static void main(String[] args) {
		int ar[] = { 10, 30, 40, 90, 20, 45 };
		int sum = 0;

		for (int i = 0; i <= ar.length - 1; i++) {
			sum = sum + ar[i];
		}
		System.out.println(sum);// 235

		Arrays.sort(ar);

		// ascending order
		System.out.println("Print array elements in ascending order");
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.println(ar[i]);
		}

		// descending order
		System.out.println("Print array elements in descending order");
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.println(ar[i]);
		}
	}
}
