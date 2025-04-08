package collection_basics_methods;

import java.util.*;


public class Program3 {

	public static void main(String[] args) {
		Collection c1=new ArrayList<>();
		c1.add("Anshu");c1.add(10);c1.add("Anmol");c1.add(98);
		c1.add("Anubhav");c1.add("Gaurav");c1.add("Prakhar");c1.add(54);
		
		Iterator itr=c1.iterator();
		while(itr.hasNext()) {
			if(itr.next() instanceof Integer) {
				itr.remove();
			}
		}
		
		System.out.println("Collection after removing integer element");
		System.out.println(c1);
	}
	
	
}
