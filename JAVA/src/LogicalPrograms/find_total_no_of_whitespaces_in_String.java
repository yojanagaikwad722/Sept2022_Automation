package LogicalPrograms;

public class find_total_no_of_whitespaces_in_String {

	public static void main(String[] args) {
		String str = "abc ab cd abcd  abcd  ab xyz  xyz";
		int count = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);

			if (ch == ' ') {
				count++;
			}
		}

		System.out.println("No. of whitespaces:" + count);

	}
}
