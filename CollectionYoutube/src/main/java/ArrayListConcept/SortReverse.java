package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;

public class SortReverse {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList();
        arrList.add("Apple");
        arrList.add("Banana");
        arrList.add("Pear");
        arrList.add("Mango");
        
        Collections.sort(arrList, Collections.reverseOrder());
        
        System.out.println("ArrayList in descending order:");
        for (String s : arrList) {
        	System.out.println(s);
        }
	}

}
