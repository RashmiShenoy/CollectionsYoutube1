package GeneralExamples;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("apple");
		arr.add("banana");
		arr.add("orange");
		
		//Array List to array conversion
		String[] str = new String[arr.size()];
		for (int i=0; i< arr.size(); i++) {
			str[i] = arr.get(i);
		}

		for (String s : str) {
			System.out.println(s);
		}
	}

}
