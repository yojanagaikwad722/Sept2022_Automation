package LogicalPrograms;

public class remove_whitespaces_in_String {

	public static void main(String[] args) {
		String str = "ab  cd efgh  abc abc xyz ";

		str = str.replaceAll(" ", "");

		System.out.println(str);
	}
}
