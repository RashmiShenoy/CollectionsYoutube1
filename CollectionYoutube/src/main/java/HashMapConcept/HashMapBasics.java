package HashMapConcept;

import java.util.HashMap;

public class HashMapBasics {
    public static void main(String[] args){
        HashMap<String, String> capital = new HashMap<String, String>();
        capital.put("India","Delhi");
        capital.put("USA","Washington");
        
        System.out.println(capital.get("USA"));
    }
}
