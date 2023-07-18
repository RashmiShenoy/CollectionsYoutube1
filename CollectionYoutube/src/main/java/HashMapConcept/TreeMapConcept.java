package HashMapConcept;

import java.util.TreeMap;

public class TreeMapConcept {
	 public static void main(String[] args){
		 TreeMap<String, Integer> tree = new TreeMap<>();
		 tree.put("Hob", 10);
		 tree.put("Alb", 20);
		 tree.put("Ben", 30);
		 tree.put("Zia", 11);
		 tree.put("Jon", 19);
		 tree.put("Lia", 12);
		 
		 //sorts based on keys
		 tree.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));
	 }
}
