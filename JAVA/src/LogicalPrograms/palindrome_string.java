package LogicalPrograms;

public class palindrome_string {

	public static void main(String[] args) {
		String str = "radar";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {
			System.out.println("string is palindrome");
		} else {
			System.out.println("string is not palindrome");
		}
	}
}
