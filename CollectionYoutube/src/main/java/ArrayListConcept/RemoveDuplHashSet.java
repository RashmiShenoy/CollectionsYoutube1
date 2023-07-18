package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplHashSet {
    public static void main(String[] args){
        //1. Linked Hashset
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,3,3,33,4,54,3,3,6));
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
        ArrayList<Integer> numberswithoutDupl = new ArrayList<Integer>(linkedHashSet);

        System.out.println(numberswithoutDupl);

        //2. JDK 8 stream
        ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,3,3,33,4,54,3,3,6));
        List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
        System.out.println(marksListUnique);
    }
}
