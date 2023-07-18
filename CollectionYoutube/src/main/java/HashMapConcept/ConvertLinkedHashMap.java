package HashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class ConvertLinkedHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(23, "Yash");  
        hm.put(17, "Arun");  
        hm.put(15, "Swarit");  
        hm.put(9, "Neelesh");
        
        Iterator<Integer> it = hm.keySet().iterator();
        System.out.println("Before sorting");
        
        while(it.hasNext()) {
        	int key = (int)it.next();
        	System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));
        }
        
        System.out.println("\n");
        
        Map<Integer, String> map=new HashMap<Integer, String>();  
        TreeMap<Integer, String> tm = new TreeMap<>(hm);
        Iterator itr = tm.keySet().iterator();
        
        System.out.println("After sorting");
        while(itr.hasNext()) {
        	int key = (int)itr.next();
        	System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));
        }
        
    }
}
