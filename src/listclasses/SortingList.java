package listclasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(145);
		al.add(75);
		al.add(15);
		al.add(40);
		al.add(21);
		al.add(86);
		
        
		// Sort the list
        Collections.sort(al);

        // Print the sorted list
        System.out.println("Sorted list: " + al);
	}

}
