package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class _TreeSet {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(45);
		ts.add(50);
		ts.add(100);
		ts.add(20);
		ts.add(200);
		ts.add(15);
		ts.add(250);
		ts.add(100);//duplicates are not allowed
		//ts.add(null);//NullPointerException
		
		System.out.println(ts);//[15, 20, 45, 50, 100, 200, 250]
		System.out.println(ts.size());//7
		System.out.println(ts.contains(70));//false
		System.out.println(ts.isEmpty());//false
		
		System.out.println(ts.first());//15
		System.out.println(ts.last());//250
		
		ts.pollFirst();//removes the first (lowest) element
		System.out.println(ts);//[20, 45, 50, 100, 200, 250]
		
		ts.pollLast();//removes the last (highest) element
		System.out.println(ts);//[20, 45, 50, 100, 200]
		
		ts.remove(20);
		System.out.println(ts);//[45, 50, 100, 200]

		System.out.println("---Print all the info in TreeSet using Descending order---");
		Iterator ditr = ts.descendingIterator();
		while(ditr.hasNext()) {
			System.out.println(ditr.next());
		}
		
		System.out.println("---Print all the info in TreeSet using for each loop---");
		for(Object t1:ts) {
			System.out.println(t1);
		}


		System.out.println("---Print all the info in TreeSet using Iterator cursor---");
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


	}
}
