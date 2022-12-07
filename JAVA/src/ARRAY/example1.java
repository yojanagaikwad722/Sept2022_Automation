package ARRAY;

public class example1 {

	public static void main(String[] args) {
		//1. declaration
		int arr[] = new int[4];// 0 to 3rd index
		
		//2. initialization
		arr[0] = 100;
		arr[1] = 70;
		arr[2] = 40;
		arr[3] = 250;
		//arr[4] = 90;//ArrayIndexOutOfBoundsException
		
		System.out.println(arr[2]);//40
		
		System.out.println("---Print all info in array---");
		for(int i=0; i<=3; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
