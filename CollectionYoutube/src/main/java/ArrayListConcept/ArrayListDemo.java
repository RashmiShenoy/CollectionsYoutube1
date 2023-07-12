package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main (String[] args){
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add("string");
        System.out.println(ar.get(1));
        System.out.println(ar.size());
    }
}
