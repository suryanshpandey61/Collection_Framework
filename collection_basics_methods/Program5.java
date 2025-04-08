package collection_basics_methods;

import java.util.ArrayList;
import java.util.Collection;

public class Program5 {

	public static void main(String[] args) {
		Collection c1=new ArrayList<>();
		c1.add(10);c1.add(8);c1.add(7);c1.add(24);c1.add(33);c1.add(58);
		c1.add(66);c1.add(18);c1.add(41);c1.add(35);c1.add(47);c1.add(74);
		int sum=0;
		for(Object c:c1) {
			Integer i=(Integer) c;
			sum=sum+i;		
		}
		System.out.println(c1);
		System.out.println("Total Sum of all elemenst are : "+sum);
	}
	
}
