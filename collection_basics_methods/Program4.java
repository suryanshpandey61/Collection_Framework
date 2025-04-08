package collection_basics_methods;
import java.util.*;
public class Program4 {
 
	public static void main(String[] args) {
		
		Collection c1=new ArrayList<>();
		c1.add(10);c1.add(8);c1.add(7);c1.add(24);c1.add(33);c1.add(58);
		c1.add(66);c1.add(18);c1.add(41);c1.add(35);c1.add(47);c1.add(74);
		int count=0;
		for(Object c:c1) {
			Integer i=(Integer) c;
			if(i%2==0)
				count++;
		}
		System.out.println(c1);
		System.out.println("Total number of even elemenst are : "+count);
		
		
	}
	
	
}
