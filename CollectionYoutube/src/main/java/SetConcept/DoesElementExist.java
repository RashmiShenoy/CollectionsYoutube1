package SetConcept;

import java.util.HashSet;
import java.util.Iterator;

public class DoesElementExist {

	public static void main(String[] args) {
		int element = 32;
		boolean flag = true;
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(3);
		set.add(5);
		set.add(8);
		set.add(4);
		
		
		if (set.contains(element))
			System.out.println("Element is present");
		else
			System.out.println("Not present");


	}

}
