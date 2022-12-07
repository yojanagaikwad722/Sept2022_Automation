package ARRAY;

import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
		//int arr[] = new int[4];
		
		int arr[] = {90, 60, 24, 100, 45, 67, 80, 10, 20, 32, 05};
		
		System.out.println(arr.length);//11
		
		System.out.println("---Print all info in array---");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("---Print all info in array in Ascending order---");
		Arrays.sort(arr);
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("---Print all info in array in Descending order---");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}

	}
}
