package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,20));
        numbers.removeIf(num -> num%2 ==0);
        System.out.println(numbers);
    }
}
