
package ARRAY;

public class example3 {

	public static void main(String[] args) {
		int arr[][] = new int[2][2];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		
	//	int arr[][] = {{10, 20}, {30, 40}};
		
		for(int i=0; i<=1; i++) {//row
			for(int j=0; j<=1; j++) {//column
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		}
}
