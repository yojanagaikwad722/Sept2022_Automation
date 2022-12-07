package LogicalPrograms;

import java.util.Scanner;

public class Accept_Input_From_User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input1:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter input2:");
		int num2 = sc.nextInt();
		
		System.out.println("Addition:"+(num1+num2));
	}
}
