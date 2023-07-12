package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {
    public static void main(String[] args){
        ArrayList<String> student = new ArrayList<String>();
        student.add("Tom");
        student.add("James");
        student.add("Lisa");
        student.add("Elise");

        System.out.println("For loop-------------");
        for(int i=0; i< student.size(); i++){
            System.out.println(student.get(i));
        }

        System.out.println("Simple For loop------------");
        for (String s: student){
            System.out.println(s);
        }

        Iterator<String> it= student.iterator();
        System.out.println("Iterator--------------");
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
