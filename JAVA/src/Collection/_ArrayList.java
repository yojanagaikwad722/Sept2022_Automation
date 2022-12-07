package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _ArrayList {//user defined class

	public static void main(String[] args) {
		ArrayList al = new ArrayList();//built-in class
		
		//1. add
		al.add("Janhavi");
		al.add(true);
		al.add(100);
		al.add('A');
		al.add(null);
		al.add(100);
		
		System.out.println(al);//[Janhavi, true, 100, A, null, 100]
		
		//2. get
		System.out.println(al.get(2));//100
		
		//3. set -> replace/modify/update
		al.set(2, "Quantum Academy");
		System.out.println(al);//[Janhavi, true, Quantum Academy, A, null, 100]
		
		//4. size
		System.out.println(al.size());//6
		
		//5. isEmpty
		System.out.println(al.isEmpty());//false
		
		//6. contains
		System.out.println(al.contains(100));//true
		
		//7. remove - delete/remove
		al.remove(2);
		System.out.println(al);//[Janhavi, true, A, null, 100]
		
		System.out.println("---Print arraylist info using Iterator cursor---");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {//true
			System.out.println(itr.next());
		}
		
		System.out.println("---Print arraylist info using List Iterator cursor---");
		ListIterator litr = al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}

		
		System.out.println("---Print arraylist info using for loop---");
		for(int i=0; i<=al.size()-1; i++) {
			System.out.println(al.get(i));
		}

		System.out.println("---Print arraylist info using for each loop---");
		for(Object a1:al) {
			System.out.println(a1);
		}

	}
}
