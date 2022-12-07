package Collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class _LinkedHashSet1 {

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
		
		System.out.println(al);
		
		LinkedHashSet lhs = new LinkedHashSet(al);
		System.out.println(lhs);
		
	}
}
