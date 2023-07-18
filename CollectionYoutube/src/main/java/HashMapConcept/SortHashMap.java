package HashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Sort by keys of given hashmap by using Treeset
public class SortHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		 
	    hashmap.put(22,"A");
	    hashmap.put(55,"B");
	    hashmap.put(33,"Z");
	    hashmap.put(44,"M");
	    hashmap.put(99,"I");
	    hashmap.put(88,"X");
	    
	    System.out.println("After sorting");
	    
	    TreeMap<Integer, String> tm = new TreeMap<>();
	    
	    tm.putAll(hashmap);
	    
	    for (Map.Entry<Integer, String> entry: tm.entrySet()) {
	    	System.out.println("Key = " + entry.getKey() + " , Value = " + entry.getValue());
	    }
	}

}
