package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class _HashSet1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();// built-in class

		// 1. add
		al.add("Janhavi");
		al.add(true);
		al.add(100);
		al.add('A');
		al.add(null);
		al.add(100);
		al.add("Janhavi");
		al.add("Janhavi");
		
		System.out.println(al);//[Janhavi, true, 100, A, null, 100, Janhavi, Janhavi]
		
		HashSet hs = new HashSet(al);
		System.out.println(hs);
	}
}
