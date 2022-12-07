package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class remove_duplicate_char_from_String_using_HashMap {

	public static void main(String[] args) {
		String str = "yabcabcdabcdaaaabcdddee";

		// 1. step 1
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		// 2. step 2
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}

		System.out.println(map);

		Set<Character> keys = map.keySet();
		System.out.println(keys);// [a, b, c, d, e, y]
	}
}
