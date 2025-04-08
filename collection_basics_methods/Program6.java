package collection_basics_methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program6 {

 public static void main(String[] args) {
	 Collection c1=new ArrayList<>();
		c1.add("Anshu");c1.add(10);c1.add("Anmol");c1.add(98);
		c1.add("Anubhav");c1.add("Gaurav");c1.add("Prakhar");c1.add(54);
		Integer sum=0;
		System.out.println(c1);
		Iterator itr=c1.iterator();
		
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer) {
					int i=(Integer) o;
					sum=sum+i;
			}
			    
		}
		
		System.out.println("Sum of all integer from collection are :"+sum);
}
	
}
