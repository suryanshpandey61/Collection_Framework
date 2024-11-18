package collection_basics_methods;

import java.util.ArrayList;
import java.util.Collection;

public class Program1 {
	
	public static void main(String[] args) {
		Collection c1=new ArrayList<>();
		Collection c2=new ArrayList<>();
		c1.add(21);
		c1.add(45.67);
		c1.add('@');
		
		c2.add(10);c2.add(50);c2.add(67);c2.add(21);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("===========");
		System.out.println(c1.contains(54));
		System.out.println("===========");
		c1.removeAll(c2);
		System.out.println(c1);
		System.out.println("===========");
		c2.add(21);
		c1.add(21);
		c1.retainAll(c2);
		System.out.println(c1);
		System.out.println("===========");
		c1.clear();
		System.out.println(c1);
		System.out.println(c1.isEmpty());
		System.out.println(c1.hashCode());
		System.out.println("===========");
		c1.add(65);c1.add(76);
		c1.toArray();
		System.out.println(c1);
	}

	
}
