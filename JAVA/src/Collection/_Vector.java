package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class _Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(100);
		v.add("Quantum academy");
		v.add('A');
		v.add(null);
		v.add(34.67f);
		v.add(100);

		System.out.println(v);// [100, Quantum academy, A, null, 34.67, 100]
		System.out.println(v.size());// 6
		System.out.println(v.contains(null));// true
		System.out.println(v.isEmpty());// false
		System.out.println(v.get(4));// 34.67
		System.out.println(v.capacity());// 10

		// set -> replace/modify/update
		v.set(3, "Software Testing");
		System.out.println(v);// [100, Quantum academy, A, Software Testing, 34.67, 100]

		// v.remove(100);//Array index out of range: 100
		// System.out.println(v);

		v.remove(5);
		System.out.println(v);// [100, Quantum academy, A, Software Testing, 34.67]

		v.add(1, 200);
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v);

		v.remove(1);
		System.out.println(v);

		System.out.println("---Print Vector info using Iterator cursor---");
		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("---Print Vector info using ListIterator cursor---");
		ListIterator litr = v.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("---Print Vector info using Enumeration cursor---");
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		System.out.println("---Print Vector info using for loop---");
		for (int i = 0; i <= v.size() - 1; i++) {
			System.out.println(v.get(i));
		}

		System.out.println("---Print Vector info using for each loop---");
		for (Object v1 : v) {
			System.out.println(v1);
		}

	}
}
