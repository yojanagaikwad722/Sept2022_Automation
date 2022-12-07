package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class find_repeating_string_in_paragraph {

	public static void main(String[] args) {
		String str = "abc abcd abc abcd xyz abc abc xyz xyz xyz ab";

		// 1. convert paragraph into array
		String ar[] = str.split(" ");

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		// 2. Create HashMap
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<ar.length; i++) {
			String s1 = ar[i];
			
			if(map.containsKey(s1)) {
				map.put(s1, map.get(s1)+1);
			}else {
				map.put(s1, 1);
			}
		}
		
		System.out.println(map);//{ab=1, abc=4, xyz=4, abcd=2}
		
		Set<String> keys = map.keySet();
		System.out.println(keys);//[ab, abc, xyz, abcd]

		for(String key:keys) {
			System.out.println(key+":"+map.get(key));
		}


	}
}
