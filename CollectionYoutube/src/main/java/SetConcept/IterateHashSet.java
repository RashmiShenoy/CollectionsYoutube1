package SetConcept;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("new");
		set.add("test");
		set.add("sent");
		set.add("string");
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
 
	}

}
