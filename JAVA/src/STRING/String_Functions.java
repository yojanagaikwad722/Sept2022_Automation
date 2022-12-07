package STRING;

public class String_Functions {

	public static void main(String[] args) {
		String s1 = "quantum academy";// initialization
		String s2 = new String("quantum academy");// object creation
		String s3 = "quantum academy";
		String s4 = "QUANTUM ACADEMY";
		String s5 = new String("quantum academy");
		String s6 = new String("academy");
		String s7 = " ";

		// 1. equals() - true/false
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false

		// 2. equalsIgnoreCase() - true/false
		System.out.println(s1.equalsIgnoreCase(s4));// true

		// 3. length() - number of characters in String(space is also considered)
		System.out.println(s3.length());// 15

		// 4. toUpperCase()
		System.out.println(s1.toUpperCase());// QUANTUM ACADEMY

		// 5. toLowerCase()
		System.out.println(s4.toLowerCase());// quantum academy

		// 6. contains
		System.out.println(s1.contains("quantum"));// true

		// 7. isEmpty() - Returns true if, and only if, length() is 0.
		System.out.println(s1.isEmpty());// false
		System.out.println(s7.isEmpty());//false
		System.out.println(s7.isBlank());//true
		
		//8. concat
		System.out.println(s3.concat(s4));//quantum academyQUANTUM ACADEMY
		
		//9. startsWith
		System.out.println(s1.startsWith("q"));//true
		
		//10. endsWith
		System.out.println(s1.endsWith("y"));//true
		
		//11. charAt
		System.out.println(s1.charAt(6));//m
		
		//12. replace
		System.out.println(s1.replace('a', 'A'));//quAntum AcAdemy
		System.out.println(s1.replaceFirst("a", "A"));//quAntum academy

		//13. substring
		System.out.println(s1.substring(8));//academy
		System.out.println(s1.substring(0, 7));//endIndex -> actualIndex + 1
		
		//14. lastIndexOf
		System.out.println(s1.lastIndexOf('m'));//13		
	}
}
