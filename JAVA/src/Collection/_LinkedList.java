package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class _LinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add('B');
		ll.add(200.0f);
		ll.add(null);
		ll.add(100);
		
		System.out.println(ll);//[100, B, 200.0, null, 100]
		System.out.println(ll.size());//5
		System.out.println(ll.isEmpty());//false
		System.out.println(ll.contains(100));//true
		System.out.println(ll.get(0));//100
		
		ll.set(0, "Quantum Academy");
		System.out.println(ll);//[Quantum Academy, B, 200.0, null, 100]
		
		ll.remove(3);
		System.out.println(ll);//[Quantum Academy, B, 200.0, 100]

		System.out.println("---Print LinkedList info using Iterator cursor---");
		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("---Print LinkedList info using ListIterator cursor---");
		ListIterator litr = ll.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("---Print LinkedList info using for loop---");
		for (int i = 0; i <= ll.size() - 1; i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("---Print LinkedList info using for each loop---");
		for (Object l1 : ll) {
			System.out.println(l1);
		}

	}
}
